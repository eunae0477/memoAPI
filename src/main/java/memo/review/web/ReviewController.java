package memo.review.web;

import lombok.RequiredArgsConstructor;
import memo.review.service.ReviewService;
import memo.vo.ReviewGbVO;
import memo.vo.ReviewVO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ReviewController {
    private final ReviewService reviewService;

    @GetMapping(value = "/review-list")
    @ResponseBody
    private List<ReviewVO> reviewList (@Validated ReviewVO reviewVO) {
        return reviewService.reviewList(reviewVO);
    }

    @GetMapping(value = "/review-score")
    @ResponseBody
    private Double reviewScore (@Validated ReviewVO reviewVO) {
        return reviewService.reviewScore(reviewVO);
    }

    @PostMapping(value = "/review")
    @ResponseBody
    private void reviewSave (@Validated ReviewVO reviewVO) {
        reviewService.reviewSave(reviewVO);
    }

    @DeleteMapping(value = "/review")
    @ResponseBody
    private void reviewDelete (@Validated ReviewVO reviewVO) {
        reviewService.reviewDelete(reviewVO);
    }

    @PutMapping(value = "/review")
    @ResponseBody
    private void reviewUpdate (@Validated ReviewVO reviewVO) {
        reviewService.reviewUpdate(reviewVO);
    }

    @PostMapping(value = "/review-gb")
    @ResponseBody
    private void reviewGbInsertUpdate(@Validated ReviewGbVO reviewGbVO) {
        reviewService.reviewGbInsertUpdate(reviewGbVO);
    }
}
