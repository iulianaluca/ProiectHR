package com.recruit.servlet;

import com.recruit.ejb.PositionBean;
import com.recruit.ejb.UserBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AddPositionServlet", urlPatterns = {"/AddPositionServlet"})
public class AddPositionServlet extends HttpServlet {

    @Inject
    PositionBean positionBean;
    @Inject
    UserBean userBean;
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.getRequestDispatcher("/WEB-INF/create-position.jsp").forward(request, response);
        
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
            String nume = request.getParameter("nume");
            String nr_persoane = request.getParameter("nr_persoane");
            String department = request.getParameter("department");
            String cerinte = request.getParameter("cerinte");
            String responsabilitati = request.getParameter("responsabilitati");
            String proiect = request.getParameter("proiect");
            String opened = request.getParameter("opened");
            String closed = request.getParameter("closed");
            String username=request.getParameter("username");
            Integer user_id=userBean.findByUsername(username);
            System.out.println(username);
            System.out.println(user_id);
        
            positionBean.createPosition(nume,nr_persoane , department, cerinte, responsabilitati, proiect, opened,closed,user_id);
            
            response.sendRedirect(request.getContextPath()+"/PositionServlet");
        
        

 
        
        
    }

}
