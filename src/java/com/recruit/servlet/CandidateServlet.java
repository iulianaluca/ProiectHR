
package com.recruit.servlet;

import com.recruit.common.CandidateDetails;
import com.recruit.ejb.CandidateBean;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.annotation.security.DeclareRoles;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@DeclareRoles(("AdminRole"))
@ServletSecurity(
        value = @HttpConstraint(rolesAllowed = {"AdminRole"})
)

@WebServlet(name = "CandidateServlet", urlPatterns = {"/CandidateServlet"})
public class CandidateServlet extends HttpServlet {

   @Inject
   CandidateBean candidate;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
  
        
        List<CandidateDetails> candidates = candidate.getAllCandidates();
        request.setAttribute("candidate", candidates);

        request.getRequestDispatcher("WEB-INF/list-candidate.jsp").forward(request, response);
    }


    
}
