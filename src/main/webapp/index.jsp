<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Poll Genie</title>
<style>
    body {
        font-family: Arial, sans-serif;
        text-align: center;
        margin-top: 100px;
        background-color: #f4f4f9;
    }
    h1 {
        font-size: 3em;
        color: #333;
        text-transform: uppercase;
        letter-spacing: 4px;
        margin-bottom: 20px;
        position: relative;
        display: inline-block;
    }
    h1:after {
        content: '';
        width: 80px;
        height: 5px;
        background-color: #007BFF;
        position: absolute;
        bottom: -10px;
        left: 50%;
        transform: translateX(-50%);
    }
    p {
        font-size: 18px;
        color: #666;
        margin-bottom: 40px;
    }
    .button {
        display: inline-block;
        margin: 30px 20px;
        padding: 10px 20px;
        font-size: 16px;
        color: #fff;
        background-color: #007BFF;
        border: none;
        border-radius: 5px;
        text-decoration: none;
        cursor: pointer;
        transition: background-color 0.3s;
    }
    .button:hover {
        background-color: #0056b3;
    }
</style>
</head>
<body>
    <h1>Poll Genie</h1>
    <p>The easiest way to cast your vote online</p>
    <a href="voter/login" class="button">Login as Voter</a>
    <a href="admin/login" class="button">Login as Admin</a>
</body>
</html>
