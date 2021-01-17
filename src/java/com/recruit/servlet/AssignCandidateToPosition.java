/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recruit.servlet;

import com.recruit.ejb.CandidateBean;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "AssignCandidateToPosition", urlPatterns = {"/AssignCandidateToPosition"})
public class AssignCandidateToPosition extends HttpServlet {

      @Inject
    CandidateBean candidate;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       Integer idcandidate=Integer.parseInt(request.getParameter("idcandidate"));
        Integer idposition=Integer.parseInt(request.getParameter("idposition"));
        candidate.assignCandidateToPosition(idcandidate, idposition);
        response.sendRedirect(request.getContextPath()+"/PositionServlet");
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

}