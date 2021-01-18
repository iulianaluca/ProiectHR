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
        <title>Delete candidate</title>
       
    </head>
    <body>
        <h1 class="delete__candidate">DELETE CANDIDATE</h1>
             <form action="${pageContext.request.contextPath}/DeleteCandidateServlet" method="POST">
            <div class="candidate__update">
                        <label>Nume: </label></br>
                        <input type="text" name="nume" value="${candidate.nume}"/></br>

                        <label>Prenume </label></br>
                        <input type="text" name="prenume" value="${candidate.prenume}"/></br>

                        <label>Telefon </label></br>
                        <input type="text" name="telefon" value="${candidate.telefon}"/></br>
                        
                        <label>Email </label></br>
                        <input type="text" name="email" value="${candidate.email}"/></br>
                    
                        <label>Adresa </label></br>
                        <input type="text" name="adresa" value="${candidate.adresa}"/></br>
                        
                        <label>CV </label></br>
                        <input type="text" name="cv" value="${candidate.cv}"/></br>
                        
                        <label>Relocare </label></br>
                        <input type="text" name="relocare" value="${candidate.relocare}"/></br>
                        
                        <label>Acceptat </label></br>
                        <input type="text" name="acceptat" value="${candidate.acceptat}"/></br>
                        
            
                        <input type="hidden" name="idcandidate" value="${candidate.idcandidate}"/>
                   </div>     
                         <button class="button__add">DELETE</button>
             </form>
    </body>
</html>
