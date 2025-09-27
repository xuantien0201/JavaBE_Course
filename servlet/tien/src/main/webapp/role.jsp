<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Role Management</title>
    <style>
        table { border-collapse: collapse; width: 80%; margin: 20px auto; }
        th, td { border: 1px solid #ccc; padding: 8px 12px; text-align: center; }
        th { background: #f2f2f2; }
        .action-btn { margin: 0 4px; padding: 4px 10px; }
    </style>
</head>
<body>
<h2 style="text-align:center;">Role List</h2>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Role Name</th>
        <th>Description</th>
        <th>Actions</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="r" items="${role}">
        <tr>
            <td>${r.id}</td>
            <td>${r.role_name}</td>
            <td>${r.description}</td>
            <td>
                <a class="action-btn" href="role?action=edit&id=${r.id}">Edit</a>
                <a class="action-btn" href="role?action=delete&id=${r.id}" onclick="return confirm('Are you sure?');">Delete</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
