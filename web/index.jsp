<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>

<t:pageTemplate pageTitle="ProiectHR">
    
    <form action="j_security_check" method="POST">

                        <label>Username: </label>
                        <input type="text" name="j_username"/></br>

                        <label>Parola </label>
                        <input type="password" name="j_password"/></br>
                        <button type="submit">Login</button>
    </form>
    
</t:pageTemplate>
