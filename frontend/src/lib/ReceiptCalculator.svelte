<script lang="ts">
    import {Telegram} from 'svelte-share-buttons-component';

    enum Buyer {
        Common,
        Left,
        Right
    }

    enum Direction {
        Left = 1,
        Right = 2
    }

    //Accepts array of receipts
    export let receipt: object[];

    //Get items from each list
    let receiptItemsArray: object[] = []
    receipt.forEach((r) => {
        receiptItemsArray.push(r.ticket.document.receipt.items)
    });

    console.log(receiptItemsArray)

    //Flatten the array to get simple list of items
    let items = []
    receiptItemsArray.forEach((r) => {
        r.forEach((item) => {
            items.push(item)
        })
    });

    let buyers: Buyer[] = []
    let owedSum = 0
    let defaultColor = "transparent"
    let leftColor = "#5BC0EB"
    let rightColor = "#90A955"
    items.forEach(() => buyers.push(Buyer.Common))

    function formatItems(): string {
        let result = ""
        for (let i = 0; i < items.length; i++) {
            result += `${items[i].name} `
            result += `${items[i].quantity} `
            result += `${items[i].sum / 100} `

            if (buyers[i] === Buyer.Common) {
                result += "split\n"
            } else if (buyers[i] === Buyer.Right) {
                result += "yours\n"
            } else {
                result += "mine\n"
            }

        }
        return result
    }

    function calculate() {
        let sum = 0
        for (let i = 0; i < items.length; i++) {
            if (buyers[i] === Buyer.Common) {
                sum += (items[i].sum) / 2
            } else if (buyers[i] === Buyer.Right) {
                sum += items[i].sum
            }
        }
        owedSum = sum
    }

    function tryChangeBuyer(id: number, direction: Direction) {
        let entry = document.getElementById(`receipt-entry-${id}`)
        if (direction === Direction.Left) {
            if (buyers[id] === Buyer.Common) {
                buyers[id] = Buyer.Left
                entry.style.backgroundColor = leftColor
            } else if (buyers[id] === Buyer.Right) {
                buyers[id] = Buyer.Common
                entry.style.backgroundColor = defaultColor
            }
        } else {
            if (buyers[id] === Buyer.Common) {
                buyers[id] = Buyer.Right
                entry.style.backgroundColor = rightColor
            } else if (buyers[id] === Buyer.Left) {
                buyers[id] = Buyer.Common
                entry.style.backgroundColor = defaultColor
            }
        }
        calculate()
    }

    calculate()
</script>

<p>If entry marked in blue, then it bought fully by you. If green, by other. Otherwise, white</p>

<div>
    {#each items as items, i}
        <div style="display: flex; flex-direction: row; padding: 10px">
            <button type="submit" style="border: 0; background: transparent;"
                    on:click={() => tryChangeBuyer(i,Direction.Left)}>
                <img src="/images/arrow-left-short.svg" width="50" height="50" alt="left"/>
            </button>
            <div style="border-radius: 10px" id="receipt-entry-{i}"> {items.name} | {items.quantity}
                | {items.sum / 100} </div>
            <button type="submit" style="border: 0; background: transparent;"
                    on:click={() => tryChangeBuyer(i,Direction.Right)}>
                <img src="/images/arrow-right-short.svg" width="50" height="50" alt="right"/>
            </button>
        </div>
    {/each}
</div>

<p>Sum: {owedSum / 100}</p>
<Telegram class="share-button" text="{formatItems()} Hi, you owe me {owedSum / 100} rubles!"/>
<input type="button" value="button name" on:click={window.open(`https://t.me/share/url?url=Receipt&text=${owedSum / 100}`)} />