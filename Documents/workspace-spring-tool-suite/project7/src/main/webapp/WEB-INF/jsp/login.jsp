<html lang="en">
    <head><title>Login page</title></head>
    <body>
        <h2>Login</h2>
        <div th:if="${error}" style="color: red;">
            <p th:text="${error}"></p>
        </div>
        <form action="loginn" method="post">
            <input type="email" name="email" th:value="${ema}" placeholder="Email" required><br>
            <input type="password" name="password" placeholder="password" required><br>
            <button type="submit" value="Login" ><h4>Login</h4></button>
        </form>
        

    </body>
</html>