package com.recruit.servlet;

import com.recruit.common.PositionDetails;
import com.recruit.ejb.PositionBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "DeletePositionServlet", urlPatterns = {"/DeletePositionServlet"})
public class DeletePositionServlet extends HttpServlet {
    
       @Inject
    PositionBean positionBean;
    

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int positionID=Integer.parseInt(request.getParameter("id"));
        PositionDetails positionDetails=positionBean.findById(positionID);

        request.setAttribute("position", positionDetails); 
        request.getRequestDispatcher("WEB-INF/delete-position.jsp").forward(request, response);
        
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        Integer idposition=Integer.parseInt(request.getParameter("idposition"));
        positionBean.deletePosition(idposition);
        
        response.sendRedirect(request.getContextPath()+"/PositionServlet");
        
    }

    
}
