<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>NewEmployees</title>

</head>
<body>


<form:form method="post" id="addressForm" action="/address/addSt-ajax">
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


<%--<script src="https://code.jquery.com/jquery-3.1.1.min.js"/>--%>

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
<%--<script src="">--%>

</body>
</html>
