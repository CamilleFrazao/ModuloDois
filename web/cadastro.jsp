<%-- 
    Document   : cadastro
    Created on : 30/09/2015, 15:46:39
    Author     : camille
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Bootstrap -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="http://monkeydrives.com/images/triforce-symbol-4.jpg" rel="shortcut icon" type="image/x-icon">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
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
                                <li class="disabled" ><a href="cadastro.jsp">Cadastrar</a></li>
                                <!--<li><a href="#">Something else here</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#">Separated link</a></li>
                                    <li role="separator" class="divider"></li>
                                    <li><a href="#">One more separated link</a></li>-->
                            </ul>
                        </li>

                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown" 
                               role="button" aria-haspopup="true" aria-expanded="false">Cliente <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Clientes</a></li>
                                <li class="" ><a href="cadastroCliente.jsp">Cadastrar</a></li>
                            </ul>
                            </div><!-- /.navbar-collapse -->
                            </div><!-- /.container-fluid -->
                            </nav>


                            <div>

                                <!-- cabeçalho -->
                                <div class="row">
                                    <div class="col-sm-3"></div>
                                    <div class="col-sm-6">
                                        <h1>Cadastro de Produto</h1>
                                    </div>
                                    <div class="col-sm-3"></div>
                                </div>

                                <!-- corpo -->
                                <div class="row">
                                    <div class="col-sm-3"></div>
                                    <div class="col-sm-6">
                                        <!--<p><a href="menu.jsp">Menu</a>--> 
                                    </div>
                                    <div class="col-sm-3"></div>
                                </div>

                                <!-- rodapé -->
                                <div class="row">
                                    <div class="col-sm-3"></div>
                                    <div class="col-sm-6">
                                        <form class="form-group" action="cadastrar" method="post">

                                            <div class="form-group">
                                                <label>Nome:</label>
                                                <input name="campoCadastroNome" type="text" maxlength="100" title="max 100" class="form-control" required="true">
                                            </div>
                                            <div class="form-group">
                                                <label>Quantidade:</label>
                                                <input name="campoCadastroQuantidade" type="number"

                                                       maxlength = "10"
                                                       min = "1"
                                                       max = "9999999999"

                                                       title="Valor não permitido" class="form-control" required="true">
                                            </div> 
                                            <div class="form-group">
                                                <label>Unidade:</label>
                                                <input name="campoCadastroUnidade" type="number" 

                                                       maxlength = "10"
                                                       min = "1"
                                                       max = "9999999999"

                                                       required title="Valor não permitido" class="form-control" required="true">
                                            </div>
                                            <div class="form-group">
                                                <label>Valor:</label>
                                                <input name="campoCadastroValor" type="number" 

                                                       maxlength = "22"
                                                       min = "1"
                                                       max = "9999999999999999999999"

                                                       required title="Valor não permitido" name="currency" step="0.01" size="4" class="form-control" required="true">
                                            </div>

                                            <button class="btn btn-success" type="submit">Cadastrar</button>

                                        </form>
                                    </div>
                                    <div class="col-sm-3"></div>
                                </div>

                            </div>

                            <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
                            <!-- Include all compiled plugins (below), or include individual files as needed -->
                            <script src="js/bootstrap.min.js"></script>

                            </body>
                            </html>


