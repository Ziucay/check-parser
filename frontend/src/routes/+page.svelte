<h1>Welcome to Cost Accountant!</h1>
<script lang="ts">
    async function basicButton() {
        let response = await fetch("http://localhost:8080/mock/basic")
        let data: string = await (await response.text())

        return `List: ${data}`
    }
</script>

{#await basicButton()}
    <p>Waiting for a fact...</p>
{:then data}
    <p>{@html data}</p>
{:catch error}
    <p>An error occurred!</p>
{/await}
