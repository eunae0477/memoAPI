package memo.vo;

import lombok.Data;

import java.util.Date;

@Data
public class ContentsVO extends SearchVO {
    private int id;
    private String title;
    private String author;
    private String categoryCode;
    private String platformCode;
    private String typeCode;
    private String img;
    private int seenCnt = 0;

    private Boolean likeIt;
    private Boolean bookmark;
    private Boolean seen;
}
