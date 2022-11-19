<script lang="ts">
    import type {PageData} from "../../.svelte-kit/types/src/routes/$types";

    export let data: PageData;
</script>

<h1>Welcome to Cost Accountant!</h1>

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

    @keyframes error{
        0%{left:0px;}
        25%{left:20px;}
        50%{left:0px}
        70%{left:15px}
        100%{left:0px}
    }


</style>