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
        <title>Edit user</title>
        <link href="style.css" rel="stylesheet">
    </head>
    <body>
           <h1 class="edit__candidate">EDIT USER</h1>
             <form action="${pageContext.request.contextPath}/EditUserServlet" method="POST">
                  <div class="candidate__update">
                        <label>Nume</label></br>
                        <input type="text" name="nume" value="${user.nume}"/></br>

                        <label>Prenume</label></br>
                        <input type="text" name="prenume" value="${user.prenume}"/></br>

                        <label>Telefon</label></br>
                        <input type="number" name="telefon" value="${user.telefon}"/></br>
                        
                        <label>Mobil</label></br>
                        <input type="number" name="mobil" value="${user.mobil}"/></br>
                    
                        <label>Email</label></br>
                        <input type="text" name="email" value="${user.email}"/></br>
                        
                        <label>Functie</label></br>
                        <input type="text" name="functie" value="${user.functie}"/></br>
                        
                        <label>Descriere</label></br>
                        <input type="text" name="descriere" value="${user.descriere}"/></br>
                    
                        <input type="hidden" name="id" value="${user.id}"/>
                  </div>
                        
                       <button class="button__add">EDIT</button>
             </form>
    </body>
</html>
