/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recruit.servlet;

import com.recruit.common.CandidateDetails;
import com.recruit.ejb.CandidateBean;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author PC
 */
@WebServlet(name = "AddCandidateToPosition", urlPatterns = {"/AddCandidateToPosition"})
public class AddCandidateToPosition extends HttpServlet {

    @Inject
    CandidateBean candidate;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        List<CandidateDetails> candidates = candidate.getAllCandidates();
        Integer idposition = Integer.parseInt(request.getParameter("idposition"));
        request.setAttribute("candidate", candidates);
        request.setAttribute("idposition", idposition);
        request.getRequestDispatcher("WEB-INF/list-candidate-for-position.jsp").forward(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
}
