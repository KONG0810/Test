package com.koiwaLearning.api.domain;

public class ScoreDetail {

    private String sno;

    private String cno;

    private String degree;


    public ScoreDetail() {
    }

    public ScoreDetail(String sno, String cno, String degree) {
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
