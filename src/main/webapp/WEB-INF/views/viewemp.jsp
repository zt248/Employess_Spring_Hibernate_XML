<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Employees List</h1>



<table border="1">

    <th>id</th>
    <th>country</th>
    <th>city</th>
    <th>street</th>
    <th>postCode</th>
    <th>Delete</th>
    <c:forEach items="${list}" var="address">
        <tr>
            <td>${address.id}</td>
            <td>${address.country}</td>
            <td>${address.city}</td>
            <td>${address.street}</td>
            <td>${address.postCode}</td>
            <td><a href="<c:url value="/delete/${address.id}"/>">Delete</a> </td>
        </tr>
    </c:forEach>


    <a href="/viewemp/1">1</a>
    <a href="/viewemp/2">2</a>
    <a href="/viewemp/3">3</a>

</table>