package com.processing;

import com.dao.Start;
import com.entity.MoneyOrganization;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by yurs1 on 23.06.2015.
 */
@WebServlet("/getMonServ")
public class GetMonServ extends HttpServlet {
    MoneyOrganization mn = new MoneyOrganization();
    Start start;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        mn = (MoneyOrganization) start.session.load(MoneyOrganization.class, 1);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/clients.jsp");
        request.setAttribute("data",mn.getData());
        request.setAttribute("base", mn.getBase());
        dispatcher.forward(request, response);
    }

}
