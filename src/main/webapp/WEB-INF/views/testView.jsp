<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h1>Employees List</h1>
<html>
<head>
    <thead>

    <table border="1" id="example" class="display">
        <thead>
        <th>id</th>
        <th>country</th>
        <th>city</th>
        <th>street</th>
        <th>postCode</th>
    </table>
    </thead>

    </body>
</head>
</html>

<script src="https://code.jquery.com/jquery-3.1.1.min.js">
</script>
<link rel="stylesheet" type="text/css" href="//cdn.datatables.net/1.10.0/css/jquery.dataTables.css">
<script type="text/javascript" src="//cdn.datatables.net/1.10.0/js/jquery.dataTables.js"></script>

<script type="text/javascript">

    $(document).ready(function () {
        var data = eval('${addressList}');
        var table = $('#example').DataTable({
            "aaData": data,
            "aoColumns": [
                {"mData": "id"},
                {"mData": "country"},
                {"mData": "city"},
                {"mData": "street"},
                {"mData": "postCode"}
            ],
            "paging":true,
            "pageLength":4,
            "ordering":true
        });
    });
</script>

