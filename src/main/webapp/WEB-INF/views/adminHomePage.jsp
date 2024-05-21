<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Admin Home</title>
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
        .btn-primary {
            background-color: #007bff;
            border-color: #007bff;
        }
        .btn-primary:hover {
            background-color: #0069d9;
            border-color: #0062cc;
        }
        .manage-voter-button {
            margin-bottom: 20px;
        }
        .table th,
        .table td {
            vertical-align: middle;
        }
        .table th:last-child,
        .table td:last-child {
            text-align: center;
        }
        .table .btn {
            margin-right: 5px;
            padding: 0.375rem 0.75rem;
            font-size: 14px;
        }
        .add-polls-button {
            margin-top: 20px;
            float: right;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Admin Home</h2>
    <a href="/Online-Voting-System/voter/displayAll" class="btn btn-primary manage-voter-button">Manage Voters</a>
    <table class="table table-striped" style="margin-bottom: 30px;">
        <thead>
        <tr>
            <th>Poll Name</th>
            <th>Status</th>
            <th>Winner</th>
            <th>Actions</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${polls}" var="poll">
            <tr>
                <td>${poll.pollName}</td>
                <td>
                    <c:choose>
                        <c:when test="${poll.status}">
                            Active
                        </c:when>
                        <c:otherwise>
                            Inactive
                        </c:otherwise>
                    </c:choose>
                </td>
                <td>${poll.winner}</td>
                <td>
                    <c:choose>
                        <c:when test="${poll.status}">
                            <a class="btn btn-primary btn-sm add-pollOption-btn" href="/Online-Voting-System/pollOption/add/${poll.pollId}">Add Options</a>
                            <a class="btn btn-primary btn-sm" href="/Online-Voting-System/voteCount/result/${poll.pollId}">Calculate Result and Inactivate</a>
                        </c:when>
                        <c:otherwise>
                            <a class="btn btn-primary btn-sm disabled" href="#" disabled="disabled">Add Options</a>
                            <a class="btn btn-primary btn-sm disabled" href="#" disabled="disabled">Calculate Result and Inactivate</a>
                        </c:otherwise>
                    </c:choose>
                    <a class="btn btn-danger btn-sm" href="/Online-Voting-System/poll/deletePoll/${poll.pollId}">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <a href="/Online-Voting-System/poll/add" class="btn btn-primary add-polls-button">Add More Polls</a>
</div>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>

