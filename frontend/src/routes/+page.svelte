<script lang="ts">
	import type { PageData } from '../../.svelte-kit/types/src/routes/$types';
	import { redirect } from '@sveltejs/kit';
	import ReceiptCalculator from '$lib/ReceiptCalculator.svelte';

	export let data: PageData;

	let files;
	let fileReaded;

	$: if (files) {
		const reader = new FileReader();
		for (const file of files) {
			reader.readAsText(file);

			reader.onload = function () {
				if (typeof reader.result === 'string') {
					fileReaded = JSON.parse(reader.result);
				}
			};
		}
	}
</script>

<h1>Welcome to Cost Accountant!</h1>

<input accept="application/JSON" bind:files id="avatar" name="avatar" type="file" />

{#if fileReaded}
	<ReceiptCalculator receipt={fileReaded} />
{/if}

<style>
	p {
		color: black;
	}

	p1 {
		font-family: 'My Custom Font';
	}

	p2 {
		animation: error 0.5s ease;
		position: relative;
		font-family: 'My Font Family 1';
	}

	@keyframes error {
		0% {
			left: 0px;
		}
		25% {
			left: 20px;
		}
		50% {
			left: 0px;
		}
		70% {
			left: 15px;
		}
		100% {
			left: 0px;
		}
	}
</style>
