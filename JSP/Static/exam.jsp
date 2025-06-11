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
    <form action="College" class="row g-3 needs-validation" novalidate>
        <div class="col-md-4 position-relative">
            <label for="validationTooltip01" class="form-label">Full Name</label>
            <input type="text" class="form-control" id="validationTooltip01" name="fullName" required>
            <div class="valid-tooltip">
                Looks good!
            </div>
        </div>
        <div class="col-md-4 position-relative">
            <label for="validationTooltip02" class="form-label">Branch</label>
            <input type="text" class="form-control" id="validationTooltip02" name="branch" required>
        </div>
        <div class="col-md-4 position-relative">
            <label for="validatio1" class="form-label">Email</label>
            <input type="email" class="form-control" id="validatio1" name="subject2" required>
        </div>
        <div class="col-md-4 position-relative">
            <label for="validation3" class="form-label">Subject 1</label>
            <input type="text" class="form-control" id="validation3" name="subject1" required>
        </div>
        <div class="col-md-4 position-relative">
            <label for="validationTooltip4" class="form-label">Subject 2</label>
            <input type="text" class="form-control" id="validationTooltip4" name="subject2" required>
        </div>
        <div class="col-md-4 position-relative">
            <label for="validation5" class="form-label">Subject 3</label>
            <input type="text" class="form-control" id="validation5" name="subject3" required>
        </div>
        <div class="col-md-4 position-relative">
            <label for="validation6" class="form-label">Subject 4</label>
            <input type="text" class="form-control" id="validation6" name="subject4" required>
        </div>
        <div class="col-md-4 position-relative">
            <label for="validation7" class="form-label">Subject 5</label>
            <input type="text" class="form-control" id="validation7" name="subject5" required>
        </div>
        <div class="col-md-4 position-relative">
            <label for="validationTooltipUsername" class="form-label">Email</label>
                <input type="email" class="form-control" id="validationTooltipUsername" name="email" required>
                <div class="invalid-tooltip">
                    Please Enter the valid email.
                </div>
            </div>
        <div class="col-12">
            <button class="btn btn-primary" type="submit">Submit form</button>
        </div>
    </form>
</center>
</body>
</html>