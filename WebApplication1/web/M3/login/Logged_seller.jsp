<%-- 
    Document   : Form_Logged
    Created on : 21-apr-2016, 14.37.12
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
        <link href="/WebApplication1/M3/css/style.css" rel="stylesheet" type="text/css" media="screen" />
    </head>
    <body>
        <header>
            <h1>MMT</h1>
            <h2>mercato mezzi trasporto</h2>          
            <nav>
                
               <ul>
                   <li><a class="man" href="/WebApplication1/M3/descrizione.jsp">HOME</a></li>
                    <li class="currpag"><a href="/WebApplication1/Login">Login</a></li>
                    <li><a class="man" href="/WebApplication1/Venditore">Vendi</a></li>
                    <li><a class="man" href="/WebApplication1/Cliente">Compra</a></li>
                </ul>
                
            </nav>
        </header>
        <div class="cForm">
            <h2>Area Riservata</h2>
            <h3>Bentornato ${UserVenditore.nome} ${UserVenditore.cognome}
                <br>
                il tuo saldo è di : ${UserVenditore.credito.conto}
            </h3>
            <h3>Le tue inserzioni:</h3>
            <table>
                <tr>
                    <th>Nome</th>
                    <th class="foto">Foto</th>
                    <th>Disponibilità</th>
                    <th>Prezzo</th>
                    <th>Modifica</th>
                </tr>
                <c:forEach var="itemsVendita" items="${UserVenditore.inserzioniAperte}">
                   <tr class="d">
                        <td>${itemsVendita.nome}</td>
                        <td><img title="${itemsVendita.nome}" alt="${itemsVendita.nome}" src="M3/img/${itemsVendita.URL}" width="80" height="80"></td>
                        <td><c:if test="${itemsVendita.quantita > 0}">disponibile</c:if></td>
                        <td>${itemsVendita.prezzo} €</td>
                        <td class="cart"><a href="/WebApplication1/Visualizza?id=${itemsVendita.id}&cat=${itemsVendita.categoria}">Visualizza</a></td>
                    </tr>
                </c:forEach>
            </table> 
        </div>
        <c:if test="${errorType != null }">
            <jsp:include page="/WebApplication1/M3/struttura/errorPage.jsp" />
        </c:if>
    </body>
</html>