<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<style><%@include file = "/WEB-INF/css/candidates.css" %></style>
<!DOCTYPE html>
 <t:pageTemplate pageTitle="ProiectHR">
<html>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Users</title>
    </head>
    <body>
        <a href="${pageContext.request.contextPath}/AddUserServlet" role="button"><button class="button__add"  >ADD USER</button> </a>
                 <table class="table__col">
                  <tr class="candidates__col">
                     <th>Nume</th>
                     <th>Prenume</th>
                     <th>Telefon</th>
                     
                    
                </tr>
      
            <c:forEach var="users" items="${user}" varStatus="status">
                <tr>
                    <td>${users.nume}</td>
                    <td>${users.prenume}</td>
                    <td>${users.telefon}</td>
                    <td><a href="${pageContext.request.contextPath}/EditUserServlet?id=${users.id}" role="button"><button class="button__update">EDIT</button></a> </td>
                    <td><a href="${pageContext.request.contextPath}/DeleteUserServlet?id=${users.id}" role="button"><button class="button__update">DELETE</button></a> </td>
                </tr>           
            </c:forEach>                     
        </table>
    </body>
</html>

</t:pageTemplate>
