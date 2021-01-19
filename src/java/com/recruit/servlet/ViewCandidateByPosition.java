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


@WebServlet(name = "ViewCandidateByPosition", urlPatterns = {"/ViewCandidateByPosition"})
public class ViewCandidateByPosition extends HttpServlet {

    @Inject
    CandidateBean candidate;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer idposition=Integer.parseInt(request.getParameter("idposition"));
        List<CandidateDetails>candidates=candidate.getCandidateByPosition(idposition);
        
        request.setAttribute("candidate", candidates);

        request.getRequestDispatcher("WEB-INF/list-all-candidates-for-position.jsp").forward(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

}
