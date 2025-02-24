package memo.review.service;

import memo.vo.ReviewVO;

import java.util.List;

public interface ReviewService {
    List<ReviewVO> reviewList(ReviewVO reviewVO);

    Double reviewScore(ReviewVO reviewVO);

    void reviewSave(ReviewVO reviewVO);
}
