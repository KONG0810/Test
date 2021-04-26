package com.koiwaLearning.api.domain.honest;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee implements Serializable {

  private static final long serialVersionUID = 1L;

  private Integer employeeId;
  private String employeeName;
  private Integer gender;
  private String address;
  private String tel;
  private String Email;
  private String loginId;
  private String password;
  private Integer authority;
  private Integer deleteFlag;
  private String createdAt;
}
