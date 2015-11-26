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

         <nav class="navbar navbar-default">
            <div class="container-fluid">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">

                    <a class="navbar-brand" href="menu.jsp">Menu</a>
                </div>

                <!-- Collect the nav links, forms, and other content for toggling -->
                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <!--<li class="active"><a href="listarBuscar">Produtos<span class="sr-only">(current)</span></a></li>-->
                        <!--<li><a href="#">Link2</a></li>-->
                        
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" 
                               role="button" aria-haspopup="true" aria-expanded="false">Produto <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="listarBuscar">Produtos</a></li>
                                <li><a href="cadastro.jsp">Cadastrar</a></li>
                                <!--<li><a href="#">Something else here</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#">Separated link</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#">One more separated link</a></li>-->
                            </ul>
                        </li>
                    </ul>
                </div><!-- /.navbar-collapse -->
            </div><!-- /.container-fluid -->
        </nav>


        <div>

            <!-- cabeçalho -->
            <div class="row">
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <!--<h1>Listar</h1>-->  
                </div>
                <div class="col-sm-3"></div>
            </div>

            <!-- corpo-->
            <div class="row">
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <!--<p><a href="menu.jsp">Menu</a>-->
                    <!--<p><a href="cadastro.jsp">Cadastro</a>-->
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
                            <th>#</th>
                            <th>nome</th>
                            <th>quantidade</th>
                            <th>unidade</th>
                            <th>valor</th>
                            <th>opções</th>
                        </tr>
                        <c:forEach items="${listar}" var="id" >
                            <tr>
                                <td>${id.getId()}</td>
                                <td>${id.getNome()}</td>
                                <td>${id.getQuantidade()}</td>
                                <td>${id.getUnidade()}</td>
                                <td>${id.getValor()}</td>
                                <td><a href="excluirEditar?nome=${id.getNome()}" >excluir</a>  <a href="editar?nome=${id.getNome()}">editar</a></td>                               
                            </tr>
                        </c:forEach>                            
                    </table>
                </div>
                <div class="col-sm-3"></div>
            </div>
        </div>


        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="js/bootstrap.min.js"></script>

    </body>
</html>
