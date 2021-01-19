package com.recruit.servlet;

import com.recruit.ejb.UserBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.annotation.security.DeclareRoles;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@DeclareRoles({"DirectorGeneralRole", "AdminRole"})
@ServletSecurity(
        value = @HttpConstraint(rolesAllowed = {"DirectorGeneralRole", "AdminRole"})
)


@WebServlet(name = "AddUserServlet", urlPatterns = {"/AddUserServlet"})
public class AddUserServlet extends HttpServlet {
    @Inject
    UserBean userBean;
   
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/create-user.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nume = request.getParameter("nume");
        String prenume = request.getParameter("prenume");
        Integer telefon =Integer.parseInt(request.getParameter("telefon"));
        Integer mobil = Integer.parseInt(request.getParameter("mobil"));
        String email=request.getParameter("email");
        String functie=request.getParameter("functie");
        String descriere=request.getParameter("descriere");
        String password=request.getParameter("password");
       userBean.createUser(nume, prenume, telefon, mobil, email,password, functie, descriere);
    
        
        response.sendRedirect(request.getContextPath()+"/UserServlet");
    }


}
