<script lang="ts" context="module">
    export async function load({ fetch }) {
        const response = await fetch('https://jsonplaceholder.typicode/posts');
        const data = await response.json();

        if (response.ok) {
            return {
                props: {
                    data
                }
            }
        }

        return {
            status: response.status,
            error: new Error("Couldn't get receipt list")
        }
    }
</script>

<script lang="ts">
    export let data = [];
</script>


<h1>Welcome to Cost Accountant!</h1>

<ul>
    {#each data as item}
        <li>{item.name}</li>
    {/each}
</ul>
