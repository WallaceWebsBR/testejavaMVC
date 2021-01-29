<%-- 
    Document   : cadastro
    Created on : 27/01/2021, 19:16:44
    Author     : WallaceWebs
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tela de Cadastro</title>
        <link href="<c:url value="res/estilo.css"/>" rel="stylesheet" type="text/css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="container">
            <div class="jumbotron">
        <h1>Cadastro de Processos v1.0</h1>
        
                <div class="form-group">
                    <h1 class="display-4">Tipo de Processo</h1>
        <div class="col-md-6">
            <div class="row">
    <div class="col-sm">
        <form action="cadastratipoprocesso" method="post">

            Nome: <input class="form-control" name="tipoprocesso" type="text">
    </div>
                
    <div class="col-sm"><input class="btn btn-primary" type="submit" value="Cadastrar" style="margin-top: 22px"></div>
        </form>
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
                                <c:forEach items="${lista}" var="tp">
                                    <tr>
                                     <td>${tp.id}</td>
                                     <td>${tp.tipoprocesso}</td>
                                     <td><a href="/editarTipoProcesso?id=${tp.id}">Editar</a> / <a href="/deletarTipoProcesso?id=${tp.id}">Apagar</a></td>
                                    </tr>
                                    </c:forEach>
                            </tbody>
                          </table>
                    </fieldset>
            <form method="POST" action="cadastrar">
                    <h1>Processo</h1>
                    Tipo de Processo:
                    <select class="form-select" data-size="2" name="tipoprocesso">
                                    <c:forEach items="${lista}" var="tp">
                                    <option>${tp.tipoprocesso}</option>
                                    </c:forEach>
                    </select><br>
                    Nome Processo: <input type="text" name="nomeprocesso" class="form-control">
                    Numero Processo: <input type="text" name="numeroprocesso" class="form-control">
                    Data de Entrada: <input type="date" name="dataentrada" class="form-control">
                    Valor do Recurso: <input type="text" name="valorrecurso" class="form-control">
                    Objetivo <input type="text" name="objetivo" class="form-control">
                    <input type="submit" label="Enviar">
            </form>
            </div>
        </div>
        </div>
        ${dados}
    </body>
</html>
