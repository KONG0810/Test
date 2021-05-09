package com.koiwaLearning.api.service.honest;

import com.koiwaLearning.api.domain.honest.HonestDomain;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HonestService {

  // 検索
  public HonestDomain loginCheck(HonestDomain honestDomain) {

    if (!honestDomain.getLoginId().equals("id")) {
      honestDomain.setUser("NG");
      System.out.println("login id NG " + honestDomain.getLoginId());
      return honestDomain;
    }

    if (!honestDomain.getLoginPw().equals("pw")) {
      honestDomain.setUser("NG");
      System.out.println("login pw NG " + honestDomain.getLoginPw());
      return honestDomain;
    }

    honestDomain.setLoginTimestamp(null);
    honestDomain.setUser("OK");

    System.out.println("login ok");

    return honestDomain;
  }

  public void loginTimestamp(HonestDomain honestDomain) {

    honestDomain.setLoginTimestamp(null);
    honestDomain.setUser("set time OK2");
  }
}
