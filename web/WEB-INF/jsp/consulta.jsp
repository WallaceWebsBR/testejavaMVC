<%-- 
    Document   : consulta
    Created on : 28/01/2021, 15:58:45
    Author     : WallaceWebs
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="link"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta de Processos</title>
        <link href="res/estilo.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="container">
            <h1>Dados do Processo: ${numeroprocesso}</h1><br>
            <table class="table table-hover">
                <thead>
                    <th>ID</th>
                    <th>Tipo Processo</th>
                    <th>Número do Processo</th>
                    <th>Nome do Processo</th>
                    <th>Data de Entrada</th>
                    <th>Valor do Recurso</th>
                    <th>Objetivo</th>
                </thead>
                <tbody>
                <link:forEach items="${lista}" var="tp">
                <tr>
                    <td>${tp.id}</td> 
                    <td>${tp.tipoprocesso}</td>
                    <td>${tp.numeroprocesso}</td>
                    <td>${tp.nomeprocesso}</td>
                    <td>${tp.dataentrada}</td>
                    <td>R$ ${tp.valorrecurso}</td>
                    <td>${tp.objetivo}</td>
                </tr>
                </link:forEach>
                </tbody>
            </table>
            <h1>Editar Processo:</h1>
            <div class="col-md-6">
            <div class="row">
                    <div class="col-sm">
                        <form method="get" action="editar">
                            Digite a ID: <input class="form-control" type="text" name="id" required>
                             <button type="submit" class="btn btn-primary">Editar Processo</button>    
                        </form>
                </div>
            </div>
            </div><br><br>
            <input class="btn btn-primary" type="button" value="Cadastrar Processo" onclick="location.href = '/cadastro'">
            <input class="btn btn-primary" type="button" value="Voltar" onclick="location.href = '/index'">
        </div>
    </body>
</html>
