package com.recruit.servlet;

import com.recruit.common.PositionDetails;
import com.recruit.common.UserDetails;
import com.recruit.ejb.PositionBean;
import com.recruit.entity.Position;
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

@DeclareRoles({"DirectorGeneralRole", "DirectorHrRole", "DirectorDepartament", "RecruiterRole", "ViewerRole"})
@ServletSecurity(
        value = @HttpConstraint(rolesAllowed = {"DirectorGeneralRole", "DirectorHrRole", "DirectorDepartament", "RecruiterRole", "ViewerRole"})
)

@WebServlet(name = "PositionServlet", urlPatterns = {"/PositionServlet"})
public class PositionServlet extends HttpServlet {

     @Inject
    PositionBean positionBean;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<PositionDetails> positions = positionBean.getAllPositions();
        request.setAttribute("position", positions);

        request.getRequestDispatcher("WEB-INF/list-position.jsp").forward(request, response);
    }

}
