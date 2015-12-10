package com.processing;

import com.dao.Start;
import com.entity.MonOfUs;
import com.entity.Problem;
import com.entity.Users;
import org.hibernate.ObjectNotFoundException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by ���� on 22.11.2015.
 */
@WebServlet("/correct")
public class Correct_user extends HttpServlet {
    Users users = new Users();
    MonOfUs monOfUs = new MonOfUs();
    Problem problem = new Problem();

    Start start;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        users = (Users) start.session.load(Users.class, Integer.parseInt(request.getParameter("id")));
        monOfUs = (MonOfUs) start.session.load(MonOfUs.class, Integer.parseInt(request.getParameter("id")));
        problem = (Problem) start.session.load(Problem.class, Integer.parseInt(request.getParameter("id")));
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/correct_user.jsp");
        request.setAttribute("users", users);
        request.setAttribute("monofus", monOfUs);
        request.setAttribute("problem", problem);
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        System.out.println(id);
        start.session.beginTransaction();
        Users user = (Users) start.session.get(Users.class, Integer.parseInt(id));
        Problem problems = (Problem) start.session.get(Problem.class, Integer.parseInt(id));
        MonOfUs monOfUser = (MonOfUs) start.session.get(MonOfUs.class, Integer.parseInt(id));

        user.setNameOfUser(request.getParameter("c_name"));
        user.setUsername(request.getParameter("c_username"));
        user.setPhone(Integer.parseInt(request.getParameter("c_phone")));
        monOfUser.setCredit(Integer.parseInt(request.getParameter("c_credit")));
        user.setTariff(Integer.parseInt(request.getParameter("c_tariff")));
        user.setAddres(request.getParameter("c_addres"));
        user.setOnline(request.getParameter("c_online"));
        user.setIpaddres(request.getParameter("c_ip"));
        monOfUser.setDaterenewal(request.getParameter("c_data_ren"));
        monOfUser.setNewrenewal(Integer.parseInt(request.getParameter("c_newren")));
        problems.setProblem(request.getParameter("c_problem"));

        start.session.getTransaction().commit();
            users = (Users) start.session.load(Users.class, Integer.parseInt(id));
            monOfUs = (MonOfUs) start.session.load(MonOfUs.class, Integer.parseInt(id));
            problem = (Problem) start.session.load(Problem.class, Integer.parseInt(id));
        Boolean s = true;
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/thisclient.jsp");

        request.setAttribute("users", users);
        request.setAttribute("monofus", monOfUs);
        request.setAttribute("problem", problem);
        request.setAttribute("tm", s);
        dispatcher.forward(request, response);

    }
}
