<script lang="ts">
    import {page} from '$app/stores'
    import type {PageData} from "../../.svelte-kit/types/src/routes/$types";

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
    items.forEach(() => buyers.push(Buyer.Common))

    function tryChangeBuyer(id: number, direction: Direction) {
        if (direction === Direction.Left) {
            if (buyers[id] === Buyer.Common) {
                buyers[id] = Buyer.Left
            } else if (buyers[id] === Buyer.Right) {
                buyers[id] = Buyer.Common
            }
        } else {
            if (buyers[id] === Buyer.Common) {
                buyers[id] = Buyer.Right
            } else if (buyers[id] === Buyer.Left) {
                buyers[id] = Buyer.Common
            }
        }
    }

    function calculate(){
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

    calculate()

</script>

<div>
    {#each items as items, i}
        <div style="display: flex; flex-direction: column">
            <button on:click={tryChangeBuyer({i},1)}>Bought by me</button>
            <div>{items.name} | {items.quantity} | {items.sum}</div>
            <button on:click={tryChangeBuyer({i},2)}>Bought by other</button>
        </div>
    {/each}
</div>

<p>Sum: {owedSum}</p>