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
        <title>Listar / Buscar</title>
    </head>
    <body>

        <div>
            <form method="post" action="listarBuscar">
                Buscar: <input type="text" name="campoBuscar"/>
                <button type="submit">ok</button>
                
                <output>${busca.getId()}/${busca.getNome()}/${busca.getQuantidade()}/${busca.getUnidade()}/
                ${busca.getValor()}</output>
                
            </form>           
        </div>        

        <div>
            <h1>Listar</h1>
            <a href="menu.jsp">Menu</a>
            <table>
                <tr>
                    <th>id</th>
                    <th>nome</th>
                    <th>quantidade</th>
                    <th>unidade</th>
                    <th>valor</th>
                </tr>
                <c:forEach items="${listaM}" var="id" >
                    <tr>
                        <td>${id.getId()}</td>
                        <td>${id.getNome()}</td>
                        <td>${id.getQuantidade()}</td>
                        <td>${id.getUnidade()}</td>
                        <td>${id.getValor()}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>       

    </body>
</html>
