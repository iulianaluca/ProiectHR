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
        <p>Delete Candidate</p>
             <form action="${pageContext.request.contextPath}/DeleteCandidateServlet" method="POST">

                        <label>Nume: </label>
                        <input type="text" name="nume" value="${candidate.nume}"/></br>

                        <label>Prenume </label>
                        <input type="text" name="prenume" value="${candidate.prenume}"/></br>

                        <label>Telefon </label>
                        <input type="text" name="telefon" value="${candidate.telefon}"/></br>
                        
                        <label>Email </label>
                        <input type="text" name="email" value="${candidate.email}"/></br>
                    
                        <label>Adresa </label>
                        <input type="text" name="adresa" value="${candidate.adresa}"/></br>
                        
                        <label>CV </label>
                        <input type="text" name="cv" value="${candidate.cv}"/></br>
                        
                        <label>Relocare </label>
                        <input type="text" name="relocare" value="${candidate.relocare}"/></br>
                        
                        <label>Acceptat </label>
                        <input type="text" name="acceptat" value="${candidate.acceptat}"/></br>
                        
                        
                        <input type="hidden" name="idcandidate" value="${candidate.idcandidate}"/>
                        
                        <input type="submit" value="DELETE">
             </form>
    </body>
</html>
