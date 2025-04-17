package memo.vo;

import lombok.Data;

import java.util.List;

@Data
public class BookmarkVO {
    private int id;
    private int contentsId;
    private List<Integer> contentsIdArr;
    private int usrId;
    private int seq;
    private String bookmarkType;
    private Boolean bookmark;
}