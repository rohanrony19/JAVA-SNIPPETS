<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!--<!doctype html>-->
<html lang="en" xmlns="http://www.w3.org/1999/html" xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Home</title>
</head>
<body>
<script src="index.js"></script>
<div>
    <center>
        <form action="register" method="post">
    <div class="row g-3 align-items-center">
        <h1 style="color:green">Sign Up</h1>
        <div class="col-auto">
            <div>
                <div class=" p-5 shadow-lg w-75 mb-5 rounded">
                    <h3 class="fw-bold display-4 text-center text-danger mb-3">Register Form</h3>

                    <c:if test="${not empty errors}">
                        <div  class="alert alert-secondary" role="alert">
                            <c:forEach var="error" items="${errors}" varStatus="loop">
                                <p>${error.defaultMessage}</p>
                            </c:forEach>
                        </div>
                    </c:if>

                </div>
            <!--<span style="color:red">${nameError}</span>-->
            <label for="nameId" class="col-form-label">Name: <span style="color:red">*</span></label>
            <input type="text" oninput="validateName()" onchange="" id="nameId" class="form-control" name="name" value="${dto.name}" required minlength="3" maxlength="10"><br/><br/>
                <span id="nameErrorId" class="text-danger"></span>

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
                <div class="col-3">
                    <label for="genderId" class="form-label">Gender</label>
                    <select class="form-select" name="gender" id="genderId" required>
                        <option value="" selected disabled>Select Gender</option>
                        <option value="male">Male</option>
                        <option value="female">Female</option>
                        <option value="other">Other</option>
                    </select>
                    <span class="text-danger" id="genderErrorId"></span>
                </div>
        </div>
        <div>
            <button style="color:green" onclick="submit">Submit</button>
        </div>
    </div>
        </div>
    </div>
        </form>
    </center>
</div>

</body>
</html>
