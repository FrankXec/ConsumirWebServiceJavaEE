<%-- 
    Document   : error
    Created on : 29 jun 2022, 13:36:26
    Author     : Frank
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>ACA CAERAN TODOS LOS ERRORES !</h1>
        <%= exception.getMessage() %>
    </body>
</html>
