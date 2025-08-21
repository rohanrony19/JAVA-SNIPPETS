<%@ page import="dto.Student" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Edit Student</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="container mt-4">
<h2>Edit Student</h2>
<%
Student s = (Student) request.getAttribute("student");
%>
<form action="StudentServlet" method="post">
    <input type="hidden" name="id" value="<%= s.getId() %>">
    <div class="mb-3">
        <label>Name:</label>
        <input type="text" name="name" value="<%= s.getName() %>" class="form-control" required>
    </div>
    <div class="mb-3">
        <label>Email:</label>
        <input type="email" name="email" value="<%= s.getEmail() %>" class="form-control" required>
    </div>
    <button type="submit" class="btn btn-primary">Update</button>
    <a href="StudentServlet" class="btn btn-secondary">Back</a>
</form>
</body>
</html>
