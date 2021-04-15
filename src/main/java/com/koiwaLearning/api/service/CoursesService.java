package com.koiwaLearning.api.service;


import com.koiwaLearning.api.domain.Courses;
import com.koiwaLearning.api.domain.CourseDetail;
import com.koiwaLearning.api.mapper.CoursesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesService {

    @Autowired
    private CoursesMapper coursesMapper;

    //検索
    public List<Courses> getCourses() {return coursesMapper.getCourses(); }

    // 根据id查询一个課程
    public CourseDetail getCourse(String courseId) {
        return coursesMapper.getCourse(courseId);
    }


    //追加
    public int insertCourses(Courses courses){return coursesMapper.insertCourses(courses);}

    //更新
    public int updateCourses(Courses courses){return coursesMapper.updateCourses(courses);}

    //削除
    public int deleteCourses(String cno){return coursesMapper.deleteCourses(cno);}






}
