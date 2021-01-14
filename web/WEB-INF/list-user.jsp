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
        <a href="${pageContext.request.contextPath}/AddUserServlet" role="button"><input type="button" name="add" value="Add User" ></a>
        <table border="1">
            <c:forEach var="users" items="${user}" varStatus="status">
                <tr>
                    <td>${users.nume}</td>
                    <td>${users.prenume}</td>
                    <td>${users.telefon}</td>
                    <td>${users.user_role}</td>
                    <td><a href="${pageContext.request.contextPath}/EditUserServlet?id=${users.id}" role="button"><input type="button" name="update" value="Update" ></a> </td>
                    <td><a href="${pageContext.request.contextPath}/DeleteUserServlet?id=${users.id}" role="button"><input type="button" name="delete" value="Delete" ></a> </td>
                </tr>           
            </c:forEach>                     
        </table>
    </body>
</html>
