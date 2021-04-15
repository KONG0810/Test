package com.koiwaLearning.api.domain;

//import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;
import java.sql.Timestamp;

//@JsonInclude(JsonInclude.Include.NON_NULL)

public class Scores {

    private String sno;

    private String cno;

    private String degree;

    public Scores() {
    }

    public Scores(String sno, String cno, String degree) {
        this.sno = sno;
        this.cno = cno;
        this.degree = degree;

    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
