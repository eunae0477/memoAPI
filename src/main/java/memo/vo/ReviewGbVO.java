package memo.vo;

import lombok.Data;

import java.util.Date;

@Data
public class ReviewGbVO {
    private int id;
    private int targetReviewId;
    private int usrId;
    private String gb;
}
