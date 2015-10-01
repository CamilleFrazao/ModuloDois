<%-- 
    Document   : cadastro
    Created on : 30/09/2015, 15:46:39
    Author     : camille
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <h1>Cadastro de Produto</h1>
        
        <form method="post" action="cadastrar">
            Id: <input name="campoCadastroId" type="text"/>
            Nome: <input name="campoCadastroNome" type="text"/>
            Quantidade: <input name="campoCadastroQuantidade" type="text"/>
            Unidade: <input name="campoCadastroUnidade" type="text"/>
            Valor: <input name="campoCadastroValor" type="text"/>
        </form>
        
    </body>
</html>


