<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix ="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="${pageContext.request.contextPath}/UserServlet"> Users </a>
        <a href="${pageContext.request.contextPath}/PositionServlet"> Positions </a>
        <a href="${pageContext.request.contextPath}/CandidateServlet"> Candidates </a>
        <a href="${pageContext.request.contextPath}/AddCandidateServlet" role="button"><input type="button" name="add" value="Add Candidate" ></a>
        <table border="1">
            <c:forEach var="candidates" items="${candidate}" varStatus="status">
                <tr>
                    <td>${candidates.nume}</td>
                    <td>${candidates.prenume}</td>
                    <td>${candidates.telefon}</td>
                    <td>${candidates.email}</td>
                    <td>${candidates.adresa}</td>
                    <td>${candidates.cv}</td>
                    <td><a href="${pageContext.request.contextPath}/EditCandidateServlet?id=${candidates.idcandidate}" role="button"><input type="button" name="update" value="Update" ></a> </td>
                    <td><a href="${pageContext.request.contextPath}/DeleteCandidateServlet?id=${candidates.idcandidate}" role="button"><input type="button" name="delete" value="Delete" ></a> </td>
                </tr>           
            </c:forEach>                     
        </table>
    </body>
</html>
