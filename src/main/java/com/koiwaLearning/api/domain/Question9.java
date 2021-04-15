package com.koiwaLearning.api.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)

public class Question9 {

    private String MinBirthday;

    private String MaxBirthday;



    @Override
    public String toString() {
        return "Question9{" +
                "MinBirthday='" + MinBirthday + '\'' +
                ", MaxBirthday='" + MaxBirthday + '\'' +
                '}';
    }

    public String getMinBirthday() {
        return MinBirthday;
    }

    public void setMinBirthday(String minBirthday) {
        MinBirthday = minBirthday;
    }

    public String getMaxBirthday() {
        return MaxBirthday;
    }

    public void setMaxBirthday(String maxBirthday) {
        MaxBirthday = maxBirthday;
    }
}
