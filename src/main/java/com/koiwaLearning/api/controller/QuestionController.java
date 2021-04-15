package com.koiwaLearning.api.controller;

import com.koiwaLearning.api.domain.*;
import com.koiwaLearning.api.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//@RequestMapping("/select")

public class QuestionController {

    @Autowired
    private QuestionService questionService;

    //　1検索 所有教师和同学的name、sex和birthday.　QuestionOne   localhost:8080/selectOne  でアクセス
    @RequestMapping(value = {"selectOne"}, method = RequestMethod.GET)
    public List<Students> selectQuestionOne() {
        return questionService.findQuestionOne();
    }

    //　2検索 查询所有“女”教师和“女”同学的name、sex和birthday.　QuestionTwo   localhost:8080/selectTwo  でアクセス
    @RequestMapping(value = {"selectTwo"}, method = RequestMethod.GET)
    public List<Students> selectQuestionTwo() {
        return questionService.findQuestionTwo();
    }

    //  3検索　查询成绩比该课程平均成绩低的同学的成绩表。   QuestionThree   localhost:8080/selectThree  でアクセス
    @RequestMapping(value = {"selectThree"}, method = RequestMethod.GET)
    public List<Scores> selectQuestionThree() {
        return questionService.findQuestionThree();
    }

    //  4検索　查询所有任课教师的Tname和Depart.   QuestionFour   localhost:8080/selectFour  でアクセス
    @RequestMapping(value = {"selectFour"}, method = RequestMethod.GET)
    public List<Teachers> selectQuestionFour() {
        return questionService.findQuestionFour();
    }

    //  5検索　查询所有未讲课的教师的Tname和Depart.   QuestionFive   localhost:8080/selectFive  でアクセス
    @RequestMapping(value = {"selectFive"}, method = RequestMethod.GET)
    public List<Teachers> selectQuestionFive() {
        return questionService.findQuestionFive();
    }

    //　6検索 查询至少有2名男生的班号。    QuestionSix   localhost:8080/selectSix  でアクセス
    @RequestMapping(value = {"selectSix"}, method = RequestMethod.GET)
    public List<Students> selectQuestionSix() {
        return questionService.findQuestionSix();
    }

    //　7検索 查询students表中不姓“王”的同学记录。    QuestionSeven   localhost:8080/selectSeven  でアクセス
    @RequestMapping(value = {"selectSeven"}, method = RequestMethod.GET)
    public List<Students> selectQuestionSeven() {
        return questionService.findQuestionSeven();
    }

    //　8検索 查询students表中每个学生的姓名和年龄。    QuestionEight   localhost:8080/selectEight  でアクセス
    @RequestMapping(value = {"selectEight"}, method = RequestMethod.GET)
    public List<Students> selectQuestionEight() {
        return questionService.findQuestionEight();
    }

    //  9検索　查询students表中最大和最小的Sbirthday日期值。      QuestionNine   localhost:8080/selectNine  でアクセス
    @RequestMapping(value = {"selectNine"}, method = RequestMethod.GET)
    public List<Question9> selectQuestionNine() {
        return questionService.findQuestionNine();
    }

    //  10検索 以班号和年龄从大到小的顺序查询students表中的全部记录。    QuestionTen   localhost:8080/selectTen  でアクセス
    @RequestMapping(value = {"selectTen"}, method = RequestMethod.GET)
    public List<Students> selectQuestionTen() {
        return questionService.findQuestionTen();
    }

    //  11検索　查询“男”教师及其所上的课程。    QuestionEleven   localhost:8080/selectEleven  でアクセス
    @RequestMapping(value = {"selectEleven"}, method = RequestMethod.GET)
    public List<Question11> selectQuestionEleven() {
        return questionService.findQuestionEleven();
    }

    //  12検索　查询最高分同学的Sno、Cno和Degree列。   QuestionTwelve   localhost:8080/selectTwelve  でアクセス
    @RequestMapping(value = {"selectTwelve"}, method = RequestMethod.GET)
    public List<Scores> selectQuestionTwelve() {
        return questionService.findQuestionTwelve();
    }

    //  13検索　查询和“李军”同性别的所有同学的Sname.     QuestionThirteen   localhost:8080/selectThirteen  でアクセス
    @RequestMapping(value = {"selectThirteen"}, method = RequestMethod.GET)
    public List<Students> selectQuestionThirteen() {
        return questionService.findQuestionThirteen();
    }

    //  14検索　查询和“李军”同性别并同班的同学Sname.     QuestionFourteen   localhost:8080/selectFourteen  でアクセス
    @RequestMapping(value = {"selectFourteen"}, method = RequestMethod.GET)
    public List<Students> selectQuestionFourteen() {
        return questionService.findQuestionFourteen();
    }

    //  15検索　查询所有选修“计算机导论”课程的“男”同学的成绩表     QuestionFifteen   localhost:8080/selectFifteen  でアクセス
    @RequestMapping(value = {"selectFifteen"}, method = RequestMethod.GET)
    public List<Scores> selectQuestionFifteen() {
        return questionService.findQuestionFifteen();
    }


}
