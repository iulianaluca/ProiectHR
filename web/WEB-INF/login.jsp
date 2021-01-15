<%-- 
    Document   : login
    Created on : Jan 15, 2021, 8:27:12 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form action="j_security_check" method="POST">

                        <label>Username: </label>
                        <input type="text" name="j_username"/></br>

                        <label>Parola </label>
                        <input type="text" name="j_password"/></br>
                        <button type="submit">Login</button>
         </form>
    </body>
</html>
