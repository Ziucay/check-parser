<script lang="ts">
    import {page} from '$app/stores'
    import type {PageData} from "../../.svelte-kit/types/src/routes/$types";

    export let data: PageData;

    let receipt = data.list
</script>

{#if $page.data.user}
    <p>Welcome {$page.data.user.name}!</p>
{/if}

<p> This is your receipt:</p>

{#each receipt as {ticket}, i}
    <p>{ticket.document.items[i].name} {ticket.document.items[i].quantity} {ticket.document.items[i].sum}</p>
{/each}

<p>Дата: {receipt.ticket.document.receipt.dateTime}</p>
<p>Общая сумма: {receipt.ticket.document.receipt.totalSum}</p>
