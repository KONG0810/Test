package com.koiwaLearning.api.service.honest;

import com.koiwaLearning.api.domain.honest.Employee;
import com.koiwaLearning.api.mapper.honest.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

  @Autowired
  private EmployeeMapper EmployeeMapper;

  // 検索
  public List<Employee> getEmployeeList() {
    return EmployeeMapper.getEmployeeList();
  }

  public Employee getEmployeeDetail(Integer eId) {
    return EmployeeMapper.getEmployeeDetail(eId);
  }

  public void insertEmployee(Employee employee) {
    EmployeeMapper.insertEmployee(employee);
    return;
  }

  public void updateEmployee(Employee employee) {
    EmployeeMapper.updateEmployee(employee);
    return;
  }

  public void deleteEmployee(Integer eId) {
    EmployeeMapper.deleteEmployee(eId);
    return;
  }

}
