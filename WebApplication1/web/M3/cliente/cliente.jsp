<%-- 
    Document   : cliente
    Created on : 24-apr-2016, 16.49.27
    Author     : luca
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>MMT - Acquista</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="MMT - Compra">
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
                    <li><a class="man" href="/WebApplication1/Venditore">Vendi</a></li>
                    <li class="currpag"><a href="/WebApplication1/Cliente">Compra</a></li>
                </ul>
                
            </nav>
        </header>
        <nav class="colL">
            <h2>Indice</h2>
            <ol>
                <li>
                    <a class="man" href="#strada">Veicoli da strada</a> 
                    <ul>
                        <li><a class="sec" href="#auto">Auto</a></li>
                        <li><a class="sec" href="#moto">Moto</a></li>
                    </ul>
                </li>
                <li>
                    <a class="man" href="#nautica">Mezzi nautici</a> 
                    <ul>
                        <li><a class="sec" href="#yathc">Yathc</a></li>
                        <li><a class="sec" href="#barche">Barche</a></li>
                    </ul>
                </li>
            </ol>
            
        </nav>
        <article>
            <h2>Il mercato</h2>
            <section><a id="strada">
                <h3>veicoli da strada</h3>
            </a>
                
                <a id="auto">
                    <h4>Auto</h4>
                </a>
                <table>
                <tr>
                    <th>Nome</th>
                    <th class="foto">Foto</th>
                    <th>Disponibilità</th>
                    <th>Prezzo</th>
                    <th>Modifica</th>
                </tr>
                <c:set var="counter" value="0"/>
                <c:forEach var="itemsVendita" items="${listaOggetti.listaAuto}">
                    
                    <c:choose>
                        <c:when test="${counter == 0}"><tr class="p"><c:set var="counter" value="1"/></c:when>
                        <c:when test="${counter == 1}"><tr class="d"><c:set var="counter" value="0"/></c:when>
                    </c:choose>
                    
                        <td>${itemsVendita.nome}</td>
                        <td><img title="${itemsVendita.nome}" alt="${itemsVendita.nome}" src="/WebApplication1/M3/img/${itemsVendita.URL}" width="80" height="80"></td>
                        <td>
                            <c:if test="${itemsVendita.quantita > 0}">disponibile</c:if>
                            <c:if test="${itemsVendita.quantita < 1}">venduto!</c:if>
                        </td>
                        <td>${itemsVendita.prezzo} €</td>
                        <td class="cart"><a href="/WebApplication1/Visualizza?id=${itemsVendita.id}&cat=${itemsVendita.categoria}">Visualizza</a></td>
                    </tr>
                </c:forEach>
            </table> 
                
                <a id="moto">
                    <h4>Moto</h4>
                </a>
                    <table>
                <tr>
                    <th>Nome</th>
                    <th class="foto">Foto</th>
                    <th>Disponibilità</th>
                    <th>Prezzo</th>
                    <th>Modifica</th>
                </tr>
                <c:forEach var="itemsVendita" items="${listaOggetti.listaMoto}">
                    <c:choose>
                        <c:when test="${counter == 0}"><tr class="p"><c:set var="counter" value="1"/></c:when>
                        <c:when test="${counter == 1}"><tr class="d"><c:set var="counter" value="0"/></c:when>
                    </c:choose>
                        <td>${itemsVendita.nome}</td>
                        <td><img title="${itemsVendita.nome}" alt="${itemsVendita.nome}" src="/WebApplication1/M3/img/${itemsVendita.URL}" width="80" height="80"></td>
                        <td>
                            <c:if test="${itemsVendita.quantita > 0}">disponibile</c:if>
                            <c:if test="${itemsVendita.quantita < 1}">venduto!</c:if>
                        </td>
                        <td>${itemsVendita.prezzo} €</td>
                        <td class="cart"><a href="/WebApplication1/Visualizza?id=${itemsVendita.id}&cat=${itemsVendita.categoria}">Visualizza</a></td>
                    </tr>
                </c:forEach>
            </table> 
            </section>
            <section>
                <a id="nautica">
                    <h3>Mezzi nautici</h3>
                </a>
                <a id="yathc">
                    <h4>Yathc</h4>
                </a>
                <table>
                <tr>
                    <th>Nome</th>
                    <th class="foto">Foto</th>
                    <th>Disponibilità</th>
                    <th>Prezzo</th>
                    <th>Modifica</th>
                </tr>
                <c:forEach var="itemsVendita" items="${listaOggetti.listaYatch}">
                    <c:choose>
                        <c:when test="${counter == 0}"><tr class="p"><c:set var="counter" value="1"/></c:when>
                        <c:when test="${counter == 1}"><tr class="d"><c:set var="counter" value="0"/></c:when>
                    </c:choose>
                        <td>${itemsVendita.nome}</td>
                        <td><img title="${itemsVendita.nome}" alt="${itemsVendita.nome}" src="/WebApplication1/M3/img/${itemsVendita.URL}" width="80" height="80"></td>
                        <td>
                            <c:if test="${itemsVendita.quantita > 0}">disponibile</c:if>
                            <c:if test="${itemsVendita.quantita < 1}">venduto!</c:if>
                        </td>
                        <td>${itemsVendita.prezzo} €</td>
                        <td class="cart"><a href="/WebApplication1/Visualizza?id=${itemsVendita.id}&cat=${itemsVendita.categoria}">Visualizza</a></td>
                    </tr>
                </c:forEach>
            </table> 
                <a id="barche">
                    <h4>Barche</h4>
                </a>
                    <table>
                <tr>
                    <th>Nome</th>
                    <th class="foto">Foto</th>
                    <th>Disponibilità</th>
                    <th>Prezzo</th>
                    <th>Modifica</th>
                </tr>
                <c:forEach var="itemsVendita" items="${listaOggetti.listaBarche}">
                    
                   <c:choose>
                        <c:when test="${counter == 0}"><tr class="p"><c:set var="counter" value="1"/></c:when>
                        <c:when test="${counter == 1}"><tr class="d"><c:set var="counter" value="0"/></c:when>
                    </c:choose>
                        <td>${itemsVendita.nome}</td>
                        <td><img title="${itemsVendita.nome}" alt="${itemsVendita.nome}" src="/WebApplication1/M3/img/${itemsVendita.URL}" width="80" height="80"></td>
                        <td>
                            <c:if test="${itemsVendita.quantita > 0}">disponibile</c:if>
                            <c:if test="${itemsVendita.quantita < 1}">venduto!</c:if>
                        </td>
                        <td>${itemsVendita.prezzo} €</td>
                        <td class="cart"><a href="/WebApplication1/Visualizza?id=${itemsVendita.id}&cat=${itemsVendita.categoria}">Visualizza</a></td>
                    </tr>
                </c:forEach>
            </table> 
            </section>
        </article>
   </body>
</html>
 
