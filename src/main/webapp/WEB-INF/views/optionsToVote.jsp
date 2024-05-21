<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Vote</title>
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
    </style>
</head>
<body>
<div class="container">
    <h2 class="text-center mt-4">Vote for Poll: ${poll.pollName}</h2>
    <form action="/Online-Voting-System/voteCount/addVote" method="post">
        <div class="form-group">
            <label for="selectedOption">Select Option:</label>
            <select class="form-control" id="selectedOption" name="selectedOption">
                <c:forEach items="${options}" var="option">
                    <option value=${option.optionId}>${option.optionName}</option>
                </c:forEach>
            </select>
            <input type="hidden" value="${poll.pollId}" name="pollId">
        </div>
        <input type="number" name="pollId" value="${pollId}" hidden>
        <button type="submit" class="btn btn-primary">Vote</button>
    </form>
</div>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>
