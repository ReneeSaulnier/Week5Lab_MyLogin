<%-- 
    Document   : home
    Created on : 30-Jan-2023, 11:46:34 AM
    Author     : Renee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <h2>Hello ${user.username}</h2>
        <a href="login?logout" name="logout" value="logout">Log out</a> 
    </body>
</html>
