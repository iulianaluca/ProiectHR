<%-- 
    Document   : edit-user
    Created on : Jan 11, 2021, 6:21:28 PM
    Author     : Iuliana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<style><%@include file = "/WEB-INF/css/create_candidates.css" %></style>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add position</title>
       
    </head>
    <body>
          <h1 class="add__candidate">ADD POSITION</h1>
             <form action="${pageContext.request.contextPath}/AddPositionServlet" method="POST">
                 <div class="candidate">

                         <label>Nume</label></br>
                        <input type="text" name="nume"/></br>

                        <label>Numar persoane</label></br>
                        <input type="text" name="nr_persoane"/></br>

                        <label>Departament </label></br>
                        <input type="text" name="department"/></br>
                        
                        <label>Cerinte</label></br>
                        <input type="text" name="cerinte"/></br>
                    
                        <label>Responsabilitati</label></br>
                        <input type="text" name="responsabilitati"/></br>
                        
                        <label>Proiect</label></br>
                        <input type="text" name="proiect"/></br>
                        
                        <label>Open</label></br>
                        <input type="text" name="opened"/></br>
                        
                        <label>Closed</label></br>
                        <input type="text" name="closed"/></br>
                        <input type="hidden" name="username" value="${pageContext.request.getRemoteUser()}"/></br>
                         </div>                       
                      
                        
                 <button class="button__add">ADD</button>
             </form>
    </body>
</html>
