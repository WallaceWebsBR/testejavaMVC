<%-- 
    Document   : index
    Created on : 27/01/2021, 18:44:43
    Author     : WallaceWebs
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro de Processos v1.0</title>
        <link href="res/estilo.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
    </head>
    <body><div class="container">
        <h1>Cadastro de Processos v1.0</h1>
            <fieldset><legend>Busca por Número</legend>
            <div class="form-group row">
                <form action="consulta">
                <div class="col-xs-2">
                    <label for="ex1">Número</label>
                    <input class="form-control" name="numeroprocesso" type="text">
                    <input class="btn btn-primary" type="submit" value="Consultar">
                </div>
                </form>
            </div>
            </fieldset>
        </div>
    </body>
</html>
