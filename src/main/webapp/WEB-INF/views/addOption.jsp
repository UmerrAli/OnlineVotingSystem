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
            max-width: 400px;
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
        }

        .btn-primary:hover {
            background-color: #0069d9;
            border-color: #0062cc;
        }

        .back-button {
            margin-top: 20px;
        }
    </style>
</head>
<body>
<br>
<h2 class="text-center mt-4">Add Option for ${poll.pollName}</h2>
<div class="container">
    <form action="/pollOption/handleForm" method="post">
        <div class="form-group">
            <label for="optionName">Option:</label>
            <input type="text" class="form-control" id="optionName" placeholder="Enter pollOption Name" required name="optionName">
        </div>
        <input type="hidden" required name="pollId" value="${poll.pollId}">
        <button type="submit" class="btn btn-primary btn-block">Add</button>
    </form>
    <a href="#" class="btn btn-primary btn-block back-button">Back</a>
</div>

<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>

