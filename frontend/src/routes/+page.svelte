<h1>Welcome to Cost Accountant!</h1>
<script lang="ts">
    import { load } from './+page.server'
</script>

{#await load}
    <p>Waiting for a data...</p>
{:then data}
    <p>{@html load}</p>
{:catch error}
    <p>An error occurred!</p>
{/await}
