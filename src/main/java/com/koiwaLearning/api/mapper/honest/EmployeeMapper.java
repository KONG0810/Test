package com.koiwaLearning.api.mapper.honest;

import com.koiwaLearning.api.domain.honest.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeMapper {

  List<Employee> getEmployeeList();

  Employee getEmployeeDetail(Integer eId);

  int insertEmployee(Employee employee);

  int updateEmployee(Employee employee);

  int deleteEmployee(Integer eId);

}
