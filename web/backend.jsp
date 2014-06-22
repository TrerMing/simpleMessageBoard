<%-- 
    Document   : backend
    Created on : Jun 16, 2014, 4:07:43 PM
    Author     : Gage
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Backend</title>
    </head>
    <body>
        <h1>Welcome "${sessionScope.username}"</h1>
        <h2> Posts </h2>
        <a href="/HelloWorld/Logout"/>Logout</a>
    </body>
</html>
