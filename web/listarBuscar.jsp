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
        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar / Buscar</title>
    </head>
    <body>

        <div class="row col-md-3 col-md-offset-3">
            <h1>Listar</h1>
            <a href="menu.jsp">Menu</a>
        </div>

        <div class="row col-md-6 col-md-offset-3">
            <form class="form-group" method="post" action="listarBuscar">

                <div class="form-group">
                    <label>Buscar:</label>
                    <input type="text" class="form-control">
                </div>                
                
                    <button type="submit" class="btn btn-success">ok</button>
                
                <div>
                    <output class="form-group">${busca.getId()}/${busca.getNome()}/${busca.getQuantidade()}/${busca.getUnidade()}/
                        ${busca.getValor()}</output>                    
                </div>
            </form>           
        </div>        

        <div class="row col-md-6 col-md-offset-3">           
            <table class="table table-bordered">
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
