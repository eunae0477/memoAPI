package memo.vo;

import lombok.Data;

@Data
public class BookmarkVO {
    private int id;
    private int contentsId;
    private int usrId;
    private int seq;
    private String bookmarkType;
    private Boolean bookmark;
}