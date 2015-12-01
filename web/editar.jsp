<%-- 
    Document   : editar
    Created on : 12/10/2015, 11:00:44
    Author     : Camille
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
        <title>Editar</title>
    </head>
    <body>

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


        <h1>Editar</h1>

        <form class="form-group" action="editar" method="post">

            <div class="form-group" >
                <label>Id:</label>
                <output  name="campoCadastroID" type="text" class="form-control" value="${editar.getId()}">${editar.getId()}</output>
            </div>    
            <div class="form-group">
                <label>Nome:</label>
                <input name="campoCadastroNome" type="text" class="form-control" value="${editar.getNome()}" required="true"/>
            </div>
            <div class="form-group">
                <label>Quantidade:</label>
                <input name="campoCadastroQuantidade" type="text" class="form-control" value="${editar.getQuantidade()}" required="true"/>
            </div> 
            <div class="form-group">
                <label>Unidade:</label>
                <input name="campoCadastroUnidade" type="text" class="form-control" value="${editar.getUnidade()}" required="true"/>
            </div>
            <div class="form-group">
                <label>Valor:</label>
                <input name="campoCadastroValor" type="text" class="form-control" value="${editar.getValorForm()}" required="true"/>
            </div>

            <button class="btn btn-success" type="submit">Cadastrar</button>

        </form>
    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>

</body>
</html>
