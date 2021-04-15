package com.koiwaLearning.api.mapper;

import com.koiwaLearning.api.domain.StudentDetail;
import com.koiwaLearning.api.domain.TeacherDetail;
import com.koiwaLearning.api.domain.Teachers;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeachersMapper {

    // 検索
    List<Teachers> getTeachers();

    // 根据id查询单个Teacher
    TeacherDetail getTeacher(String teacherId);

    // 追加
    int insertTeachers(Teachers teachers);

    // 更新
    int updateTeachers(Teachers teachers);

    // 削除
    int deleteTeachers(String tno);
}
