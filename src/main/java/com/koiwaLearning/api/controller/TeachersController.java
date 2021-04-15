package com.koiwaLearning.api.controller;

import com.koiwaLearning.api.domain.TeacherDetail;
import com.koiwaLearning.api.domain.Teachers;
import com.koiwaLearning.api.service.TeachersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/teachers")
public class TeachersController {

    @Autowired
    private TeachersService teachersService;



    // 検索
    @RequestMapping(value = {"/getTeachers"}, method = RequestMethod.GET)
    public ModelAndView getTeachers(Model model) {
        model.addAttribute("teachersList",teachersService.getTeachers());
        model.addAttribute("title", "Teachers信息");
        return new ModelAndView("teachers/teachersSelect","teachersModel",model);
    }

    /**
     * 查询Teacher
     */
    @RequestMapping(value = "/getTeacher", method = RequestMethod.GET)
    public TeacherDetail getTeacher(@RequestParam("teacherId") String teacherId) {

        TeacherDetail teacher = teachersService.getTeacher(teacherId);

        return teacher;
    }


    /*// 追加
    @RequestMapping(value = {"/teachers/insert"}, method = RequestMethod.GET)
    public int insertTeachers() {
        Teachers teachers = new Teachers();
        teachers.setTno("101");
        teachers.setTname("AAA");
        teachers.setTsex("M");
        teachers.setTbirthday(Timestamp.valueOf("2021-02-17 01:02:03"));
        teachers.setProf("AAAAA");   //????????????
        teachers.setDepart("AAAAA");  //????????????
        return teachersService.insertTeachers(teachers);
    }

    // 更新
    @RequestMapping(value = {"/teachers/update"}, method = RequestMethod.GET)
    public int updateTeachers() {
        Teachers teachers = new Teachers();
        teachers.setTno("123");
        teachers.setTname("BBB");
        teachers.setProf("#B");//？？？？？？？？？？？
        teachers.setDepart("#B");//？？？？？？？？
        return teachersService.updateTeachers(teachers);
    }

    // 削除
    @RequestMapping(value = {"/teachers/delete"}, method = RequestMethod.GET)
    public int deleteTeachers() {
        String tno = "123";
        return teachersService.deleteTeachers(tno);
    }*/
}
