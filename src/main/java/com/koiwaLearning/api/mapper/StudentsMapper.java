package com.koiwaLearning.api.mapper;

import com.koiwaLearning.api.domain.Question9;
import com.koiwaLearning.api.domain.StudentDetail;
import com.koiwaLearning.api.domain.Students;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentsMapper {

    // 検索
    List<Students> getStudents();

    // 根据id查询单个学生
    StudentDetail getStudent(String studentId);


    // 追加
    int insertStudents(Students students);

    // 更新
    int updateStudents(Students students);

    // 削除
    int deleteStudents(String sno);
}
