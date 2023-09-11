<%-- 
    Document   : vista
    Created on : 7/09/2023, 7:10:23 a. m.
    Author     : Estudiante
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="CSS/Mi_Estilo.css" rel="stylesheet" type="text/css"> 
    <title>Cursos disponibles</title>
</head>
<body>
    <header>
        <h1>Cursos Disponibles</h1>
    </header>
    <form action="Control" method="get">
        <p>Elige que cursos quieres ver:</p>
        <input type="checkbox" name="Calculo_Integral" value="Cursos"> Calculo Integral<br>
        <input type="checkbox" name="Programación_avanzada" id="Cursos"> Programación Avanzada<br>
        <input type="checkbox" name="Bases_Avanzadas" id="Cursos"> Bases de datos avanzada <br>
        <br>
        <br>
        
        <label>Nombre</label>
        <input type="text" name="txtNombre"><br><br>
        <label>Correo</label>
        <input type="text" name="txtEmail"><br><br>
        <label>Telefono</label>
        <input type="text" name="txtTelefono">
        <br>
        <br>

        <input class="button" type="submit" name="btnRegistrar" value="Registrar">
        <input class="button" type="reset" name="btnLimpiar" value="Limpiar">
    </form>
    
    <footer>
        <p>&copy; Copyright 2023. Diseñado Karen Alarcón, Santiago Alfonso y Jhon Gonzalez &#124 Bogotá - Colombia</p>
    </footer>
</body>
</html>
