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
        <p>Add user</p>
             <form action="${pageContext.request.contextPath}/AddUserServlet" method="POST">

                        <label>Nume: </label>
                        <input type="text" name="nume" minlength="5"/></br>

                        <label>Prenume: </label>
                        <input type="text" name="prenume"/></br>

                        <label>Telefon: </label>
                        <input type="text" name="telefon"/></br>
                        
                        <label>Mobil: </label>
                        <input type="text" name="mobil"/></br>
                    
                        <label>Email: </label>
                        <input type="email" name="email"/></br>
                        
                        <label>Parola: </label>
                        <input type="password" name="password"/></br>
                        
                        <label>Descriere: </label>
                        <input type="text" name="descriere"/></br>
                        
                        <label>Rol: </label>
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
                        
                        <input type="submit" name="OK" value="OK">
             </form>
    </body>
</html>
