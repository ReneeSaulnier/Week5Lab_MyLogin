<%-- 
    Document   : login
    Created on : 30-Jan-2023, 11:46:20 AM
    Author     : Renee
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form action="login" method="post">
            Username: <input type="text" name="username" value="${username}">
            <br>
            Password: <input type="text" name="password" value="${password}">
            <br>
            <input type="submit" value="Log in"/>
        </form>
       ${errorMessage}
    </body>
</html>
