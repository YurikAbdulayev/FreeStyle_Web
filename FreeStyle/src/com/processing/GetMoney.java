package com.processing;

import com.dao.Start;
import com.entity.MonOfUs;
import com.entity.MoneyOrganization;
import com.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by yurs1 on 26.06.2015.
 */
@WebServlet("/getMoney")
public class GetMoney extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    Start start;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<MonOfUs> monOfUsList;
        monOfUsList = start.session.createQuery("from MonOfUs").list();
        Users users = new Users();
        MoneyOrganization mo;
        mo = (MoneyOrganization) start.session.load(MoneyOrganization.class, 1);

        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        if(mo.getData() != dateFormat.format(currentDate)) {
            mo.setData(dateFormat.format(currentDate));

            for (MonOfUs ms : monOfUsList) {
                start.session.beginTransaction();
                if (ms.getCredit() > (ms.getTariff() - 1)) {
                    ms.setCredit(ms.getCredit() - ms.getTariff());

                    users = (Users) start.session.load(Users.class, ms.getId());
                    users.setOnline("YES");
                } else {
                    users = (Users) start.session.load(Users.class, ms.getId());
                    users.setOnline("NO");
                }
                start.session.getTransaction().commit();
            }
        }
    }
}
