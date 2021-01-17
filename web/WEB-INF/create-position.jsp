<%-- 
    Document   : edit-user
    Created on : Jan 11, 2021, 6:21:28 PM
    Author     : Iuliana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add</title>
        <link href="style.css" rel="stylesheet">
    </head>
    <body>
        <p>Add position</p>
             <form action="${pageContext.request.contextPath}/AddPositionServlet" method="POST">

                        <label>Nume: </label>
                        <input type="text" name="nume"/></br>

                        <label>Nr persoane: </label>
                        <input type="text" name="nr_persoane"/></br>

                        <label>Department: </label>
                        <input type="text" name="department"/></br>
                        
                        <label>Cerinte: </label>
                        <input type="text" name="cerinte"/></br>
                    
                        <label>Responsabilitati: </label>
                        <input type="text" name="responsabilitati"/></br>
                        
                        <label>Proiect: </label>
                        <input type="text" name="proiect"/></br>
                        
                        <label>Open: </label>
                        <input type="text" name="opened"/></br>
                        
                        <label>Closed: </label>
                        <input type="text" name="closed"/></br>
                        <input type="hidden" name="username" value="${pageContext.request.getRemoteUser()}"/></br>
                        <input type="submit" name="OK" value="OK">
             </form>
    </body>
</html>
