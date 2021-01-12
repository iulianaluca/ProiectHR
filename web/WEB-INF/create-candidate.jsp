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
        <p>Add candidate</p>
             <form action="${pageContext.request.contextPath}/AddCandidateServlet" method="POST">

                        <label>Nume: </label>
                        <input type="text" name="nume"/></br>

                        <label>Prenume: </label>
                        <input type="text" name="prenume"/></br>

                        <label>Telefon: </label>
                        <input type="text" name="telefon"/></br>
                        
                        <label>Email: </label>
                        <input type="text" name="email"/></br>
                    
                        <label>Adresa </label>
                        <input type="text" name="adresa"/></br>
                        
                        <label>CV: </label>
                        <input type="text" name="cv"/></br>
                        
                        <label>Relocare: </label>
                        <input type="text" name="relocare"/></br>
                        
                         <label>Acceptat: </label>
                        <input type="text" name="acceptat"/></br>
                       
                      
                        
                        <input type="submit" name="OK" value="OK">
             </form>
    </body>
</html>
