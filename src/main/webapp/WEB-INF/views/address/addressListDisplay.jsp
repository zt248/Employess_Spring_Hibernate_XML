<%@ page contentType="text/html;charset=utf8" language="java"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<h2>All Employees in System</h2>
<body>
<table border="1">


    <th>id</th>
    <th>country</th>
    <th>city</th>
    <th>street</th>
    <th>postCode</th>
    <th>Delete</th>
    <c:forEach items="${listAddress}" var="address">
        <tr>
            <td>${address.id}</td>
            <td>${address.country}</td>
            <td>${address.city}</td>
            <td>${address.street}</td>
            <td>${address.postCode}</td>
            <td><a href="<c:url value="/delete/${address.id}"/>">Delete</a> </td>
        </tr>
    </c:forEach>

</table>


</body>
</html>
<%--<%=  new java.util.Date() %>--%>
