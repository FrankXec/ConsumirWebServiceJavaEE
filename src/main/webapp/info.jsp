<%@page contentType="text/html" pageEncoding="UTF-8" errorPage="error.jsp"%>
<!-- importacion de clases 
<%
//<%@ page import="java.util.Date" >
//<%@include file="file.jsp" >
//<%@taglib uri="uri" prefix="u"> -> incluir librerias
%>
<fx:frank></fx:frank>
-->
<%
    //para utilizar los TAGS de view, podemos usar JSTL -> POM -> Java Standard Tag Library
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
            int declaracion = 0; //aca se declara 
        %>
        <%
            pageContext.setAttribute("name",value,/*extra*/PageContext.SESSION_SCOPE)
            String impresion = "aca se imprime";
        %>
        <form action="add">
            Numero 1: <input type="number" name="numero1"/>
            Numero 2: <input type="number" name="numero2"/>
            <input type="submit"/>
        </form>
        <%= new Date()%>
    </body>
</html>
