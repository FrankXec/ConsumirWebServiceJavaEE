<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de Usuarios</h1>
        <table border="1">
            <tr>
                <td>ID</td>
                <td>Name</td>
                <td>Lastname</td>
                <td>Nickname</td>
                <td>Email</td>
            </tr>
            <c:forEach items="${users}" var="item">
                <tr>
                    <td><c:out value="${item.id}"/></td>
                    <td><c:out value="${item.name}"/></td>
                    <td><c:out value="${item.lastName}"/></td>
                    <td><c:out value="${item.nickName}"/></td>
                    <td><c:out value="${item.email}"/></td>
                </tr>
            </c:forEach>
        </table>
        <br/>
        <h2>Usuario</h2>
        ID: <c:out value="${user.id}"/> <br/>
        Name: <c:out value="${user.name}"/> <br/>
        Lastname: <c:out value="${user.lastName}"/> <br/>
        Nickname: <c:out value="${user.nickName}"/> <br/>
        Email: <c:out value="${user.email}"/> <br/>
        <hr/>
        Actualizado: <c:out value="${update}" /> <br/>
        Creado: <c:out value="${create}"/><br/>
        Borrado: <c:out value="${delete}"/><br/>
    </body>
</html>
