<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <c:forEach var="users" items="${user}" varStatus="status">
                <tr>
                    <td>${users.id}</td>
                    <td>${users.nume}</td>
                    <td>${users.prenume}</td>
                    <td>${users.telefon}</td>
                    <td>${users.user_role}</td>
                </tr>           
            </c:forEach>
        </table>
    </body>
</html>
