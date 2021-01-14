/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recruit.servlet;

import com.recruit.ejb.CandidateBean;
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
 * @author enead
 */
@WebServlet(name = "AddCandidateServlet", urlPatterns = {"/AddCandidateServlet"})
public class AddCandidateServlet extends HttpServlet {

    @Inject
    CandidateBean candidateBean;
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        candidateBean.assignCandidateToPosition(1, 2);
        //request.getRequestDispatcher("/WEB-INF/create-candidate.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nume = request.getParameter("nume");
        String prenume = request.getParameter("prenume");
        String telefon =request.getParameter("telefon");
        String adresa = request.getParameter("mobil");
        String email=request.getParameter("email");
        String cv=request.getParameter("cv");
      
        Boolean relocare= true;
        Boolean acceptat= true;
        
        // public void createCandidate(boolean acceptat, String adresa, String email, String nume, String prenume,String cv, boolean relocare, String telefon) {
        candidateBean.createCandidate(acceptat, adresa, email, nume, prenume, cv, relocare, telefon);
        
        response.sendRedirect(request.getContextPath()+"/CandidateServlet");
    }

}
