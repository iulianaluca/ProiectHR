<%-- 
    Document   : edit-user
    Created on : Jan 11, 2021, 6:21:28 PM
    Author     : Iuliana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                        <input type="text" name="nume"/></br>

                        <label>Prenume: </label>
                        <input type="text" name="prenume"/></br>

                        <label>Telefon: </label>
                        <input type="text" name="telefon"/></br>
                        
                        <label>Mobil: </label>
                        <input type="text" name="mobil"/></br>
                    
                        <label>Email: </label>
                        <input type="text" name="email"/></br>
                        
                        <label>Functie: </label>
                        <input type="text" name="functie"/></br>
                        
                        <label>Descriere: </label>
                        <input type="text" name="descriere"/></br>
                        
                        <label>Rol: </label>
                        <select name="rol">
                            <option value="1">
                                Director general
                            </option>
                            <option value="2">
                                Director de departament
                            </option>
                            <option value="3">
                                Director de HR 
                            </option>
                            <option value="4">
                                Recruiter 
                            </option>
                            <option value="5">
                                Administrator
                            </option>
                            <option value="6">
                                Viewer
                            </option>
                            
                        </select>
                        
                        <input type="submit" name="OK" value="OK">
             </form>
    </body>
</html>
