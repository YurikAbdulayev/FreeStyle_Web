package com.processing;

import com.dao.Start;
import com.entity.TarifPlan;
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
import java.util.List;

/**
 * Created by yurs1 on 26.06.2015.
 */
@WebServlet("/getTarPlan")


public class GetTarPl extends HttpServlet {

    TarifPlan tarifPlan = new TarifPlan();
    Start start;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("post");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



        tarifPlan = (TarifPlan) start.session.load(TarifPlan.class, 1);
        request.setAttribute("tarpl1", tarifPlan);
        tarifPlan = (TarifPlan) start.session.load(TarifPlan.class, 2);
        request.setAttribute("tarpl2", tarifPlan);
        tarifPlan = (TarifPlan) start.session.load(TarifPlan.class, 3);
        request.setAttribute("tarpl3", tarifPlan);


        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/business.jsp");

        dispatcher.forward(request, response);
    }
}
