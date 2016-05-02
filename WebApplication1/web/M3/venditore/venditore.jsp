<%-- 
    Document   : venditore
    Created on : 24-apr-2016, 15.49.47
    Author     : luca
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <title>MMT - Vendi</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="MMT - venditore">
        <meta name="author" content="Luca Camboni">
        <link href="/WebApplication1/M3/css/style.css" rel="stylesheet" type="text/css" media="screen" />
    </head>
    <body>
        <header>
            <h1>MMT</h1>
            <h2>mercato mezzi trasporto</h2> 
            <nav>
                <ul>
                    <li><a class="man" href="/WebApplication1/M3/descrizione.jsp">HOME</a></li>
                    <li><a class="man" href="/WebApplication1/Login">Login</a></li>
                    <li class="currpag"><a href="/WebApplication1/Venditore">Vendi</a></li>
                    <li><a class="man" href="/WebApplication1/Cliente">Compra</a></li>
                </ul>
                
            </nav>
        </header>
        <div class="cForm">
            <h2>Vendi prodotto</h2>
            <h3>Crea inserzione</h3>
            <form method="post" action="Venditore">
                <fieldset>
                    <legend>Informazioni prodotto</legend>
                    <label for="name">Nome oggetto:</label>
                    <input type="text" name="nome" id="name" value="" />
                    <br/>
                    <label for="urlimg">URL immagine descrittiva:</label>
                    <input type="text" name="foto" id="urlimg" value="fiat500.jpg"/>
                    <br/>
                    <label for="descr">Descrizione prodotto:</label>
                    <textarea name="descrizione" id="descr" rows="4" cols="20" >Descrizione oggetto</textarea>
                    <br/>
                    <label for="price">Prezzo:</label>
                    <input type="text" name="prezzo" id="price" value="0.00"/>
                    <br/>
                    <label for="quantity">quantità:</label>
                    <input type="number" name="quantita" id="quantity" value="1" />
                    <br/>
                    <input type="hidden" name="cmd" value="inserimento"/>
                    <input type="submit" value="Vendi" class="sbutton"/>
                </fieldset>
            </form>
        </div>
        <c:if test="${errorType != null}">
            <jsp:include page="../struttura/errorPage.jsp" />
        </c:if>
    </body>
</html>

