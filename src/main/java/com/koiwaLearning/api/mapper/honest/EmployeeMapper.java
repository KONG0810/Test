package com.koiwaLearning.api.mapper.honest;

import com.koiwaLearning.api.domain.honest.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeMapper {

  List<Employee> getEmployeeList();

}
