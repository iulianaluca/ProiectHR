<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<style><%@include file = "/WEB-INF/css/candidates.css" %></style>
<!DOCTYPE html>
<t:pageTemplate pageTitle="ProiectHR">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Positions</title>
    </head>
    <body>
                <a href="${pageContext.request.contextPath}/AddPositionServlet" role="button"><button class="button__add"  >ADD POSITION</button> </a>
         <table class="table__col">
                  <tr class="candidates__col">
                    <td>Nume</td>
                    <td>Proiect</td>
                    <td>Departament</td>
                    <td>Cerinte</td>
                    <td>Posibilitati</td>
                    <td>Proiect</td>
                    <td>Opened</td>
                    <td>Closed</td>
                    <td>User Position</td>
                    <td>Action</td>
                  </tr>
                    
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
                    <td><a href="${pageContext.request.contextPath}/EditPositionServlet?id=${positions.idposition}" role="button"><button class="button__update">EDIT</button></a> </td>
                    <td><a href="${pageContext.request.contextPath}/DeletePositionServlet?id=${positions.idposition}" role="button"><button class="button__update">DELETE</button></a> </td>
                    <td><a href="${pageContext.request.contextPath}/AddCandidateToPosition?idposition=${positions.idposition}" role="button"><button class="button__update">ADD CANDIDATE</button></a> </td>
                </tr>           
            </c:forEach>
        </table>
    </body>
</html>
</t:pageTemplate>
