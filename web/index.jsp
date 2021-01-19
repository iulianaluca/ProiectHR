<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>

<t:pageTemplate pageTitle="ProiectHR">
    <style>
        body{
            background-image: url('coverjpg.jpg');
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: 100% 100%;

        }
       
        
    </style>
    <body>
    <c:if test="${pageContext.request.getRemoteUser()!=null}">
        <p>Salut ${pageContext.request.getRemoteUser()} !</p>
    </c:if>
    </body>
</t:pageTemplate>
