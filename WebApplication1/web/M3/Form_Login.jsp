<%-- 
    Document   : Login
    Created on : 21-apr-2016, 14.25.01
    Author     : luca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <html>
    <head>
        <title>MMT - login page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="MMT - login">
        <meta name="author" content="Luca Camboni">
        <link href="css/style.css" rel="stylesheet" type="text/css" media="screen" />
    </head>
    <body>
        <header>
            <h1>MMT</h1>
            <h2>mercato mezzi trasporto</h2>          
            <nav>
                
               <ul>
                   <li><a class="man" href="descrizione.html">HOME</a></li>
                    <li class="currpag"><a href="login.html">Login</a></li>
                    <li><a class="man" href="venditore.html">Vendi</a></li>
                    <li><a class="man" href="cliente.html">Compra</a></li>
                </ul>
                
            </nav>
        </header>
        <div class="cForm">
            <h2>Accedi</h2>
            <form method="post" id="login" action="../Login">
                <fieldset>
                    <legend>I tuoi dati</legend>
                    <label for="usr">Username:</label>
                    <input type="text" name="Username" id="usr" value="username" required="required"/>
                    <label for="psw">Password:</label>
                    <input type="password" name="Password" id="psw" value="pswd" required="required"/>
                    <br>
                    <input type="submit" name="Submit" value="Accedi" class="sbutton"/>
                </fieldset>
            </form>
        </div>
    </body>
</html>
</html>
