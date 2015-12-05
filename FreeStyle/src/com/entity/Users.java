package com.entity;

import javax.persistence.*;


@Entity
@Table(name="users_base")
public class Users {
    @Id
    private int id;
    private String username;
    private String nameofuser;
    private int phone;
    private int money;
    private int tariff;
    private String addres;
    private String online;
    private String ipaddres;

//    @ManyToOne
//    @JoinColumn(name = "credit")
//    MonOfUs monofus;

    public Users() {}

    public Users(String username, String nameofuser, int phone, int money, int tariff, String addres, String online, String ipaddres) {
        this.username = username;
        this.nameofuser = nameofuser;
        this.phone = phone;
        this.money = money;
        this.tariff = tariff;
        this.addres = addres;
        this.online = online;
        this.ipaddres = ipaddres;

    }

//    public MonOfUs getMonOfUs(){return monofus;}
//
//    public void setMonOfUs(MonOfUs monofus){this.monofus = monofus;}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getNameofuser() {
        return nameofuser;
    }

    public void setNameOfUser(String nameofuser) {
        this.nameofuser = nameofuser;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getMoney(){return money;}

    public void setMoney(int money){this.money = money;}

    public int getTariff() {
        return tariff;
    }

    public void setTariff(int tariff) {
        this.tariff = tariff;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getOnline(){return online;}

    public void setOnline(String online){this.online =online;}

    public String getIpaddres(){return ipaddres;}

    public void setIpaddres(String ipaddres){this.ipaddres = ipaddres;}
}
