<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Add Voter</title>
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
    </style>
</head>
<body>
<div class="container">
    <h2>Add Voter</h2>
    <form action="/Online-Voting-System/voter/handleForm" method="post">
        <div class="form-group">
            <label for="voterName">Voter Name:</label>
            <input autocomplete="off" type="text" class="form-control" id="voterName" placeholder="Enter voter name" required name="voterName">
        </div>
        <div class="form-group">
            <label for="voterPassword">Voter Password:</label>
            <input autocomplete="off" type="text" class="form-control" id="voterPassword" placeholder="Enter voter password" required name="voterPassword">
        </div>
        <button type="submit" class="btn btn-primary btn-block mt-3">Add Voter</button>
    </form>
    <a class="btn btn-outline-primary btn-block mt-3" href="/Online-Voting-System/voter/displayAll">Back</a>
</div>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>
