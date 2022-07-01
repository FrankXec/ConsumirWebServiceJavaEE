<%-- 
    Document   : login
    Created on : 29 jun 2022, 17:26:10
    Author     : Frank
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lgoin</h1>
        <form action="Login" method="POST">
            Nombre: <input type="text" name="name"/> <br/>
            Password:<input type="password" name="password"/><br/>
            <input type="submit" value="Ingresar"/>
        </form>
    </body>
</html>
