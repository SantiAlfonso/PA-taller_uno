<%-- 
    Document   : vista
    Created on : 7/09/2023, 7:10:23 a. m.
    Author     : Estudiante
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cursos disponibles</title>
</head>
<body>
    <header>
        <h1>Cursos Disponibles</h1>
    </header>
    <nav>
        <ul>
            <li>Curso 1</li>
            <li>Curso 2</li>
            <li>Curso 3</li>
            <li>Curso 4</li>
        </ul>
    </nav>
    <form action="Control" method="get">
        <p>Elige que cursos quieres ver:</p>
        <input type="checkbox" name="materia" value="Cursos"> Calculo Integral
        <input type="checkbox" name="materia" id="Cursos"> Programación Avanzada
        <input type="checkbox" name="materia" id="Cursos"> Bases de datos avanzada 
        <br>
        <br>


        <label>Nombre</label>
        <input type="text" name="txtNombre">
        <label>Correo</label>
        <input type="text" name="txtEmail">
        <label>Telefono</label>
        <input type="text" name="txtTelefono">
        <br>
        <br>

        <input type="submit" name="btnRegistrar" value="Registrar">
        <input type="reset" name="btnLimpiar" value="Limpiar">
    </form>
</body>
</html>
