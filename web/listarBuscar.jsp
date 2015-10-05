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
        <link href="http://monkeydrives.com/images/triforce-symbol-4.jpg" rel="shortcut icon" type="image/x-icon">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listar / Buscar</title>
    </head>
    <body>

        <!-- tudo -->
        <div>

            <!-- cabeçalho -->
            <div class="row">
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <h1>Listar</h1>  
                </div>
                <div class="col-sm-3"></div>
            </div>

            <!-- corpo-->
            <div class="row">
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <p><a href="menu.jsp">Menu</a>
                    <p><a href="cadastro.jsp">Cadastro</a>
                </div>
                <div class="col-sm-3"></div>
            </div>

            <!-- rodapé -->
            <div class="row">
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <form class="form-group" method="post" action="listarBuscar">

                        <div class="form-group">
                            <label>Buscar:</label>
                            <input type="text" name="campoBuscar"class="form-control">
                        </div>                

                        <button type="submit" class="btn btn-success">ok</button>
                    </form>           
                </div>
                <div class="col-sm-3"></div>
            </div>



            <div class="row">
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <table class="table table-bordered">
                        <tr>
                            <th>id</th>
                            <th>nome</th>
                            <th>quantidade</th>
                            <th>unidade</th>
                            <th>valor</th>
                        </tr>
                        <c:forEach items="${listar}" var="id" >
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
                <div class="col-sm-3"></div>
            </div>

        </div>

    </body>
</html>
