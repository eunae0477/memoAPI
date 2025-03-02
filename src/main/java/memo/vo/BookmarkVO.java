package memo.vo;

import lombok.Data;

@Data
public class BookmarkVO {
    private int id;
    private int contentsId;
    private int usrId;
    private boolean likeIt = false;
    private boolean bookmark = false;
    private boolean seen = false;
}