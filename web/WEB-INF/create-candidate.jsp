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
        <title>Add</title>
        <link href="style.css" rel="stylesheet">
    </head>
    <body>
        <h1 class="add__candidate">ADD CANDIDATE</h1>
             <form action="${pageContext.request.contextPath}/AddCandidateServlet" method="POST">
                 <div class="candidate">
                         <label>Nume</label></br>
                         <input type="text" name="nume"/></br>               
                 
                        <label>Prenume</label></br>
                        <input type="text" name="prenume"/></br>

                        <label>Telefon</label></br>
                        <input type="text" name="telefon"/></br>
                        
                        <label>Email</label></br>
                        <input type="text" name="email"/></br>
                    
                        <label>Adresa</label></br>
                        <input type="text" name="adresa"/></br>
                        
                        <label>CV</label></br>
                        <input type="text" name="cv"/></br>
                        
                        <label>Relocare</label></br>
                        <input type="text" name="relocare"/></br>
                        
                         <label>Acceptat</label></br>
                        <input type="text" name="acceptat"/></br>
                 </div>                       
                      
                        
                 <button class="button__add">ADD</button>
             </form>
    </body>
</html>
