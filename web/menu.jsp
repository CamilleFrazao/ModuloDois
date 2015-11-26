<%-- 
    Document   : menu
    Created on : 30/09/2015, 15:41:32
    Author     : camille
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Bootstrap -->
        <link href="http://monkeydrives.com/images/triforce-symbol-4.jpg" rel="shortcut icon" type="image/x-icon">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title>
    </head>
    <body>

        <!--love-->

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

        <!--love-->

        <!-- tudo -->
        <div>

<!--             cabeçalho 
            <div class="row">
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <h1>Menu</h1>  
                </div>
                <div class="col-sm-3"></div>
            </div>-->

<!--             corpo
            <div class="row">
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <p><a href="cadastro.jsp" >Cadastrar</a>
                    <p><a href="listarBuscar">Listar</a>
                    <p><a href="listarBuscar.jsp">Buscar</a> 
                </div>
                <div class="col-sm-3"></div>
            </div>-->

            <!-- rodapé -->
            <div>

            </div>


        </div>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <!-- Include all compiled plugins (below), or include individual files as needed -->
        <script src="js/bootstrap.min.js"></script>

    </body>
</html>
