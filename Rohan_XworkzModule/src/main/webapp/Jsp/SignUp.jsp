<!doctype html>
<html lang="en" xmlns="http://www.w3.org/1999/html">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Home</title>
</head>
<body>
<div>
    <center>
        <form action="SignUp" method="post">
    <div class="row g-3 align-items-center">
        <h1 style="color:green">Sign Up</h1>
        <div class="col-auto">
            <span style="color:red">${nameError}</span>
            <label for="name" class="col-form-label">Name: <span style="color:red">*</span></label>
            <input type="text" id="name" class="form-control" name="name"><br/><br/>

            <label for="phoneNumber" class="col-form-label">Phone Number: <span style="color:red">*</span></label>
            <input type="number" id="phoneNumber" class="form-control" name="phone"><br/><br/>

            <label for="email" class="col-form-label">Email: <span style="color:red">*</span></label>
            <input type="email" id="email" class="form-control" name="email"><br/><br/>

            <label for="age" class="col-form-label">Age: <span style="color:red">*</span></label>
            <input type="number" id="age" class="form-control" name="age" ><br/><br/>

            <label for="password" class="col-form-label">password: <span style="color:red">*</span></label>
            <input type="password" id="password" class="form-control" name="password" ><br/><br/>

            <label for="confirmPassword" class="col-form-label">Confirm Password: <span style="color:red">*</span></label>
            <input type="text" id="confirmPassword" class="form-control" name="confirmPassword"><br/><br/>

            <label for="address" class="col-form-label">Address: <span style="color:red">*</span></label>
            <input type="text" id="address" class="form-control" name="address"><br/><br/>

            <div class="form-check form-check-inline">
            <label class="col-form-label" for="gender">Gender: <span style="color:red">*</span></label>


                <input class="form-check-input" type="radio" name="gender" id="gender" value="male">
                <label class="form-check-label" for="male">Male</label>

                <input class="form-check-input" type="radio" name="gender" id="gender" value="female">
                <label class="form-check-label" for="female">Female</label>

                <input class="form-check-input" type="radio" name="gender" id="gender" value="other">
                <label class="form-check-label" for="other">Other</label>
            </div>
        </div>
        <div>
            <button style="color:green" onclick="submit">Submit</button>
        </div>
    </div>
        </form>
    </center>
</div>

</body>
</html>
