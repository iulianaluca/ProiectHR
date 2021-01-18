package com.recruit.servlet;

import com.recruit.common.PositionDetails;
import com.recruit.ejb.PositionBean;
import com.recruit.entity.User;
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

@DeclareRoles({"DirectorGeneralRole", "DirectorHrRole", "DirectorDepartament", "RecruiterRole"})
@ServletSecurity(
        value = @HttpConstraint(rolesAllowed = {"DirectorGeneralRole", "DirectorHrRole", "DirectorDepartament", "RecruiterRole"})
)

@WebServlet(name = "EditPositionServlet", urlPatterns = {"/EditPositionServlet"})
public class EditPositionServlet extends HttpServlet {
    
       @Inject
    PositionBean positionBean;
    

    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int positionID=Integer.parseInt(request.getParameter("id"));
        PositionDetails positionDetails=positionBean.findById(positionID);
        
        request.setAttribute("position", positionDetails); 
        request.getRequestDispatcher("WEB-INF/edit-position.jsp").forward(request, response);
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
            Integer id=Integer.parseInt(request.getParameter("idposition"));
            
            positionBean.editPosition(id,nume, nr_persoane, department, cerinte, responsabilitati, proiect, opened, closed);
            
            response.sendRedirect(request.getContextPath()+"/PositionServlet");
       
    }


}
