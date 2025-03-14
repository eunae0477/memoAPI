package memo.review.mapper;

import memo.vo.ReviewGbVO;
import memo.vo.ReviewVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReviewMapper {
    List<ReviewVO> reviewList(ReviewVO reviewVO);

    Double reviewScore(ReviewVO reviewVO);

    void reviewSave(ReviewVO reviewVO);

    void reviewDelete(ReviewVO reviewVO);

    void reviewUpdate(ReviewVO reviewVO);

    void reviewGbInsertUpdate(ReviewGbVO reviewGbVO);
}
