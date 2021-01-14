/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.recruit.servlet;

import com.recruit.common.CandidateDetails;
import com.recruit.ejb.CandidateBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
@WebServlet(name = "CandidateServlet", urlPatterns = {"/CandidateServlet"})
public class CandidateServlet extends HttpServlet {

   @Inject
   CandidateBean candidate;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      //user.createUser("Adi", "Ionescu", 072753453, 0340312352, "nelu.tataru@hoo.com", "ionel", "ceva", "mai tare");
       
        //user.createComment("alt test", 1);
        List<CandidateDetails> candidates = candidate.getAllCandidates();
        request.setAttribute("candidate", candidates);

        request.getRequestDispatcher("WEB-INF/list-candidate.jsp").forward(request, response);
        //user.deleteUser(3);
    }


    
}
