<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %> 
<style><%@include file = "/WEB-INF/css/candidates.css" %></style>
<!DOCTYPE html>
<t:pageTemplate pageTitle="ProiectHR">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <a href="${pageContext.request.contextPath}/AddCandidateServlet" role="button"><button  class="button__add">ADD CANDIDATE</button></a>
        <table class="table__col">
            <tr class="candidates__col">
                     <th>Nume</th>
                     <th>Prenume</th>
                     <th>Telefon</th>
                     <th>Email</th>
                     <th>Adresa</th>
                     <th>CV</th>
                    
                </tr>
            <c:forEach var="candidates" items="${candidate}" varStatus="status">             
                <tr>                 
                    <td>${candidates.nume}</td>                  
                    <td>${candidates.prenume}</td>                  
                    <td>${candidates.telefon}</td>
                    <td>${candidates.email}</td>
                    <td>${candidates.adresa}</td>
                    <td>${candidates.cv}</td>
                    <td><a href="${pageContext.request.contextPath}/EditCandidateServlet?idcandidate=${candidates.idcandidate}" role="button"><button class="button__update">UPDATE</button></a> </td>
                    <td><a href="${pageContext.request.contextPath}/DeleteCandidateServlet?idcandidate=${candidates.idcandidate}" role="button"><button class="button__delete">DELETE</button></a> </td>
                </tr>           
            </c:forEach>                     
        </table>
    </body>
</html>

</t:pageTemplate>
