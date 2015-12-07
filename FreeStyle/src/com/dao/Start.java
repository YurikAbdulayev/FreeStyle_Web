package com.dao;

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

/**
 * Created by yurs1 on 26.06.2015.
 */
@WebServlet("/startServ")
public class Start extends HttpServlet {

    AnnotationConfiguration configuration;

    public static Session session;
    SessionFactory sf;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Opening db connection");
        configuration = new AnnotationConfiguration().configure("hibernate.cfg.xml");
        sf = configuration.buildSessionFactory();
        session = sf.openSession();

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/start_page.jsp");
        dispatcher.forward(request, response);
    }
}
