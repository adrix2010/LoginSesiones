<%-- 
    Document   : cerrar
    Created on : 27/10/2016, 08:22:15 AM
    Author     : Alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cerrar sesion</title>
    </head>
    <body>
        <h1>Cerrar sesion!</h1>
        <form action='CerrarSes' method="POST">
            <input type="hidden" name="estado" value="1"></input>
        <input type="submit" name="cerrar" >Cerrar</input>
        </form>
    </body>
</html>
