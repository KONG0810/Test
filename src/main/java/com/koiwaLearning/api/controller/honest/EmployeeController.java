package com.koiwaLearning.api.controller.honest;

import com.koiwaLearning.api.domain.honest.Employee;
import com.koiwaLearning.api.service.honest.EmployeeService;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/honest")
public class EmployeeController {

    @Autowired
    private EmployeeService EmployeeService;

    /**
     * 跳转
     */
    @RequestMapping(value = { "/employee" }, method = RequestMethod.GET)
    public ModelAndView index(Model model) {

        System.out.println("welcome to honest employeeController");

        // DBから一覧検索
        List<Employee> employeeList = EmployeeService.getEmployeeList();

        System.out.println(employeeList);
        System.out.println(employeeList.size());

        // リポッジストリからフォームに変換
        // List<EmployeeForm> employeeFormList = employeeList
        // .stream().map(e -> EmployeeForm.builder()
        // .employeeId(e.getEmployeeId())
        // .employeeName(e.getEmployeeName())
        // .gender(e.getGender()).build()
        // ).collect(Collectors.toList());

        // DBからスキル検索
        // employeeFormList = employeeService.getEmployeeSkills(employeeFormList);

        // テンプレートに渡す値を設定
        // model.addAttribute("employeeFormList", employeeFormList);
        // model.addAttribute("loginId", loginId);
        // model.addAttribute("employeeName", employeeName);

        model.addAttribute("title", "会员管理");
        model.addAttribute("employeeList", employeeList);
        return new ModelAndView("honest/employee", "employeeModel", model);
    }
}
