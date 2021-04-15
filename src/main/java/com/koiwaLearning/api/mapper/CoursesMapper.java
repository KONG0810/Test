package com.koiwaLearning.api.mapper;


import com.koiwaLearning.api.domain.CourseDetail;
import com.koiwaLearning.api.domain.Courses;
import com.koiwaLearning.api.domain.StudentDetail;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoursesMapper {

    //検索
    List<Courses> getCourses();

    // 根据id查询单个課程
    CourseDetail getCourse(String courseId);

    //追加
    int insertCourses(Courses courses);

    //更新
    int updateCourses(Courses courses);

    //削除
    int deleteCourses(String cno);

}
