package com.recruit.servlet;

import com.recruit.common.UserDetails;
import com.recruit.ejb.UserBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "DeleteUserServlet", urlPatterns = {"/DeleteUserServlet"})
public class DeleteUserServlet extends HttpServlet {
    @Inject
    UserBean userBean;
    


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        int userID=Integer.parseInt(request.getParameter("id"));
        UserDetails userDetails=userBean.findById(userID);
        
        request.setAttribute("user", userDetails); 
        request.getRequestDispatcher("WEB-INF/delete-user.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer id=Integer.parseInt(request.getParameter("id"));
        userBean.deleteUser(id);
        
        response.sendRedirect(request.getContextPath()+"/UserServlet");
    }


}
