package memo.scoore.service.impl;

import lombok.RequiredArgsConstructor;
import memo.scoore.mapper.ScoreMapper;
import memo.scoore.service.ScoreService;
import memo.vo.ScoreVO;
import org.springframework.stereotype.Service;

@Service(value = "scoreService")
@RequiredArgsConstructor
public class ScoreServiceImpl implements ScoreService {
    private final ScoreMapper scoreMapper;

    @Override
    public Double reviewScoreAvg(ScoreVO scoreVO) {
        return scoreMapper.reviewScoreAvg(scoreVO);
    }

    @Override
    public Double myScore(ScoreVO scoreVO) {
        return scoreMapper.myScore(scoreVO);
    }

    @Override
    public void myScoreSave(ScoreVO scoreVO) {
        scoreMapper.myScoreSave(scoreVO);
    }
}
