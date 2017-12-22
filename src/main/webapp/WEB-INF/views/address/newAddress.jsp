<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>NewEmployees</title>

</head>
<body>


<%--<form:form method="post" id="addressForm" action="/address/addAddress" enctype="multipart/form-data">--%>
<form:form method="post" id="addressForm" action="/address/addSt-ajax" enctype="multipart/form-data">
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



<script src="https://code.jquery.com/jquery-3.1.1.min.js"/>

<script>
    var form = document.getElementById('addressForm');
    var url = <c:url value="/address/addSt-ajax"/>
        form.onsubmit = function () {
            var formData = new FormData(form)
            var xhr = new XMLHttpRequest();
            // xhr.open('POST', form.getAttribute('action'), false);
            xhr.open('POST', url, false);
            xhr.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded');
            xhr.send(formData);
            return false; // To avoid actual submission of the form
        }
</script>


</body>
</html>
