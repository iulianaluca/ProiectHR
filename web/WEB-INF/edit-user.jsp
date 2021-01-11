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
        <title>Edit</title>
        <link href="style.css" rel="stylesheet">
    </head>
    <body>
        <p>Edit user</p>
             <form action="${pageContext.request.contextPath}/EditUserServlet" method="POST">

                        <label>Nume: </label>
                        <input type="text" name="nume" value="${user.nume}"/></br>

                        <label>Prenume: </label>
                        <input type="text" name="prenume" value="${user.prenume}"/></br>

                        <label>Telefon: </label>
                        <input type="number" name="telefon" value="${user.telefon}"/></br>
                        
                        <label>Mobil: </label>
                        <input type="number" name="mobil" value="${user.mobil}"/></br>
                    
                        <label>Email: </label>
                        <input type="text" name="email" value="${user.email}"/></br>
                        
                        <label>Functie: </label>
                        <input type="text" name="functie" value="${user.functie}"/></br>
                        
                        <label>Desctiere: </label>
                        <input type="text" name="descriere" value="${user.descriere}"/></br>
                    
                        <input type="hidden" name="id" value="${user.id}"/>
                        
                        <input type="submit" name="OK" value="OK">
             </form>
    </body>
</html>
