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
      <style>
            body{
                background-image: url('form.jpg');
                background-repeat: no-repeat;
                background-attachment: fixed;
                background-size: 100% 100%;

            }
        </style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Edit position</title>
        
    </head>
    <body>
        <h1 class="edit__candidate">EDIT POSITION</h1>
             <form action="${pageContext.request.contextPath}/EditPositionServlet" method="POST">
                  <div class="candidate__update">
                        <label>Nume</label></br>
                        <input type="text" name="nume" value="${position.nume}"/></br>

                        <label>Numar persoane</label></br>
                        <input type="text" name="nr_persoane" value="${position.nr_persoane}"/></br>

                        <label>Departament </label></br>
                        <input type="text" name="department" value="${position.department}"/></br>
                        
                        <label>Cerinte </label></br>
                        <input type="text" name="cerinte" value="${position.cerinte}"/></br>
                    
                        <label>Responsabilitati</label></br>
                        <input type="text" name="responsabilitati" value="${position.responsabilitati}"/></br>
                        
                        <label>Proiect</label></br>
                        <input type="text" name="proiect" value="${position.proiect}"/></br>
                        
                        <label>Opened</label></br>
                        <input type="text" name="opened" value="${position.opened}"/></br>
                        
                        <label>Closed</label></br>
                        <input type="text" name="closed" value="${position.closed}"/></br>
                        
                        <label>User position</label></br>
                        <input type="text" name="user_pos" value="${position.user_pos}"/></br>
                        
                        <input type="hidden" name="idposition" value="${position.idposition}"/>
                  </div>
                        
                         <button class="button__add">EDIT</button>
             </form>
    </body>
</html>
