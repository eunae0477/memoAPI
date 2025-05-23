package memo.review.service.impl;

import lombok.RequiredArgsConstructor;
import memo.review.mapper.ReviewMapper;
import memo.review.service.ReviewService;
import memo.vo.ReviewGbVO;
import memo.vo.ReviewVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "reviewService")
@RequiredArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    private final ReviewMapper reviewMapper;

    @Override
    public List<ReviewVO> reviewList(ReviewVO reviewVO) {
        return reviewMapper.reviewList(reviewVO);
    }

    @Override
    public Double reviewScore(ReviewVO reviewVO) {
        return reviewMapper.reviewScore(reviewVO);
    }

    @Override
    public void reviewSave(ReviewVO reviewVO) {
        reviewMapper.reviewSave(reviewVO);
    }

    @Override
    public void reviewDelete(ReviewVO reviewVO) {
        reviewMapper.reviewDelete(reviewVO);
    }

    @Override
    public void reviewUpdate(ReviewVO reviewVO) {
        reviewMapper.reviewUpdate(reviewVO);
    }

    @Override
    public void reviewGbInsertUpdate(ReviewGbVO reviewGbVO) {
        reviewMapper.reviewGbInsertUpdate(reviewGbVO);
    }
}
