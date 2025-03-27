package memo.bookmark.service;

import memo.vo.BookmarkVO;
import memo.vo.ContentsVO;

import java.util.List;

public interface BookmarkService {
    List<ContentsVO> bookmarkList(BookmarkVO bookmarkVO);

    void bookmark(BookmarkVO bookmarkVO);

    int bookmarkViewCnt(BookmarkVO bookmarkVO);

    ContentsVO contentsBookmark(BookmarkVO bookmarkVO);
}
