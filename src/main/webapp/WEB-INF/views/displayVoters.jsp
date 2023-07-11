<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Voter List</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f8f9fa;
        }

        .container {
            max-width: 800px;
            margin: 0 auto;
            margin-top: 50px;
        }

        h2 {
            text-align: center;
            margin-bottom: 30px;
        }

        .table th,
        .table td {
            vertical-align: middle;
        }

        .table th:last-child,
        .table td:last-child {
            text-align: center;
        }

        .btn-primary {
            background-color: #007bff;
            border-color: #007bff;
        }

        .btn-primary:hover {
            background-color: #0069d9;
            border-color: #0062cc;
        }

        .add-button {
            margin-top: 20px;
            float: right;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Voters List</h2>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Voter Name</th>
            <th>Password</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${voters}" var="voter">
        <tr>
            <td>${voter.voterName}</td>
            <td>${voter.voterPassword}</td>
            <td>
                <a class="btn btn-danger" href="/voter/deleteVoter/${voter.voterId}">Delete</a>
            </td>
        </tr>
        </c:forEach>
        </tbody>
    </table>
    <br>
    <a class="btn btn-primary mt-5" href="/voter/add">Add More Voters</a>
    <a class="btn btn-outline-primary mt-5" href="/admin/home">Back</a>
</div>

<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>

