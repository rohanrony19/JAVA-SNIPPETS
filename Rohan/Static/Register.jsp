<!doctype html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Register</title>
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
        <h1>Register</h1>
        <div>
        <form action="register" method="post" >

        <label for="one">First Name:</label>
        <input type="text" id="one" name="firstName" required>
        <label for="two">Last Name:</label>
        <input type="text" id="two" name="lastName" required>
        <label for="three">Age:</label>
        <input type="number" id="three" name="age" required>
        <label>Gender:</label>
        <label for="male">Male</label>
        <input type="radio" id="male" value="male" name="gender" required>
        <label for="female">Female</label>
        <input type="radio"  id="female" value="female" name="gender" required>
        <label for="four">Phone Number:</label>
        <input type="number" id="four" name="mobile" required>
        <div>
            <button onclick="submit" type="submit">Submit</button>
        </div>
        </form>
        </div>
    </center>
</body>
</html>