<script lang="ts" context="module">
    export async function load({ fetch }) {
        const response = await fetch("http://localhost:8080/mock/basic")
        let data: string = await (await response.text())

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
    export let data
</script>


<h1>Welcome to Cost Accountant!</h1>

<p>{data}</p>
