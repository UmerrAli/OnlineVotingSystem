<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Option</title>
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
        .form-group label {
            font-weight: bold;
        }
        .btn-primary {
            background-color: #007bff;
            border-color: #007bff;
            width: 120px;
        }
        .btn-primary:hover {
            background-color: #0069d9;
            border-color: #0062cc;
        }
        .back-button {
            margin-top: 20px;
        }
        .option-table {
            margin-bottom: 30px;
        }
        .option-table th,
        .option-table td {
            vertical-align: middle;
        }
        .option-table th:last-child,
        .option-table td:last-child {
            text-align: center;
        }
        .option-table .btn {
            margin-right: 5px;
            padding: 0.375rem 0.75rem;
            font-size: 14px;
        }
    </style>
</head>
<body>
<div class="container">
    <h2 class="text-center mt-4">Add Option for ${poll.pollName}</h2>
    <table class="table table-striped option-table">
        <thead>
        <tr>
            <th>Option Name</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${options}" var="option">
            <tr>
                <td>${option.optionName}</td>
                <td>
                    <button class="btn btn-danger btn-sm">Delete</button>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <br>
    <form action="/Online-Voting-System/pollOption/handleForm" method="post">
        <div class="form-group">
            <label for="optionName">Add Option</label>
            <input type="text" class="form-control" id="optionName" placeholder="Enter Option Name" required name="optionName" autocomplete="off" style="width: 200px;">
        </div>
        <input type="hidden" required name="pollId" value="${poll.pollId}">
        <button type="submit" class="btn btn-primary">Add</button>
        <a href="/Online-Voting-System/admin/home" class="btn btn-outline-primary">Back</a>
    </form>
</div>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>
