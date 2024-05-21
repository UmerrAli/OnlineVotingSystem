<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Voter Login</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <style>
        body {
            background-color: #f8f9fa;
        }
        .container {
            max-width: 400px;
            margin: 0 auto;
            margin-top: 100px;
        }
        h2 {
            text-align: center;
            margin-bottom: 30px;
        }
        .form-group label {
            font-weight: bold;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Voter Login</h2>
    <form action="/Online-Voting-System/voter/handleLogin" method="post">
        <div class="form-group">
            <label for="voterName">Voter Name:</label>
            <input autocomplete="off" type="text" class="form-control" id="voterName" placeholder="Enter voter name" required name="username">
        </div>
        <div class="form-group">
            <label for="voterPassword">Voter Password:</label>
            <input autocomplete="off" type="password" class="form-control" id="voterPassword" placeholder="Enter voter password" required name="password">
        </div>
        <br>
        <button type="submit" class="btn btn-primary btn-block">Login</button>
        <a class="btn btn-primary btn-block" href="/Online-Voting-System/admin/login">Login as Admin</a>
    </form>
</div>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>
