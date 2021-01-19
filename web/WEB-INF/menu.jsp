<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-expand-md navbar-danger bg-warning">
  <a class="navbar-brand text-dark" href="${pageContext.request.contextPath}">ProiectHR</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarsExampleDefault">
    <ul class="navbar-nav">
        <c:choose>
            <c:when test="${pageContext.request.isUserInRole('DirectorGeneralRole')}">
                <a class="nav-link text-dark" href="${pageContext.request.contextPath}/UserServlet"> Users </a>
                <a class="nav-link text-dark" href="${pageContext.request.contextPath}/PositionServlet"> Positions </a>
                <a class="nav-link text-dark" href="${pageContext.request.contextPath}/CandidateServlet"> Candidates </a>   
            </c:when>
                
            <c:when test="${pageContext.request.isUserInRole('AdminRole')}">
                <a class="nav-link text-dark" href="${pageContext.request.contextPath}/UserServlet"> Users </a>
            </c:when>
                
            <c:when test="${pageContext.request.isUserInRole('RecruiterRole')}">
                <a class="nav-link text-dark" href="${pageContext.request.contextPath}/PositionServlet"> Positions </a>
                <a class="nav-link text-dark" href="${pageContext.request.contextPath}/CandidateServlet"> Candidates </a>   
            </c:when>
                
            <c:when test="${pageContext.request.isUserInRole('DirectorHrRole')}">
                <a class="nav-link text-dark" href="${pageContext.request.contextPath}/PositionServlet"> Positions </a>
            </c:when>
                
            <c:when test="${pageContext.request.isUserInRole('DirectorDepartamentRole')}">
                <a class="nav-link text-dark" href="${pageContext.request.contextPath}/PositionServlet"> Positions </a>
            </c:when>
            <c:when test="${pageContext.request.isUserInRole('ViewerRole')}">
                <a class="nav-link text-dark" href="${pageContext.request.contextPath}/PositionServlet"> Positions </a>
            </c:when>
        </c:choose>
    </ul>
    
        <ul class="navbar-nav ml-auto">
            <li class ="nav-item">
            <c:choose>
                <c:when test= "${pageContext.request.getRemoteUser()==null}">
                    <a class="nav-link text-dark" href="${pageContext.request.contextPath}/Login"> Login </a>
                </c:when>
                <c:otherwise>
                    <a class="nav-link text-dark" href="${pageContext.request.contextPath}/Logout"> Logout </a>
                </c:otherwise>
            </c:choose>
            </li>
        </ul>
  </div>
</nav>