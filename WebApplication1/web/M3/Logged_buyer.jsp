<%-- 
    Document   : Logged_Buyer
    Created on : 21-apr-2016, 14.44.59
    Author     : luca
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>MMT - Account page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="MMT - login">
        <meta name="author" content="Luca Camboni">
        <link href="M3/css/style.css" rel="stylesheet" type="text/css" media="screen" />
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
            <h2>Area Riservata</h2>
            <h3>Bentornato , ${UserCliente.nome}, ${UserCliente.cognome}
                <br>
                il tuo saldo è di : ${UserCliente.credito.conto}
            </h3>
        </div>
    </body>
</html>