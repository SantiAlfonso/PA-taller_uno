<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="CSS/Mi_Estilo.css" rel="stylesheet" type="text/css"> 
        <title>Salida Datos</title>
    </head>
    <body>
        <header>
           <h1>Su Registro ha exitoso!</h1>  
           <table>
               <tr>
                   <td> Nombre: </td>
                   <td><%= nombre%></td>
               </tr>
               <tr>
                   <td> Teléfono: </td>
                   <td><%= telefono%></td>
               </tr>
               <tr>
                   <td> Email: </td>
                   <td><%= correo%></td>
               </tr>
           </table>
        </header>
        
        
    </body>
</html>
