
package com.recruit.servlet;

import com.recruit.common.CandidateDetails;
import com.recruit.ejb.CandidateBean;
import java.io.IOException;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "EditCandidateServlet", urlPatterns = {"/EditCandidateServlet"})
public class EditCandidateServlet extends HttpServlet {

   
       @Inject
    CandidateBean candidate;
    

    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int positionID=Integer.parseInt(request.getParameter("idcandidate"));
        CandidateDetails candidateDetails=candidate.findById(positionID);
        
        request.setAttribute("candidate", candidateDetails); 
        request.getRequestDispatcher("WEB-INF/edit-candidate.jsp").forward(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String nume = request.getParameter("nume");
            String prenume = request.getParameter("prenume");
            String telefon = request.getParameter("telefon");
            String email = request.getParameter("email");
            String adresa = request.getParameter("adresa");
            String cv = request.getParameter("cv");
            Boolean relocare = Boolean.parseBoolean(request.getParameter("relocare"));
            Boolean acceptat = Boolean.parseBoolean(request.getParameter("acceptat"));
            Integer id=Integer.parseInt(request.getParameter("idcandidate"));
            
            candidate.editCandidate(id,acceptat, adresa, email, nume, prenume, relocare, telefon, cv);
            
            response.sendRedirect(request.getContextPath()+"/CandidateServlet");
       
    }
}
