<%-- 
    Document   : login
    Created on : Jun 16, 2014, 3:59:34 PM
    Author     : Gage
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login</h1>
        <c:if test="${param.err != null}">
            <p> Invalid Username and password</p>
        </c:if>
        <c:if test="${param.logout != null}">
            <p>Successfully Logged out</p>
        </c:if>
        
        <form action="ValidateLogin" method="POST">
            <input name="username" type="text" /><br/>
            <input name="password" type="password" /><br />
            <input type="submit" value="Login"/>
        </form>
    </body>
</html>
