package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by yurs1 on 23.06.2015.
 */


@Entity
@Table(name="money_organization")
public class MoneyOrganization {
    @Id
    public  int id;
    public  String data;
    public  String base;




    public MoneyOrganization(){}

    public MoneyOrganization(String data, String base){
        this.data = data;
        this.base = base;
    }

    public void setId(int id){this.id = id;}

    public int getId(){return id;}

    public void setData(String data){this.data = data;}

    public String getData(){return data;}

    public void setBase(String base){this.base = base;}

    public String getBase(){return base;}
}
