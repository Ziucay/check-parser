<script lang="ts">
    import {page} from '$app/stores'
    import type {PageData} from "../../.svelte-kit/types/src/routes/$types";
    import { Telegram } from 'svelte-share-buttons-component';

    export let data: PageData;

    enum Buyer {
        Common,
        Left,
        Right
    }

    enum Direction {
        Left = 1,
        Right = 2
    }

    let receipt = data.list
    let items = receipt.ticket.document.receipt.items
    let buyers: Buyer[] = []
    let owedSum = 0
    let defaultColor = "transparent"
    let leftColor = "#5BC0EB"
    let rightColor = "#90A955"
    items.forEach(() => buyers.push(Buyer.Common))

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
                <img src="/images/arrow-left-short.svg" width="50" height="50" alt="left" />
            </button>
            <div style="border-radius: 10px" id="receipt-entry-{i}"> {items.name} | {items.quantity} | {items.sum / 100} </div>
            <button type="submit" style="border: 0; background: transparent;"
                    on:click={() => tryChangeBuyer(i,Direction.Right)}>
                <img src="/images/arrow-right-short.svg" width="50" height="50" alt="right" />
            </button>
        </div>
    {/each}
</div>

<p>Sum: {owedSum / 100}</p>
<Telegram class="share-button" text=Hi, you owe me {owedSum / 100} rubles! />
