<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<style><%@include file = "/WEB-INF/css/positionlist.css" %></style>
<!DOCTYPE html>
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
        <title>Position Candidate</title>
       
    </head>
    <body>
        <table class="center">
            <tr class="table__col">
                     <th>Nume</th>
                     <th>Prenume</th>
                     <th>Telefon</th>
                     <th>Email</th>
                     <th>Adresa</th>
                     <th>CV</th>
                     <th>Actiune</th>
                    
                </tr>
       
            <c:forEach var="candidates" items="${candidate}" varStatus="status">
                <tr>
                    <td>${candidates.nume}</td>
                    <td>${candidates.prenume}</td>
                    <td>${candidates.telefon}</td>
                    <td>${candidates.email}</td>
                    <td>${candidates.adresa}</td>
                    <td>${candidates.cv}</td>
                    <td><a href="AssignCandidateToPosition?idcandidate=${candidates.idcandidate}&idposition=${idposition}" role="button"><button class="button__update">ADD TO POSITION</button></a> </td>                
                </tr>           
            </c:forEach>                     
        </table>
    </body>
</html>
