package com.koiwaLearning.api.service;

import com.koiwaLearning.api.domain.*;
import com.koiwaLearning.api.mapper.QuestionMapper;
import com.koiwaLearning.api.mapper.StudentsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionMapper questionMapper;



    //　1検索　QuestionOne   localhost:8080/selectOne  でアクセス
    public List<Students> findQuestionOne() {
        return questionMapper.findQuestionOne();
    }

    //　2検索　QuestionTwo   localhost:8080/selectTwo  でアクセス
    public List<Students> findQuestionTwo() {
        return questionMapper.findQuestionTwo();
    }

    //　3検索　QuestionThree   localhost:8080/selectThree  でアクセス
    public List<Scores> findQuestionThree() {
        return questionMapper.findQuestionThree();
    }

    //　4検索　QuestionFour   localhost:8080/selectFour  でアクセス
    public List<Teachers> findQuestionFour() {
        return questionMapper.findQuestionFour();
    }

    //　5検索　QuestionFive   localhost:8080/selectFive  でアクセス
    public List<Teachers> findQuestionFive() {
        return questionMapper.findQuestionFive();
    }

    //　6検索　QuestionSix   localhost:8080/selectSix  でアクセス
    public List<Students> findQuestionSix() {
        return questionMapper.findQuestionSix();
    }

    //　7検索　QuestionSeven   localhost:8080/selectSeven  でアクセス
    public List<Students> findQuestionSeven() {
        return questionMapper.findQuestionSeven();
    }

    //　8検索　QuestionEight   localhost:8080/selectEight  でアクセス
    public List<Students> findQuestionEight() {
        return questionMapper.findQuestionEight();
    }

    // 9検索  QuestionNine   localhost:8080/selectNine  でアクセス
    public List<Question9> findQuestionNine() {
        return questionMapper.findQuestionNine();
    }

    // 10検索　QuestionTen   localhost:8080/selectTen  でアクセス
    public List<Students> findQuestionTen() {
        return questionMapper.findQuestionTen();
    }

    // 11検索　QuestionEleven   localhost:8080/selectEleven  でアクセス
    public List<Question11> findQuestionEleven() {
        return questionMapper.findQuestionEleven();
    }

    // 12検索　QuestionTwelve   localhost:8080/selectTwelve  でアクセス
    public List<Scores> findQuestionTwelve() {
        return questionMapper.findQuestionTwelve();
    }

    // 13検索　QuestionThirteen   localhost:8080/selectThirteen  でアクセス
    public List<Students> findQuestionThirteen() {
        return questionMapper.findQuestionThirteen();
    }

    // 14検索　QuestionFourteen   localhost:8080/selectFourteen  でアクセス
    public List<Students> findQuestionFourteen() {
        return questionMapper.findQuestionFourteen();
    }

    // 15検索　QuestionFifteen   localhost:8080/selectFifteen  でアクセス
    public List<Scores> findQuestionFifteen() {
        return questionMapper.findQuestionFifteen();
    }
}
