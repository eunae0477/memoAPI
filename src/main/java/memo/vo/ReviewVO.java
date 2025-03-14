package memo.vo;

import lombok.Data;

import java.util.Date;

@Data
public class ReviewVO {
    private int id;
    private int usrId;
    private int contentsId;
    private int score;
    private String comment;
    private Date reviewDate;

    private String usrName;
    private int reviewGoodCnt;
    private int reviewBadCnt;
    private String reviewGb;
}
