<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table border="1" cellpadding="10" cellspacing="0">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Gender</th>
            <th>Email</th>
        </tr>
        <c:forEach items="${empList}" var="emp">
            <tr>
                <td>${emp.empId}</td>
                <td>${emp.empName}</td>
                <td>${emp.gender}</td>
                <td>${emp.email}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
