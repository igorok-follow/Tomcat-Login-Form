<%@ page import="java.util.Date" %>

<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login form</title>
    <style>
        <%@ include file="mainPageStyle.css"%>
    </style>
</head>
<body>
    <div class="centerTitle">
        <p style="font-size: 2em;">Hello, User!</p>
        <p style="font-size: 1em;">Current date: <%= new Date() %>.</p>
    </div>
    <fieldset>
        <legend>Enter field</legend>
        <form action="/webapp/main_servlet" method="post">
            Enter your name:
            <input type="text" name="name" placeholder="Name" />
            <input type="text" name="age" placeholder="Age" />
            <input type="submit" value="Send..." />
        </form>
    </fieldset>

</body>
</html>
