<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>NewEmployees</title>
</head>
<body>

<form:form method="post" action="/address/addAddress">

    <table>
        <tr>
            <td><form:label path="Country">Country</form:label></td>
            <td><form:input path="country"/></td>
        </tr>
            <tr>
            <td><form:label path="City">City</form:label></td>
            <td><form:input path="city"/></td>
            </tr>
            <tr>
            <td><form:label path="Street">Street</form:label></td>
            <td><form:input path="street"/></td>
            </tr>
            <tr>
            <td><form:label path="PostCode">PostCode</form:label></td>
            <td><form:input path="postCode"/></td>
            </tr>
            <tr>
            <td colspan="2">
            <input type="submit" value="Submit"/>
            </td>
            </tr>
    </table>

</form:form>
</body>
</html>
