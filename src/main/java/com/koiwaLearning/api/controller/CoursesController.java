package com.koiwaLearning.api.controller;


import com.koiwaLearning.api.domain.Courses;
import com.koiwaLearning.api.domain.CourseDetail;
import com.koiwaLearning.api.service.CoursesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CoursesController {

    @Autowired
    private CoursesService CoursesService;


    //検索
    @RequestMapping(value = {"/getCourses"}, method = RequestMethod.GET)
    public ModelAndView getCourses(Model model) {
        model.addAttribute("coursesList",CoursesService.getCourses());
        model.addAttribute("title", "Courses信息");
        return new ModelAndView("courses/coursesSelect","coursesModel",model);
    }

    /**
     * 查询課程
     */
    @RequestMapping(value = "/getCourse", method = RequestMethod.GET)
    public CourseDetail getCourse(@RequestParam("courseId") String courseId) {

        CourseDetail course = CoursesService.getCourse(courseId);

        return course;
    }

    /*//追加
    @RequestMapping(value = {"/courses/insert"},method = RequestMethod.GET)
    public int insertCourses(){
        Courses courses = new Courses();
        courses.setCno("3-101");
        courses.setCname("CCCC");
        courses.setTno("111");
        return CoursesService.insertCourses(courses);
    }

    //更新
    @RequestMapping(value = {"/courses/update"},method = RequestMethod.GET)
    public int updateCourses(){
        Courses courses = new Courses();
        courses.setCno("3-101");
        courses.setCname("DDDDDDDD");
        courses.setTno("120");
        return CoursesService.updateCourses(courses);
    }

    //削除
    @RequestMapping(value = {"/courses/delete"},method = RequestMethod.GET)
    public int deleteCourses(){
        String cno = "3-101";
        return CoursesService.deleteCourses(cno);
    }

*/
}
