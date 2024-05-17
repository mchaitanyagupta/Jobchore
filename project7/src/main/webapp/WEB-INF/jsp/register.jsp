<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Register</title>
</head>
<body>
    <h2>Registration Form</h2>
    <form action="/registersuccess" method="post">
        <!-- Add registration form fields here -->
        <input type="text" name="name" placeholder="name"  required><br>
        <input type="password" name="password" placeholder="Password" required><br>
        <input type="email" name="email" placeholder="Email" required><br>
        <button type="submit">Register</button>
    </form>
</body>
</html>
