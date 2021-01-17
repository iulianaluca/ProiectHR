<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>

<t:pageTemplate pageTitle="ProiectHR">
    <c:choose>
        <c:when test="${pageContext.request.getRemoteUser()==null}">
            <a href="${pageContext.request.contextPath}/Login"> Login </a>
        </c:when>
        <c:otherwise>
            Salut ${pageContext.request.getRemoteUser()} !
        </c:otherwise>
    </c:choose>
</t:pageTemplate>
