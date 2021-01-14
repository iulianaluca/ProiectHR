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
        <a href="${pageContext.request.contextPath}/AddPositionServlet" role="button"><input type="button" name="add" value="Add Position" ></a>
        <table border="1">
            <tr>
                    <td>Nume</td>
                    <td>Proiect</td>
                    <td>Departament</td>
                    <td>Cerinte</td>
                    <td>Posibilitati</td>
                    <td>Proiect</td>
                    <td>Opened</td>
                    <td>Closed</td>
                    <td>User Pos</td>
                    <td>Action</td>
                    
            <c:forEach var="positions" items="${position}" varStatus="status">
                <tr>
                    <td>${positions.nume}</td>
                    <td>${positions.proiect}</td>
                    <td>${positions.department}</td>
                    <td>${positions.cerinte}</td>
                    <td>${positions.responsabilitati}</td>
                    <td>${positions.proiect}</td>
                    <td>${positions.opened}</td>
                    <td>${positions.closed}</td>
                    <td>${positions.user_pos}</td>
                    <td><a href="${pageContext.request.contextPath}/EditPositionServlet?id=${positions.idposition}" role="button"><input type="button" name="update" value="Update" ></a> </td>
                    <td><a href="${pageContext.request.contextPath}/DeletePositionServlet?id=${positions.idposition}" role="button"><input type="button" name="delete" value="Delete" ></a> </td>
                    <td><a href="${pageContext.request.contextPath}/AddCandidateToPosition?idposition=${positions.idposition}" role="button"><input type="button" value="Add Candidate" ></a> </td>
                </tr>           
            </c:forEach>
        </table>
    </body>
</html>
