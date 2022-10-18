<h1>Welcome to Cost Accountant!</h1>
<button onclick="basicButton()">Press me!</button>
<p id="paragraph"></p>


<script>
    async function basicButton() {
        let response = await fetch("http://localhost:8080/mock/basic")
        document.getElementById("paragraph").innerText = await response.text()
    }
</script>