package com.processing;

import com.dao.Start;
import com.entity.MonOfUs;
import com.entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by yurs1 on 24.06.2015.
 */
@WebServlet("/reneval")
public class Reneval extends HttpServlet {
    MonOfUs monOfUs = new MonOfUs();
    Users users = new Users();
    Date currentDate = new Date();
    SimpleDateFormat dateFormat = null;
    Start start;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        start.session.beginTransaction();

        monOfUs = (MonOfUs) start.session.load(MonOfUs.class, Integer.parseInt(request.getParameter("idcount")));
        users = (Users) start.session.load(Users.class, Integer.parseInt(request.getParameter("idcount")));
        monOfUs.setCredit(Integer.parseInt(request.getParameter("summtf"))+monOfUs.getCredit());
        monOfUs.setNewrenewal(Integer.parseInt(request.getParameter("summtf")));
        monOfUs.setDaterenewal(dateFormat.format(currentDate));
        users.setMoney(Integer.parseInt(request.getParameter("summtf")));
        start.session.getTransaction().commit();

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/corporate.jsp");
        dispatcher.forward(request, response);


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
