<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Actividad 2. Servlet con JSP</title>
</head>
<body>
    <h1>FORMULARIO</h1>
    <p>Creamos un formulario sencillo en HTML.</p>
    <form action="myServlet2" method="get">
        <label for="fname">First name:</label><br>
        <input type="text" id="fname" name="fname" value=""><br>
        <label for="lname">Last name:</label><br>
        <input type="text" id="lname" name="lname" value=""><br><br>
        <input type="submit" value="Enviar">
    </form>
</body>
</html>