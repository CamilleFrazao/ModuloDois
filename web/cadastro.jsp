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
                    <p><a href="menu.jsp">Menu</a> 
                </div>
                <div class="col-sm-3"></div>
            </div>

            <!-- rodapé -->
            <div class="row">
                <div class="col-sm-3"></div>
                <div class="col-sm-6">
                    <form class="form-group" action="cadastrar" method="post">

                        <div class="form-group">
                            <label>Id:</label>
                            <input name="campoCadastroID" type="text" class="form-control">
                        </div>    
                        <div class="form-group">
                            <label>Nome:</label>
                            <input name="campoCadastroNome" type="text" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Quantidade:</label>
                            <input name="campoCadastroQuantidade" type="text" class="form-control">
                        </div> 
                        <div class="form-group">
                            <label>Unidade:</label>
                            <input name="campoCadastroUnidade" type="text" class="form-control">
                        </div>
                        <div class="form-group">
                            <label>Valor:</label>
                            <input name="campoCadastroValor" type="text" class="form-control">
                        </div>

                        <button class="btn btn-success" type="submit">Cadastrar</button>

                    </form>
                </div>
                <div class="col-sm-3"></div>
            </div>

        </div>

    </body>
</html>


