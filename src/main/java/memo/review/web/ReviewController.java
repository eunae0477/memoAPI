package memo.review.web;

import lombok.RequiredArgsConstructor;
import memo.review.service.ReviewService;
import memo.vo.ReviewVO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ReviewController {
    private final ReviewService reviewService;

    @GetMapping(value = "/review-list")
    @ResponseBody
    private List<ReviewVO> reviewList(@Validated ReviewVO reviewVO) {
        return reviewService.reviewList(reviewVO);
    }

    @GetMapping(value = "/review-score")
    @ResponseBody
    private Double reviewScore(@Validated ReviewVO reviewVO) {
        return reviewService.reviewScore(reviewVO);
    }

    @PostMapping(value = "review-save")
    @ResponseBody
    private void reviewSave(@RequestBody @Validated ReviewVO reviewVO) {
        reviewService.reviewSave(reviewVO);
    }
}
