<%-- 
    Document   : Registrar
    Created on : 6 oct. 2021, 6:57:12
    Author     : Sandra Arguello M
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2>Registrar Vehiculo !</h2>
        <br /><br />
        <form action=""method="POST"autocomplete="off"> 
          
            <p>
                Placa:
                <input id="Placa " name=" N placa "type="text"/>
            </p>
            <p>
                Plaza:
                <input id="Plaza" name="Plaza"type="text"/>
            </p>
            <p>
                Hora entrada:
                <input id="Hentrada " name="Hentrada"type="text"/>
            </p>
            
            <button id="guardar" name="guardar" type="submit">Guardar</button>
           
        </form>
    </body>
</html>
