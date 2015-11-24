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
        <h1>Editar</h1>
        
        ${editar.getId()}
        
        <form class="form-group" action="editar" method="post">

                        <div class="form-group" >
                            <label>Id:</label>
                            <input  name="campoCadastroID" type="text" class="form-control" value="${editar.getId()}"/>
                        </div>    
                        <div class="form-group">
                            <label>Nome:</label>
                            <input name="campoCadastroNome" type="text" class="form-control" value="${editar.getNome()}"/>
                        </div>
                        <div class="form-group">
                            <label>Quantidade:</label>
                            <input name="campoCadastroQuantidade" type="text" class="form-control" value="${editar.getQuantidade()}"/>
                        </div> 
                        <div class="form-group">
                            <label>Unidade:</label>
                            <input name="campoCadastroUnidade" type="text" class="form-control" value="${editar.getUnidade()}"/>
                        </div>
                        <div class="form-group">
                            <label>Valor:</label>
                            <input name="campoCadastroValor" type="text" class="form-control" value="${editar.getValor()}"/>
                        </div>

                        <button class="btn btn-success" type="submit">Cadastrar</button>

                    </form>
        </div>
        
    </body>
</html>
