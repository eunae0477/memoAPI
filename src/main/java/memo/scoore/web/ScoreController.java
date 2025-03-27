package memo.scoore.web;

import lombok.RequiredArgsConstructor;
import memo.scoore.service.ScoreService;
import memo.vo.ScoreVO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class ScoreController {
    private final ScoreService scoreService;

    @GetMapping(value = "/review-score-avg")
    @ResponseBody
    private Double reviewScoreAvg (@Validated ScoreVO scoreVO) {
        return scoreService.reviewScoreAvg(scoreVO);
    }

    @GetMapping(value = "/my-score")
    @ResponseBody
    private Double myScore (@Validated ScoreVO scoreVO) {
        return scoreService.myScore(scoreVO);
    }

    @PostMapping(value = "/my-score")
    @ResponseBody
    private void myScoreSave (@Validated ScoreVO scoreVO) {
        scoreService.myScoreSave(scoreVO);
    }
}
