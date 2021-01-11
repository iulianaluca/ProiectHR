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
            <c:forEach var="positions" items="${position}" varStatus="status">
                <tr>
                    <td>${positions.nume}</td>
                    <td>${positions.proiect}</td>
                    <td>${positions.user_pos}</td>
                </tr>           
            </c:forEach>
        </table>
    </body>
</html>
