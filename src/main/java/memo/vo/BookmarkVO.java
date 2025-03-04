package memo.vo;

import lombok.Data;

@Data
public class BookmarkVO {
    private int id;
    private int contentsId;
    private int usrId;
    private Boolean likeIt;
    private Boolean bookmark;
    private Boolean seen;
}