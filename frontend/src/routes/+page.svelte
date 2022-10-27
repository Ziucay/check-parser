<script lang="ts">
    import type {PageData} from "../../.svelte-kit/types/src/routes/$types";

    export let data: PageData;
</script>

<h1>Welcome to Cost Accountant!</h1>

{#await data}
    <p>Waiting for a fact...</p>
{:then data}
    <p>{data.test}</p>
{:catch error}
    <p>An error occurred!</p>
{/await}

<div id="reader" width="600px"></div>