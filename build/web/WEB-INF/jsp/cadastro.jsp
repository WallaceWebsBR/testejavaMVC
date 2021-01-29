<%-- 
    Document   : cadastro
    Created on : 27/01/2021, 19:16:44
    Author     : WallaceWebs
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="link"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tela de Cadastro</title>
        <link href="<link:url value="res/estilo.css"/>" rel="stylesheet" type="text/css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
        <script src="../../res/jquery.min.js" type="text/javascript"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <!--<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script> -->
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
                                <link:forEach items="${lista}" var="tp">
                                    <tr>
                                     <td>${tp.id}</td>
                                     <td>${tp.tipoprocesso}</td>
                                     <td>
                                         <button type="button" class="btn btn-primary editbtn" >Editar</button>
                                         <button type="button" class="btn btn-danger" onclick="deletar(${tp.id})">Apagar</button>
                                     </td>
                                    </tr>
                                    </link:forEach>
                            </tbody>
                          </table>
                    </fieldset>
            <form method="POST" action="cadastrar">
                    <h1>Processo</h1>
                    Tipo de Processo:
                    <select class="form-select" data-size="2" name="tipoprocesso">
                                    <link:forEach items="${lista}" var="tp">
                                    <option>${tp.tipoprocesso}</option>
                                    </link:forEach>
                    </select><br>
                    Nome Processo: <input type="text" name="nomeprocesso" class="form-control" required>
                    Numero Processo: <input type="text" name="numeroprocesso" class="form-control" required>
                    Data de Entrada: <input type="date" name="dataentrada" class="form-control" required>
                    Valor do Recurso: <input type="text" name="valorrecurso" class="form-control" required>
                    Objetivo <input type="text" name="objetivo" class="form-control">
                    <input class="btn btn-primary" type="button" value="Consultar" onclick="location.href = '/index'">
                    <input class="btn btn-primary" type="submit" value="Cadastrar Processo">
            </form>
            </div>
        </div>
        <script>
function httpGetAsync(theUrl, callback)
{
    var xmlHttp = new XMLHttpRequest();
    xmlHttp.onreadystatechange = function() { 
        if (xmlHttp.readyState == 4 && xmlHttp.status == 200)
            console.log("OK!");
    }
    xmlHttp.open("GET", theUrl, true); // true for asynchronous 
    xmlHttp.send(null);
}
$('.editbtn').click(function () {
              var currentTD = $(this).parents('tr').find('td');
              if ($(this).html() == 'Editar') {
                  currentTD = $(this).parents('tr').find($("td").not(":nth-child(1)").not(":nth-child(3)"));
                  $.each(currentTD, function () {
                      $(this).prop('contenteditable', true).css({
                        'background':'#fff',
                        'color':'#000'
                        });
                  });
              } else {
                 $.each(currentTD, function () {
                      $(this).prop('contenteditable', false).removeAttr("style");
                      lastid = $(this).parent().children().eq(0).html();
                      newvalue = $(this).parent().children().eq(1).html();
                      httpGetAsync("updatetipoprocesso?id=" + lastid + "&tipoprocesso=" + newvalue, status);
                      console.log(status);
                  });
              }
    
             $(this).html($(this).html() == 'Editar' ? 'Salvar' : 'Editar')
              if ($(this).html() == 'Salvar'){
                $(this).prop('contenteditable',false);
              }
    
          });
          </script>
          <script>
          function deletar(id) {
  return window.location="/removertipoprocesso?id=" + id;
}
              
          </script>
        </div>
    </body>
</html>
