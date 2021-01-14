package com.recruit.servlet;

import com.recruit.common.CandidateDetails;
import com.recruit.common.UserDetails;
import com.recruit.ejb.CandidateBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "DeleteCandidateServlet", urlPatterns = {"/DeleteCandidateServlet"})
public class DeleteCandidateServlet extends HttpServlet {
    
    @Inject
    CandidateBean candidate;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        int candidateID=Integer.parseInt(request.getParameter("idcandidate"));
        CandidateDetails candidateDetails=candidate.findById(candidateID);
        
        request.setAttribute("candidate", candidateDetails); 
        request.getRequestDispatcher("WEB-INF/delete-candidate.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer id=Integer.parseInt(request.getParameter("idcandidate"));
        candidate.deleteCandidate(id);
        
        response.sendRedirect(request.getContextPath()+"/CandidateServlet");
    }
}
