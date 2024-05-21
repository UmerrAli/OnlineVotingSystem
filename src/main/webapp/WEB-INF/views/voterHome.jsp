<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Voter Home</title>
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
        .poll-table {
            margin-bottom: 30px;
        }
        .poll-table th,
        .poll-table td {
            vertical-align: middle;
        }
        .poll-table th:last-child,
        .poll-table td:last-child {
            text-align: center;
        }
        .poll-table .btn {
            margin-right: 5px;
            padding: 0.375rem 0.75rem;
            font-size: 14px;
        }
    </style>
</head>
<body>
<div class="container">
    <h2 class="text-center mt-4">Available Polls</h2>
    <table class="table table-striped poll-table">
        <thead>
        <tr>
            <th>Poll Name</th>
            <th>Winner</th>
            <th>Status</th>
            <th>Voted/Not Voted</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${polls}" var="poll">
            <tr>
                <td>${poll.pollName}</td>
                <td><c:if test="${not empty poll.winner}">${poll.winner}</c:if><c:if test="${empty poll.winner}">N/A</c:if></td>
                <td>${poll.status ? 'Active' : 'InActive'}</td>
                <td>
                    <c:choose>
                        <c:when test="${poll.voted}">
                            <p>Voted<p>
                        </c:when>
                        <c:otherwise>
                            <p>Not Voted<p>
                        </c:otherwise>
                    </c:choose>
                </td>
                <td>
                    <c:choose>
                        <c:when test="${(poll.status)and(not poll.voted)}">
                            <a class="btn btn-primary" href="/Online-Voting-System/pollOption/toVote/${poll.pollId}">Vote</a>
                        </c:when>
                        <c:otherwise>
                            <a class="btn btn-primary disabled" disabled="disabled" href="/pollOption/toVote/${poll.pollId}">Vote</a>
                        </c:otherwise>
                    </c:choose>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>