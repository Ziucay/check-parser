<script lang="ts">
    import {page} from '$app/stores'
    import type {PageData} from "../../.svelte-kit/types/src/routes/$types";

    export let data: PageData;

    let receipts = data.list

</script>

{#if $page.data.user}
    <p>Welcome {$page.data.user.name}!</p>
{/if}

<p> This is your list of receipts:</p>

<table>
    {#each receipts as {_id, createdAt, ticket}, i}
        <tr>
            <th>_id</th>
            <th>createdAt</th>
            <th>ticket.document.receipt.totalSum</th>
        </tr>
    {/each}
</table>
