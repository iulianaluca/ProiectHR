package com.recruit.servlet;

import com.recruit.common.PositionDetails;
import com.recruit.common.UserDetails;
import com.recruit.ejb.PositionBean;
import com.recruit.entity.Position;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "PositionServlet", urlPatterns = {"/PositionServlet"})
public class PositionServlet extends HttpServlet {

     @Inject
    PositionBean position;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //position.createPosition("test2", "test2", "test2", "test2", "test2", "test2", "test2", "test2");
        //user.createComment("alt test", 1);
        //position.deletePosition(8);
        //position.editPosition(1, "test2", "test2", "test2", "test2", "test2", "test2", "test2", "test2");
        List<PositionDetails> positions = position.getAllPositions();
        request.setAttribute("position", positions);

        request.getRequestDispatcher("WEB-INF/list-position.jsp").forward(request, response);
    }

}
