package com.recruit.servlet;

import com.recruit.common.UserDetails;
import com.recruit.ejb.UserBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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

@WebServlet(name = "UserServlet", urlPatterns = {"/UserServlet"})
public class UserServlet extends HttpServlet {
    
    @Inject
    UserBean user;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<UserDetails> users = user.getAllUsers();
        request.setAttribute("user", users);

        request.getRequestDispatcher("WEB-INF/list-user.jsp").forward(request, response);
    }
}
