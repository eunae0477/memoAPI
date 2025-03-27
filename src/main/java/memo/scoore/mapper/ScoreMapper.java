package memo.scoore.mapper;

import memo.vo.ScoreVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ScoreMapper {
    Double reviewScoreAvg(ScoreVO scoreVO);

    Double myScore(ScoreVO scoreVO);

    void myScoreSave(ScoreVO scoreVO);
}
