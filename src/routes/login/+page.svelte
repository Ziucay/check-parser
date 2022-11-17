<script lang="ts">
    import type { ActionData } from './$types'

    export let form: ActionData
</script>

<style>
    h1{
        text-align: center;
        font-family: "My Custom Font 1";
        text-shadow: 0 0 5px rgb(86, 86, 150), 0 0 5px blue;
        color: aliceblue;
        }

    form{
        text-align: center;
        font-size: 20px;
    }

    label{
        font-family: "My Custom Font 1";
    }

    input{
        background-color: white;
        font-family: "My Custom Font 1";
        margin-left: 1%;
        border-radius: 5px;
        width: 220px;
        height: 40px;
        font-size: 20px;
        border: 0;
        background:rgba(0, 102, 255, 0.141);
        margin:5px;
    }

    button{
        font-family: "My Custom Font 1";
        border: 0;
        background: rgb(81, 142, 240);
        color: white;    
        font-size: 16px;
        border-style: solid;
        text-rendering: auto;
        border-radius: 5px;
        margin: 10px;
        margin-left: 120px;
        min-width: 100px;
        cursor: pointer;
    }

    button:hover{
        background: #1d49aa;
    }
    button:focus{
        outline: none;
        box-shadow: 0 0 0 4px #cbd6eeb1;
    }

    p{
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

<h1>Login</h1>

<form action="?/login" method="POST">
    <div>
        <label for="username">Username:</label>
        <input id="username" name="username" type="text" required />
    </div>

    <div>
        <label for="password">Password:</label>
        <input id="password" name="password" type="password" required />
    </div>

    {#if form?.invalid}
        <p class="error">Username and password is required!</p>
    {/if}

    {#if form?.credentials}
        <p class="error">You have entered the wrong credentials!</p>
    {/if}

    <button type="submit">Log in</button>
</form>