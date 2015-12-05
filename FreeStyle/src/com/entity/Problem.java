package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by yurs1 on 27.06.2015.
 */

@Entity
@Table(name="lan_problem")
public class Problem {

    @Id
    public int id;
    public String problem;

    public Problem(){}

    public Problem(String problem){
        this.problem = problem;
    }

    public int getId(){return id;}

    public void setId(int id){this.id = id;}

    public String getProblem(){return problem;}

    public void setProblem(String problem){this.problem = problem;}
}
