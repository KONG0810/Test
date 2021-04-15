package com.koiwaLearning.api.service;

import com.koiwaLearning.api.domain.ScoreDetail;
import com.koiwaLearning.api.domain.Scores;
import com.koiwaLearning.api.mapper.ScoresMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScoresService {

    @Autowired
    private ScoresMapper scoresMapper;

    //検索
    public List<Scores> getScores() { return scoresMapper.getScores(); }

    // 根据id查询一个Score
    public ScoreDetail getScore(String scoreId) {
        return scoresMapper.getScore(scoreId);
    }


    //追加
    public int insertScores(Scores scores) {return scoresMapper.insertScores(scores);}

    //更新
    public int updateScores(Scores scores) {return scoresMapper.updateScores(scores);}

    //削除
    public int deleteScores(String sno) {return scoresMapper.deleteScores(sno);}



}
