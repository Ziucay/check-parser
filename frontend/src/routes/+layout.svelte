<script lang="ts">
	import { page } from '$app/stores';
</script>

<svelte:head>
	<title>Cost Accountant Master</title>
</svelte:head>

<body>
	<nav>
		<a href="/">Home</a>
		{#if !$page.data.user}
			<a href="/login">Login</a>
			<a href="/register">Register</a>
		{/if}

		{#if $page.data.user}
			<a href="/data">List receipts</a>

			<form action="/logout">
				<button type="submit">Log out</button>
			</form>
		{/if}
	</nav>

	<main>
		<slot />
	</main>
</body>

<style>
	@font-face {
		font-family: 'My Custom Font 1';
		src: url(sources/fonts/Nunito-Bold.ttf) format('truetype');
	}

	body {
		background-color: aliceblue;
		font-family: 'My Custom Font 1';
	}
	a {
		color: #1d49aa;
	}

	a:visited {
		color: #1d49aa;
	}

	a:focus,
	a:hover {
		color: rgb(10, 5, 103);
	}

	button {
		width: 128px;
		height: 32px;
		background-color: #1d49aa;
		font-family: sans-serif;
		color: white;
		font-weight: bold;
		border: none;
	}
</style>
