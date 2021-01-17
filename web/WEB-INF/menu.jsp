<nav class="navbar navbar-expand-md navbar-danger bg-danger ">
  <a class="navbar-brand text-white" href="${pageContext.request.contextPath}">ProiectHR</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarsExampleDefault" aria-controls="navbarsExampleDefault" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarsExampleDefault">
    <ul class="navbar-nav ">
        <a class="nav-link text-white" href="${pageContext.request.contextPath}/UserServlet"> Users </a>
        <a class="nav-link text-white" href="${pageContext.request.contextPath}/PositionServlet"> Positions </a>
        <a class="nav-link text-white" href="${pageContext.request.contextPath}/CandidateServlet"> Candidates </a>
        <a class="nav-link text-white" href="${pageContext.request.contextPath}/Logout"> Logout </a>
    </ul>
  </div>
</nav>