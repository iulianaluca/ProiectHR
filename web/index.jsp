<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>

<t:pageTemplate pageTitle="ProiectHR">
    <c:if test="${pageContext.request.getRemoteUser()!=null}">
        <p>Salut ${pageContext.request.getRemoteUser()} !</p>
    </c:if>
</t:pageTemplate>
