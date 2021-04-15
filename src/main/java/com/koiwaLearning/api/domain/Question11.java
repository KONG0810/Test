package com.koiwaLearning.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class Question11 {

    private String tname;

    private String cname;

    @Override
    public String toString() {
        return "Question11{" +
                "tname='" + tname + '\'' +
                ", cname='" + cname + '\'' +
                '}';
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
