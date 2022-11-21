<script lang="ts">
    import type {PageData} from "../../.svelte-kit/types/src/routes/$types";
    import {redirect} from "@sveltejs/kit";


    export let data: PageData;

    let fileInput;

    function openFileInNewPage()
    {
        const reader = new FileReader();

        reader.addEventListener("load", () => {
            if (typeof reader.result === "string") {
                localStorage.setItem("json", reader.result)
                redirect(302, '/distribution')
            }
        }, false);

        reader.readAsText(fileInput)
    }
</script>

<h1>Welcome to Cost Accountant!</h1>

<div class="container">
    <input class="hidden" id="file-to-upload" type="file" accept=".json" bind:this={fileInput} on:change={() => openFileInNewPage()}/>
    <button class="upload-btn" on:click={ () => fileInput.click() }>Upload </button>
</div>

<style>
    p{
        color: black;
    }

    p1{
        font-family: "My Custom Font";
    }

    p2{
		animation:error 0.5s ease;
        position:relative;
        font-family: "My Font Family 1";
    }

    .hidden {
        display: none;
    }

    .upload-btn {
        width: 128px;
        height: 32px;
        background-color: #1d49aa;
        font-family: sans-serif;
        color: white;
        font-weight: bold;
        border: none;
    }

    @keyframes error{
        0%{left:0px;}
        25%{left:20px;}
        50%{left:0px}
        70%{left:15px}
        100%{left:0px}
    }


</style>