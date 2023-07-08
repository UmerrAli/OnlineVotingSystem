<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Admin Login</title>
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
  <h2>Admin Login</h2>
  <form>
    <div class="form-group">
      <label for="adminUsername">Username:</label>
      <input type="text" class="form-control" id="adminUsername" placeholder="Enter admin username" required>
    </div>
    <div class="form-group">
      <label for="adminPassword">Admin Password:</label>
      <input type="password" class="form-control" id="adminPassword" placeholder="Enter admin password" required>
    </div>
    <br>
    <button type="submit" class="btn btn-primary btn-block">Admin Login</button>
    <a href="/" class="btn btn-primary btn-block">Login as Voter</a>
  </form>
</div>

<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</body>
</html>
