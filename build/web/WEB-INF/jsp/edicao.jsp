<%-- 
    Document   : edicao
    Created on : 29/01/2021, 13:54:49
    Author     : WallaceWebs
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="link"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editando Processo ID:${id.id}</title>
        <link href="<link:url value="res/estilo.css"/>" rel="stylesheet" type="text/css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    </head>
    <body>
        <h1>Edição de Processos</h1>
        <div class="container">
            <div class="form-group">
             <form method="POST" action="cadastrar"><link:forEach items="${dados}" var="tp">
                    <h1>Processo ID:${id.id}</h1>
                    Tipo de Processo:
                    <select class="form-select" data-size="2" name="tipoprocesso">
                                    <option>${tp.tipoprocesso}</option>
                    
                    </select><br>
                    Nome Processo: <input type="text" name="nomeprocesso" class="form-control" value="${tp.nomeprocesso}">
                    Numero Processo: <input type="text" name="numeroprocesso" class="form-control" value="${tp.numeroprocesso}">
                    Data de Entrada: <input type="date" name="dataentrada" class="form-control" value="${tp.dataentrada}">
                    Valor do Recurso: R$<input type="text" name="valorrecurso" class="form-control" value="${tp.valorrecurso}">
                    Objetivo <input type="text" name="objetivo" class="form-control" value="${tp.objetivo}">
                    <input class="btn btn-primary" type="submit" label="Editar">
                    <input class="btn btn-primary" type="reset" value="Resetar">
                    <input class="btn btn-danger" type="submit" value="Deletar Processo" onclick="location.href = '/deletarprocesso?id=${id.id}'">
                    <input class="btn btn-primary" type="button" value="Voltar" onclick="window.location=document.referrer">
                    </link:forEach>
            </form>
            </div>
        </div>
    </body>
</html>
