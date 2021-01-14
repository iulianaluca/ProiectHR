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
            <c:forEach var="candidates" items="${candidate}" varStatus="status">
                <tr>
                    <td>${candidates.nume}</td>
                    <td>${candidates.prenume}</td>
                    <td>${candidates.telefon}</td>
                    <td>${candidates.email}</td>
                    <td>${candidates.adresa}</td>
                    <td>${candidates.cv}</td>
                    <td><a href="AssignCandidateToPosition?idcandidate=${candidates.idcandidate}&idposition=${idposition}" role="button"><input type="button" value="Add to Position" ></a> </td>                  
                </tr>           
            </c:forEach>                     
        </table>
    </body>
</html>
