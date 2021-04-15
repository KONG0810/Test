package com.koiwaLearning.api.mapper;

import com.koiwaLearning.api.domain.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionMapper {


    //　1検索　QuestionOne   localhost:8080/selectOne  でアクセス
    List<Students> findQuestionOne();

    //　2検索　QuestionTwo   localhost:8080/selectTwo  でアクセス
    List<Students> findQuestionTwo();

    //　3検索　QuestionThree   localhost:8080/selectThree  でアクセス
    List<Scores> findQuestionThree();

    //　4検索　QuestionFour   localhost:8080/selectFour  でアクセス
    List<Teachers> findQuestionFour();

    //　5検索　QuestionFive   localhost:8080/selectFive  でアクセス
    List<Teachers> findQuestionFive();

    //　6検索　QuestionSix   localhost:8080/selectSix  でアクセス
    List<Students> findQuestionSix();

    //　7検索　QuestionSeven   localhost:8080/selectSeven  でアクセス
    List<Students> findQuestionSeven();

    //　8検索　QuestionEight   localhost:8080/selectEight  でアクセス
    List<Students> findQuestionEight();

    //　9検索　QuestionNine   localhost:8080/selectNine  でアクセス
    List<Question9> findQuestionNine();

    // 10検索　QuestionTen   localhost:8080/selectTen  でアクセス
    List<Students> findQuestionTen();

    // 11検索　QuestionEleven   localhost:8080/selectEleven  でアクセス
    List<Question11> findQuestionEleven();

    // 12検索　QuestionTwelve   localhost:8080/selectTwelve  でアクセス
    List<Scores> findQuestionTwelve();

    // 13検索　QuestionThirteen   localhost:8080/selectThirteen  でアクセス
    List<Students> findQuestionThirteen();

    // 14検索　QuestionFourteen   localhost:8080/selectFourteen  でアクセス
    List<Students> findQuestionFourteen();

    // 15検索　QuestionFifteen   localhost:8080/selectFifteen  でアクセス
    List<Scores> findQuestionFifteen();

}
