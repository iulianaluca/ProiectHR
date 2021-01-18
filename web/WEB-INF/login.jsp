<%-- 
    Document   : login
    Created on : Jan 15, 2021, 8:27:12 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core" %>
<t:pageTemplate pageTitle="Login">
    <style>
       #cover {
    background-size: cover;
    height: 100%;
    text-align: center;
    display: flex;
    align-items: center;
    position: relative;
}
#cover-caption {
    width: 100%;
    position: relative;
    z-index: 1;
}
/* only used for background overlay not needed for centering */
form:before {
    content: '';
    height: 100%;
    left: 0;
    position: absolute;
    top: 0;
    width: 100%;
    background-color: rgba(0,0,0,0.3);
    z-index: -1;
    border-radius: 10px;
}
       
        
    </style>
    <section id="cover" class="min-vh-100">
        <div id="cover-caption">
            <div class="container">
                <div class="row text-white">
                    <div class ="col-xl-5 col-lg-6 col-md-8 col-sm-10 mx-auto text-center form p-4"
                         <div class="px-2">
                             <h1 class="display-4 py-2 text-truncate">Please login</h1>
                            <form class="justify-content-center" action="j_security_check" method="POST">
                               
                                <div class="form-group">
                                    <label class="sr-only">Username: </label>
                                    <input class="form-control" type="text" name="j_username"/></br>
                                </div>
                                <div class="form-group">
                                    <label class="sr-only">Parola </label>
                                    <input class="form-control"  type="password" name="j_password"/></br> 
                                </div>
                                <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
                            </form>

                        </div>
                    </div>
                </div>
            </div>
        </div>
     </section>
   
    
</t:pageTemplate>