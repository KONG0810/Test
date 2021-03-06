package com.koiwaLearning.api.domain.honest;

import java.io.Serializable;
import java.util.Set;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Tolerate;

// @SuppressWarnings("serial")
@Data
@Builder
public class Employee implements Serializable {

  // private static final long serialVersionUID = 1L;

  private Integer employeeId;
  private String employeeName;
  private Integer gender;
  private String address;
  private String tel;
  private String email;
  private String loginId;
  private String password;
  private Integer authority;
  private Integer deleteFlag;
  private String createdAt;
  // private String skills;

  @Tolerate
  public Employee() {
  }

}
