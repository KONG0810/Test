package com.koiwaLearning.api.domain.honest;

import java.io.Serializable;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeId implements Serializable {

  private Integer eId;

}
