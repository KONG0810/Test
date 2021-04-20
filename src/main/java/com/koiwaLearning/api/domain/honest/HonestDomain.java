package com.koiwaLearning.api.domain.honest;

import java.sql.Timestamp;

public class HonestDomain {

    // ログインID
    private String loginId;

    // ログインPW
    private String loginPw;

    // 有効ユーザー
    private String user;

    // ログイン時間
    private Timestamp loginTimestamp;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getLoginPw() {
        return loginPw;
    }

    public void setLoginPw(String loginPw) {
        this.loginPw = loginPw;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Timestamp getLoginTimestamp() {
        return loginTimestamp;
    }

    public void setLoginTimestamp(Timestamp loginTimestamp) {
        this.loginTimestamp = loginTimestamp;
    }

    @Override
    public String toString() {
        return "HonestDomain [loginId=" + loginId + ", loginPw=" + loginPw + ", loginTimestamp=" + loginTimestamp + "]";
    }

    public HonestDomain(String loginId, String loginPw, Timestamp loginTimestamp) {
        this.loginId = loginId;
        this.loginPw = loginPw;
        this.loginTimestamp = loginTimestamp;
    }

}
