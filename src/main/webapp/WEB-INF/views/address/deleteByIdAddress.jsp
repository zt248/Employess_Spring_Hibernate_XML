<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>DeleteEmployee</title>
</head>
<body>

<form:form method="post" action="/address/removeByIdAddress">
    <table>
        <tr>
            <td> <form:label path="id">Id</form:label></td>
            <td><form:input path="id"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Button">
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>
