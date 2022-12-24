<script lang="ts">
	import { page } from '$app/stores';
	import type { PageData } from '../../.svelte-kit/types/src/routes/$types';

	export let data: PageData;

	let receipts = data.list;
</script>

{#if $page.data.user}
	<p>Welcome {$page.data.user.name}!</p>
{/if}

<p>This is your list of receipts:</p>

<table>
	<tr>
		<th>Receipt id</th>
		<th>Purchase date</th>
		<th>Total sum</th>
	</tr>
	{#each receipts as { _id, createdAt, ticket }, i}
		<tr>
			<td><a href="/data/receipt/{i + 1}">{_id}</a></td>
			<td>{createdAt}</td>
			<td>{ticket.document.receipt.totalSum / 100}</td>
		</tr>
	{/each}
</table>

<style>
	table,
	th {
		border: 1px solid;
		border-collapse: collapse;
		font-size: 18px;
	}

	th {
		background: #1d49aa;
	}
</style>
