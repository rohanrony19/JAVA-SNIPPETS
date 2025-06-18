<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Login</title>
</head>
<body>
<ul class="nav nav-tabs" id="myTab" role="tablist">
    <li class="nav-item" role="presentation">
        <button class="nav-link active" id="home-tab"  type="button"><a href="index.jsp">Home</a></button>
    </li>
    <li class="nav-item" role="presentation">
        <button class="nav-link" id="profile-tab" type="button" ><a href="Login.jsp">Login</a></button>
    </li>
    <li class="nav-item" role="presentation">
        <button class="nav-link" id="disabled-tab" type="button" ><a href="Register.jsp">Register</a></button>
    </li>
</ul>
<center>

        <h1>Login</h1>
        <div>
            <form action="Login" method="post">
                <label for="one">Email id:</label>
                <input type="email" id="one" placeholder="Enter Email ID" name="email" required>
                <label for="two">Password:</label>
                <input type="password" id="two" placeholder="Enter Password" name="password" required>
            <div>
            <button onclick="submit" type="submit">Submit</button>
            </div>
            </form>
        </div>
</center>

</body>
</html>