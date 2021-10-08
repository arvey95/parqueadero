<%-- 
    Document   : facturar
    Created on : 6 oct. 2021, 6:58:06
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
       
        <h2>Facturar !</h2>
        <br /><br />
        <form action=""method="POST"autocomplete="off"> 
            <input id="id " name="id"type="hidden"/>
         
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
            <p>
                Hora salida:
                <input id="Hsalida " name="Hsalida"type="text"/>
            </p>
            <button id="Facturar" name="Facturar" type="submit">Facturar</button>
           
        </form>
    </body>
</html>
