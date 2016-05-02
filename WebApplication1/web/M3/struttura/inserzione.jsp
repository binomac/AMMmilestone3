<%-- 
    Document   : inserzione
    Created on : 24-apr-2016, 19.49.09
    Author     : luca
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>MMT - inserzione</title>
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
        
        <table class="singleRow">
                <tr>
                    <th>Nome</th>
                    <th class="foto">Foto</th>
                    <th>Disponibilità</th>
                    <th>Prezzo</th>
                    <c:if test="${UserCliente != null}"><th>Compra</th></c:if>
                    <c:if test="${UserVenditore != null}"><th>Modifica</th></c:if>
                </tr>
                   <tr class="d">
                        <td>${inserzione.nome}</td>
                        <td><img title="${inserzione.nome}" alt="${inserzione.nome}" src="/WebApplication1/M3/img/${inserzione.URL}" width="80" height="80"></td>
                        <td>
                            <c:if test="${inserzione.quantita > 0}">disponibile</c:if>
                            <c:if test="${inserzione.quantita < 1}">non disponibile</c:if>
                        </td>
                        <td>${inserzione.prezzo} €</td>
                        <c:if test="${UserCliente != null && inserzione.quantita > 0}">
                            <td class="cart"><a href="/WebApplication1/Cliente?cmd=buy&id=${inserzione.id}&cat=${inserzione.categoria}">Conferma</a></td>
                        </c:if>
                        <c:if test="${UserCliente != null && inserzione.quantita < 1}"><td></td></c:if>
                        <c:if test="${UserVenditore != null}"><td>coming soon</td></c:if>
                        
                    </tr>
                
            </table> 
                        
        <c:if test="${errorType != null }">
            <jsp:include page="../struttura/errorPage.jsp" />
        </c:if>
    </body>
                        
</html>
