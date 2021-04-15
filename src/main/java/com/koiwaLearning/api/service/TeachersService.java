package com.koiwaLearning.api.service;


import com.koiwaLearning.api.domain.TeacherDetail;
import com.koiwaLearning.api.domain.Teachers;
import com.koiwaLearning.api.mapper.TeachersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeachersService {

    @Autowired
    private TeachersMapper teachersMapper;

    // 検索
    public List<Teachers> getTeachers() {
        return teachersMapper.getTeachers();
    }

    // 根据id查询一个Teacher
    public TeacherDetail getTeacher(String teacherId) {
        return teachersMapper.getTeacher(teacherId);
    }


    // 追加
    public int insertTeachers(Teachers teachers) {
        return teachersMapper.insertTeachers(teachers);
    }

    // 更新
    public int updateTeachers(Teachers teachers) {
        return teachersMapper.updateTeachers(teachers);
    }

    // 削除
    public int deleteTeachers(String tno) {
        return teachersMapper.deleteTeachers(tno);
    }
}
