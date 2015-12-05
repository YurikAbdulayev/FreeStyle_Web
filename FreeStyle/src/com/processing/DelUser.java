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
import javax.swing.*;
import java.io.IOException;

/**
 * Created by yurs1 on 26.06.2015.
 */
@WebServlet("/delUser")
public class DelUser extends HttpServlet {
    Users users = new Users();
    MonOfUs monOfUs = new MonOfUs();
    Problem problem = new Problem();
    Start start;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            start.session.beginTransaction();
            users = (Users) start.session.load(Users.class, Integer.parseInt(request.getParameter("iddel")));
            start.session.delete(users);
            monOfUs = (MonOfUs) start.session.load(MonOfUs.class, Integer.parseInt(request.getParameter("iddel")));
            start.session.delete(monOfUs);
            problem = (Problem) start.session.load(Problem.class, Integer.parseInt(request.getParameter("iddel")));
            start.session.delete(problem);
            response.sendRedirect("/all_users_table");
            start.session.getTransaction().commit();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error", "error 'dell'", JOptionPane.OK_OPTION);
            response.sendRedirect("/getMonServ");
//            out.println("<script type=\"text/javascript\">");
//            out.println("alert('User or password incorrect');");
//            out.println("location='index.jsp';");
//            out.println("</script>");


        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
