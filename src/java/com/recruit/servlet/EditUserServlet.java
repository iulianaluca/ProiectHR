/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author Iuliana
 */
@WebServlet(name = "EditUserServlet", urlPatterns = {"/EditUserServlet"})
public class EditUserServlet extends HttpServlet {
    @Inject
    UserBean userBean;

   @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        int userID=Integer.parseInt(request.getParameter("id"));
        UserDetails userDetails=userBean.findById(userID);
        
        request.setAttribute("user", userDetails); 
        request.getRequestDispatcher("WEB-INF/edit-user.jsp").forward(request, response);
    }
    

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
        Integer id=Integer.parseInt(request.getParameter("id"));
        userBean.editUser(id, nume, prenume, telefon, mobil, email, functie, descriere);
        
        response.sendRedirect(request.getContextPath()+"/UserServlet");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
