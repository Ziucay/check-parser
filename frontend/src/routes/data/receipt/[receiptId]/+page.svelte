<script lang="ts">
	import type { PageData } from '../../.svelte-kit/types/src/routes/$types';
	import ReceiptCalculator from '$lib/ReceiptCalculator.svelte';

	export let data: PageData;

	let receipt = data.list;
</script>

{#if receipt}
	<ReceiptCalculator {receipt} />
{/if}
