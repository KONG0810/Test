package com.koiwaLearning.api.controller.honest;

import com.koiwaLearning.api.domain.honest.Employee;
import com.koiwaLearning.api.domain.honest.EmployeeId;
import com.koiwaLearning.api.service.honest.EmployeeService;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/employee")
public class EmployeeDetailController {

    @Autowired
    private EmployeeService EmployeeService;

    /**
     * 跳转
     * 
     * /1/edit => @PathVariable(value = "eid") ?eID=1 => @RequestParam(value ="eId")
     */
    @RequestMapping(value = { "/{eid:\\d+}/edit" }, method = RequestMethod.GET)
    public ModelAndView employeeEdit(Model model, @PathVariable(value = "eid", required = true) Integer eid) {
        // System.out.println(eid);
        Employee eDetail = EmployeeService.getEmployeeDetail(eid);
        model.addAttribute("title", "edit");
        model.addAttribute("info", eDetail);
        return new ModelAndView("honest/employeeDetail", "employeeDetail", model);
    }

    /**
     * 
     */
    @RequestMapping(value = { "/addEmployee" }, method = RequestMethod.GET)
    public ModelAndView addEmployee(Model model) {
        model.addAttribute("title", "add");
        return new ModelAndView("honest/employeeDetail", "employeeDetail", model);
    }

    /**
     * 
     */
    @RequestMapping(value = { "/delete" }, method = RequestMethod.DELETE)
    public ModelAndView deleteEmployee(@RequestBody EmployeeId eId) {
        System.out.println("delete");
        System.out.println(eId.getEId());
        // EmployeeService.deleteEmployee(eId.getEId());
        return new ModelAndView("honest/employee");
    }

    /**
     * 
     */
    @RequestMapping(value = { "/update" }, method = RequestMethod.POST)
    public void updateEmployee(@RequestBody Employee user) throws IOException {
        System.out.println(user.getEmployeeId() + "-----" + user.getEmail());
        EmployeeService.updateEmployee(user);
        System.out.println("update");
        // ModelAndView model = new ModelAndView("redirect:/honest/employee");
        return;
    }

    /**
     * 
     */
    @RequestMapping(value = { "/add" }, method = RequestMethod.POST)
    public void addEmployee(@RequestBody Employee user) {
        System.out.println(user);
        EmployeeService.insertEmployee(user);
        System.out.println("add");
        return;
    }

}