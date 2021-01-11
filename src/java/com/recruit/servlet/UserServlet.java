package com.recruit.servlet;

import com.recruit.common.UserDetails;
import com.recruit.ejb.UserBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UserServlet", urlPatterns = {"/UserServlet"})
public class UserServlet extends HttpServlet {
    
    @Inject
    UserBean user;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //user.createUser("Adi", "Ionescu", 072753453, 0340312352, "nelu.tataru@hoo.com", "ionel", "ceva", "mai tare");
       
        //user.createComment("alt test", 1);
        List<UserDetails> users = user.getAllUsers();
        request.setAttribute("user", users);

        request.getRequestDispatcher("WEB-INF/list-user.jsp").forward(request, response);
        //user.deleteUser(3);
    }
}
