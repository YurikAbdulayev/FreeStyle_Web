package com.processing;

import com.dao.Start;
import com.entity.Users;

import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.Date;
import java.util.List;

/**
 * Created by админ on 23.12.2014.
 */
@WebServlet("/users_table")
public class UsersTable extends javax.servlet.http.HttpServlet {
    List<Users> usersList;
    Users users = new Users();

    Start start;
    public void executeQuery() {
        System.out.println("query");
        usersList = start.session.createQuery("from Users").list();
        System.out.println(new java.util.Date().getDay()+"."+new Date().getMonth()+"."+new Date().getYear());
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("Start post");

    }


    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        System.out.println("OP doGet UsersTable");
        try {
            String s = "test message";

        executeQuery();

            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/all_users_table.jsp");
            request.setAttribute("usersList", usersList);
            request.setAttribute("tm", s);
            dispatcher.forward(request, response);

        }catch (Exception e){
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/corporate.jsp");
            dispatcher.forward(request, response);

        }
    }
}
