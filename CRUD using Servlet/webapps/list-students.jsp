<%@ page import="java.util.List" %>
<%@ page import="dto.Student" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Student List</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="container mt-4">
<h2>Student List</h2>
<a href="add-student.jsp" class="btn btn-primary mb-3">Add Student</a>
<table class="table table-bordered">
    <tr>
        <th>ID</th><th>Name</th><th>Email</th><th>Actions</th>
    </tr>
    <%
    List<Student> students = (List<Student>) request.getAttribute("students");
    for (Student s : students) {
    %>
    <tr>
        <td><%= s.getId() %></td>
        <td><%= s.getName() %></td>
        <td><%= s.getEmail() %></td>
        <td>
            <a href="StudentServlet?action=edit&id=<%= s.getId() %>" class="btn btn-warning btn-sm">Edit</a>
            <a href="StudentServlet?action=delete&id=<%= s.getId() %>" class="btn btn-danger btn-sm">Delete</a>
        </td>
    </tr>
    <% } %>

</table>
</body>
</html>
