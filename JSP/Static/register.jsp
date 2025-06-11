<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
</head>
<body>
<ul class="nav nav-tabs" id="myTab" role="tablist">
    <li class="nav-item" role="presentation">
        <button class="nav-link active" id="home-tab"  type="button"><a href="home.jsp">Home</a></button>
    </li>
    <li class="nav-item" role="presentation">
        <button class="nav-link" id="profile-tab" type="button" ><a href="register.jsp">Register</a></button>
    </li>
    <li class="nav-item" role="presentation">
        <button class="nav-link" id="contact-tab"  type="button" ><a href="college.jsp"> College Info</a></button>
    </li>
    <li class="nav-item" role="presentation">
        <button class="nav-link" id="disabled-tab" type="button" ><a href="Exam.jsp"> Exam Detail</a></button>
    </li>
</ul>
<center>
<h1>Registration Form</h1>
<form action="Register" class="row g-3 needs-validation" novalidate>
    <div class="col-md-4 position-relative">
        <label for="validationTooltip01" class="form-label">First name</label>
        <input type="text" class="form-control" id="validationTooltip01" name="firstName" required>
        <div class="valid-tooltip">
            Looks good!
        </div>
    </div>
    <div class="col-md-4 position-relative">
        <label for="validationTooltip02" class="form-label">Last name</label>
        <input type="text" class="form-control" id="validationTooltip02" name="lastName" required>
        <div class="valid-tooltip">
            Looks good!
        </div>
    </div>
    <div class="col-md-4 position-relative">
        <label for="validationTooltipUsername" class="form-label">Email</label>
        <div class="input-group has-validation">
            <span class="input-group-text" id="validationTooltipUsernamePrepend"></span>
            <input type="email" class="form-control" id="validationTooltipUsername" name="email" required>
            <div class="invalid-tooltip">
                Please Enter the valid email.
            </div>
        </div>
    </div>
    <div class="col-md-6 position-relative">
        <label for="validationTooltip03" class="form-label">City</label>
        <input type="text" class="form-control" id="validationTooltip03" required>
        <div class="invalid-tooltip">
            Please provide a valid city.
        </div>
    </div>
    <div class="col-md-3 position-relative">
        <label for="validationTooltip04" class="form-label">State</label>
        <select class="form-select" id="validationTooltip04" required>
            <option selected disabled value="">Choose...</option>
            <option>...</option>
        </select>
        <div class="invalid-tooltip">
            Please select a valid state.
        </div>
    </div>
    <div class="col-md-3 position-relative">
        <label for="validationTooltip05" class="form-label">Zip</label>
        <input type="text" class="form-control" id="validationTooltip05" required>
        <div class="invalid-tooltip">
            Please provide a valid zip.
        </div>
    </div>
    <div class="col-12">
        <button class="btn btn-primary" type="submit">Submit form</button>
    </div>
</form>
</center>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
</body>
</html>