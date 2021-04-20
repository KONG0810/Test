package com.koiwaLearning.api.controller;

import com.koiwaLearning.api.domain.StudentDetail;
import com.koiwaLearning.api.domain.Students;
import com.koiwaLearning.api.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Timestamp;
//import java.util.List;


@RestController
@RequestMapping("/students")
public class StudentsController {

    @Autowired
    private StudentsService studentsService;



    // 検索
    @RequestMapping(value = {"/getStudents"}, method = RequestMethod.GET)
    public ModelAndView getStudents(Model model) {
        model.addAttribute("studentsList",studentsService.getStudents());
        model.addAttribute("title", "学生信息");
        return new ModelAndView("students/studentsSelect","studentsModel",model);
    }

    /**
     * 查询学生
     */
    @RequestMapping(value = "/getStudent", method = RequestMethod.GET)
    public StudentDetail getStudent(@RequestParam("studentId") String studentId) {

        StudentDetail student = studentsService.getStudent(studentId);

        return student;
    }



    // 追加
    @RequestMapping(value = {"/students/insert"}, method = RequestMethod.GET)
    public int insertStudents() {
        Students students = new Students();
        students.setSno("123");
        students.setSname("AAA");
        students.setSsex("M");
        students.setSbirthday(Timestamp.valueOf("2021-02-17 01:02:03"));
        students.setSclass("#A");
        return studentsService.insertStudents(students);
    }

    // 更新
    @RequestMapping(value = {"/students/update"}, method = RequestMethod.GET)
    public int updateStudents() {
        Students students = new Students();
        students.setSno("123");
        students.setSname("BBB");
        students.setSclass("#B");
        return studentsService.updateStudents(students);
    }

    // 削除
    @RequestMapping(value = {"/students/delete"}, method = RequestMethod.GET)
    public int deleteStudents() {
        String sno = "123";
        return studentsService.deleteStudents(sno);
    }
}
