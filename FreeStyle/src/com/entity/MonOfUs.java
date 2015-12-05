package com.entity;

import javax.persistence.*;
import java.util.List;

/**
 * Created by yurs1 on 23.06.2015.
 */

@Entity
@Table(name="user_money")
public class MonOfUs {
    @Id
    public int id;
    public int credit;
    public int tariff;
    public int newrenewal;
    public String daterenewal;

//    @OneToMany(mappedBy = "monofus")
//    List<Users> usersList;

    public MonOfUs(){}

    public MonOfUs(int credit, int tariff, int newrenewal, String daterenewal){
        this.credit = credit;
        this.tariff = tariff;
        this.newrenewal = newrenewal;
        this.daterenewal = daterenewal;
    }

    public String getDaterenewal(){return daterenewal;}

    public void setDaterenewal(String daterenewal){this.daterenewal = daterenewal;}

    public void setMonOfUs(int credit){
        this.credit = credit;
    }

    public int getNewrenewal(){return newrenewal;}

    public void setNewrenewal(int newrenewal){this.newrenewal = newrenewal;}

    public int getId(){return id;}

    public void setId(int id){this.id = id;}

    public int getCredit(){return credit;}

    public void setCredit(int credit){this.credit = credit;}

    public int getTariff(){return tariff;}

    public void setTariff(int tariff){this.tariff = tariff;}


}
