package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by yurs1 on 26.06.2015.
 */

@Entity
@Table(name="tariff_plan")
public class TarifPlan {
    @Id
    public int id;
    public String news;

    public int getId(){return id;}

    public void setId(int id){this.id = id;}

    public String getNews() {return news;}

    public void setNews(String news){this.news = news;}

}
