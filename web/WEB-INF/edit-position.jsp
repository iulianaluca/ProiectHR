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
        <title>Delete</title>
        <link href="style.css" rel="stylesheet">
    </head>
    <body>
        <p>Edit position</p>
             <form action="${pageContext.request.contextPath}/EditPositionServlet" method="POST">

                        <label>Nume: </label>
                        <input type="text" name="nume" value="${position.nume}"/></br>

                        <label>Nr persoane: </label>
                        <input type="text" name="nr_persoane" value="${position.nr_persoane}"/></br>

                        <label>Department: </label>
                        <input type="text" name="department" value="${position.department}"/></br>
                        
                        <label>Cerinte: </label>
                        <input type="text" name="cerinte" value="${position.cerinte}"/></br>
                    
                        <label>Responsabilitati: </label>
                        <input type="text" name="responsabilitati" value="${position.responsabilitati}"/></br>
                        
                        <label>Proiect: </label>
                        <input type="text" name="proiect" value="${position.proiect}"/></br>
                        
                        <label>Opened: </label>
                        <input type="text" name="opened" value="${position.opened}"/></br>
                        
                        <label>Closed: </label>
                        <input type="text" name="closed" value="${position.closed}"/></br>
                        
                        <label>User_pos: </label>
                        <input type="text" name="user_pos" value="${position.user_pos}"/></br>
                        
                        <input type="hidden" name="idposition" value="${position.idposition}"/>
                        
                        <input type="submit" name="OK" value="OK">
             </form>
    </body>
</html>
