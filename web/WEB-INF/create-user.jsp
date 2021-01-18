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
        <title>Add user</title>
       
    </head>
    <body>
         <h1 class="add__candidate">ADD USER</h1>
             <form action="${pageContext.request.contextPath}/AddUserServlet" method="POST">
                  <div class="candidate">
                 <label>Nume</label></br>
                        <input type="text" name="nume" minlength="5"/></br>

                        <label>Prenume</label></br>
                        <input type="text" name="prenume"/></br>

                        <label>Telefon</label></br>
                        <input type="text" name="telefon"/></br>
                        
                        <label>Mobil</label></br>
                        <input type="text" name="mobil"/></br>
                    
                        <label>Email</label></br>
                        <input type="email" name="email"/></br>
                        
                        <label>Parola</label></br>
                        <input type="password" name="password"/></br>
                        
                        <label>Descriere</label></br>
                        <input type="text" name="descriere"/></br>
                        
                        <label>Rol</label></br>
                        <select name="functie">
                            <option value="DIRECTOR GENERAL">
                                Director general
                            </option>
                            <option value="DIRECTOR DEPARTAMENT">
                                Director de departament
                            </option>
                            <option value="DIRECTOR HR">
                                Director de HR 
                            </option>
                            <option value="RECRUITER">
                                Recruiter 
                            </option>
                            <option value="ADMINISTRATOR">
                                Administrator
                            </option>
                            <option value="VIEWER">
                                Viewer
                            </option>
                            
                        </select>
                         </div>                       
                      
                        
                 <button class="button__add">ADD </button>
             </form>
    </body>
</html>
