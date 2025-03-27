package memo.scoore.service;

import memo.vo.ScoreVO;

public interface ScoreService {
    Double reviewScoreAvg(ScoreVO scoreVO);

    Double myScore(ScoreVO scoreVO);

    void myScoreSave(ScoreVO scoreVO);
}
