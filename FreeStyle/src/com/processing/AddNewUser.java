package com.processing;

import com.dao.Start;
import com.entity.MonOfUs;
import com.entity.Problem;
import com.entity.Users;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by yurs1 on 22.06.2015.
 */
@WebServlet("/addNewUser")
public class AddNewUser extends HttpServlet {
        Users users = new Users();
        Start start;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        start.session.beginTransaction();

        Users newUser = new Users(request.getParameter("tflogin"),
                request.getParameter("tfname"),
                Integer.parseInt(request.getParameter("tfphone")),
                0,
                Integer.parseInt(request.getParameter("tftariff")),
                request.getParameter("tfaddres"),
                "No",
                request.getParameter("tfip"));
        Problem userProblem = new Problem("NO");
        MonOfUs mn = new MonOfUs(0, Integer.parseInt(request.getParameter("tftariff")), 0, "0");
        start.session.save(mn);
        start.session.save(userProblem);
        start.session.save(newUser);
        start.session.getTransaction().commit();

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/all_users_table");
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/newUser.jsp");
        dispatcher.forward(request, response);
    }
}
