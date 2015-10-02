<%-- 
    Document   : listarBuscar
    Created on : 01/10/2015, 10:35:56
    Author     : camille
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <div>
            <h1>Listar</h1>
            <table>
                <tr>
                    <th>id</th>
                    <th>nome</th>
                    <th>quantidade</th>
                    <th>unidade</th>
                    <th>valor</th>
                </tr>

                <tr>
                    <c:forEach items="${listaM}" var="id" >
                        <td>${id.getId()}</td>
                        <td>${id.getNome()}</td>
                        <td>${id.getQuantidade()}</td>
                        <td>${id.getUnidade()}</td>
                        <td>${id.getValor()}</td>
                    </c:forEach>

                </tr>
            </table>
        </div>       

    </body>
</html>
