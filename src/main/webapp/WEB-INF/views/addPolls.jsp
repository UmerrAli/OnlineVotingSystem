<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Poll</title>
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
<div class="container">
    <h2>Add Poll</h2>
    <form action="/Online-Voting-System/poll/handleForm">
        <div class="form-group">
            <label for="pollName">Poll Name:</label>
            <input type="text" autocomplete="off" class="form-control" id="pollName" placeholder="Enter poll name" required name="pollName">
        </div>
        <br>
        <button type="submit" class="btn btn-primary btn-block">Add</button>
    </form>
    <a href="/Online-Voting-System/admin/home" class="btn btn-outline-primary btn-block back-button">Back</a>
</div>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>

