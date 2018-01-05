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

<script>
    var url = <c:url value="/address/addSt-ajax"/>
    var addressForm = document.getElementById("addressForm");
    addressForm.onsubmit = function (ev) {
        ev.preventDefault();
        var xhr = new XMLHttpRequest();
        xhr.open('POST', url, false);
        xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
        var formData = new FormData(document.getElementById("addressForm"))
        xhr.send(formData);
        console.log(xhr.response)
        return false; // To avoid actual submission of the form
    }
</script>

</body>
</html>
<%--<%=  new java.util.Date() %>--%>
