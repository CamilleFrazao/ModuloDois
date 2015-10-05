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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>

        <div class="row col-md-3 col-md-offset-3">
            <h1>Cadastro de Produto</h1>

            <div class="row col-md-3 col-md-offset-0">

                <br><a href="menu.jsp">Menu</a>   

            </div>

        </div>

        <div class="row col-md-6 col-md-offset-3">

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


    </body>
</html>


