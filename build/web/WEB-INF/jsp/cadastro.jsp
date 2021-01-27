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
        <h1>Cadastro de Processos</h1>
        <div>
            <form>
                <div class="form-group">
                Processo <input type="text" name="processo" class="form-control">
                <input type="submit" label="Enviar">
            </form>
        </div>
    </body>
</html>
