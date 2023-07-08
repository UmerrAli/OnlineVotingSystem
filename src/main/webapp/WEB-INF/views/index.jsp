<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
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
        .btn-primary {
            background-color: #007bff;
            border-color: #007bff;
        }
        .btn-primary:hover {
            background-color: #0069d9;
            border-color: #0062cc;
        }
        .btn-admin {
            background-color: #dc3545;
            border-color: #dc3545;
        }
        .btn-admin:hover {
            background-color: #c82333;
            border-color: #bd2130;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Login</h2>
    <form>
        <div class="form-group">
            <label for="voterName">Voter Name:</label>
            <input type="text" class="form-control" id="voterName" placeholder="Enter voter name" required>
        </div>
        <div class="form-group">
            <label for="voterPassword">Voter Password:</label>
            <input type="password" class="form-control" id="voterPassword" placeholder="Enter voter password" required>
        </div>
        <button type="submit" class="btn btn-primary btn-block">Login</button>
        <button type="submit" class="btn btn-admin btn-block">Login as Admin</button>
    </form>
</div>

<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>
