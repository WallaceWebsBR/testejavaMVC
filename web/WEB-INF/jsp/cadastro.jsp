<%-- 
    Document   : cadastro
    Created on : 27/01/2021, 19:16:44
    Author     : WallaceWebs
--%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="link" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tela de Cadastro</title>
        <link href="<link:url value="res/estilo.css"/>" rel="stylesheet" type="text/css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="container">
            <div class="jumbotron">
        <h1>Cadastro de Processos v1.0</h1>
        <form method="Post">
                <div class="form-group">
                    <h1 class="display-4">Tipo de Processo</h1>
        <div class="col-md-6">
            <div class="row">
    <div class="col-sm">
            Nome: <input class="form-control" name="tipoprocesso" type="text">
    </div>
                
    <div class="col-sm">
             <input class="btn btn-primary" type="submit" value="Cadastrar" style="margin-top: 22px">
    </div>
    </div>
     
            </div>         <fieldset>
                          <table class="table table-hover">
                            <thead>
                              <tr>
                                <th>ID</th>
                                <th>Nome</th>
                                <th>Ação</th>
                              </tr>
                            </thead>
                            <tbody>
                              <tr>
                                <td>1</td>
                                <td>Nome1 de Processo</td>
                                <td>Editar / Apagar</td>
                              </tr>
                              <tr>
                                <td>2</td>
                                <td>Nome2 de Processo</td>
                                <td>Editar / Apagar</td>
                              </tr>
                            </tbody>
                          </table>
                    </fieldset>
                    <h1>Processo</h1>
                    Nome: <input type="text" name="tipoprocesso" class="form-control">
                    
                    <input type="submit" label="Enviar">
            </form>
            </div>
        </div>
        </div>
    </body>
</html>
