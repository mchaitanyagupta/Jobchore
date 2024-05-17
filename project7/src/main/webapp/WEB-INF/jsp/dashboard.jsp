<html xmlns:th="http://www.thymeleaf.org">
    <head>
        <meta charset="UTF-8">
        <title style="color: aquamarine;">Dashboard</title>
    </head>
    <body style="background-color: azure;">
        <h2 style="margin-top: 0; font-family: 'Franklin Gothic Medium', 'Arial Narrow', Arial, sans-serif; color: mediumorchid;">
            Welcome <span th:text="${un}"></span> to "JobChore" Online Job Portal
        </h2>
        <nav>
            <ul>
                <li><a href="">JobChore</a></li>
                <li><a href="">Dashboard</a></li>
                <li><a href="">Openings</a></li>
                <li><a href="">Applied</a></li>
                <li><a href="">profile</a></li>
            </ul>
        </nav>
        
    </body>
</html>