package com.koiwaLearning.api.mapper;

import com.koiwaLearning.api.domain.ScoreDetail;
import org.springframework.stereotype.Repository;
import com.koiwaLearning.api.domain.Scores;

import java.util.List;

@Repository
public interface ScoresMapper {

    //検索
    List<Scores> getScores();

    // 根据id查询单个Score
    ScoreDetail getScore(String scoreId);


    //追加
    int insertScores(Scores scores);

    //更新
    int updateScores(Scores scores);

    //削除
    int deleteScores(String sno);


}
