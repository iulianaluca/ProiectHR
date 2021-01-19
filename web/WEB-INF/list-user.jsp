<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<style><%@include file = "/WEB-INF/css/candidates.css" %></style>
<!DOCTYPE html>
<t:pageTemplate pageTitle="ProiectHR">
    <html>
        <style>
            body{
                background-image: url('background.jpg');
                background-repeat: no-repeat;
                background-attachment: fixed;
                background-size: 100% 100%;

            }
        </style>
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
                    <th>Mobil</th>
                    <th>Functie</th>
                    <th>Email</th>
                    <th>Descriere</th>
                    <th>Action</th>



                </tr>

                <c:forEach var="users" items="${user}" varStatus="status">
                    <tr>
                        <td>${users.nume}</td>
                        <td>${users.prenume}</td>
                        <td>${users.telefon}</td>
                        <td>${users.mobil}</td>
                        <td>${users.functie}</td>
                        <td>${users.email}</td>
                        <td>${users.descriere}</td>
                        <td><a href="${pageContext.request.contextPath}/EditUserServlet?id=${users.id}" role="button"><button class="button__update">EDIT</button></a> 
                            <a href="${pageContext.request.contextPath}/DeleteUserServlet?id=${users.id}" role="button"><button class="button__update">DELETE</button></a> </td>
                    </tr>           
                </c:forEach>                     
            </table>
        </body>
    </html>

</t:pageTemplate>