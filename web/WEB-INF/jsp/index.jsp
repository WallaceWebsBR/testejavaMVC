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
        <h1>Controle de Processos v1.0</h1>
        <div class="col-md-6">
            <div class="form-group">
            
                <form action="consulta">
                <div class="col-xs-2">
                    Número do Processo
                    <input class="form-control" name="numeroprocesso" type="text" required style="margin-bottom: 10px">
                    <input class="btn btn-primary" type="submit" value="Consultar" >
                    <input class="btn btn-primary" type="reset" value="Limpar">    
                    <input class="btn btn-primary" type="button" value="Cadastrar Processo" onclick="location.href = '/cadastro';">
                </div>
                </form>
               </div> 
            </div>
        </div>
    </body>
</html>
