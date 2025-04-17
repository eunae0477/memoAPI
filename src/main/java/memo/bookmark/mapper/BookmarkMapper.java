package memo.bookmark.mapper;

import memo.vo.BookmarkVO;
import memo.vo.ContentsVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookmarkMapper {
    List<ContentsVO> bookmarkList(BookmarkVO bookmarkVO);

    void bookmark(BookmarkVO bookmarkVO);

    void bookmarkSeen(BookmarkVO bookmarkVO);

    void bookmarkLikeIt(BookmarkVO bookmarkVO);

    int bookmarkViewCnt(BookmarkVO bookmarkVO);

    void bookmarkLikeItDel(BookmarkVO bookmarkVO);

    void bookmarkSeenDel(BookmarkVO bookmarkVO);

    void bookmarkDel(BookmarkVO bookmarkVO);

    Integer getMaxSeqForUpdate(BookmarkVO bookmarkVO);

    ContentsVO contentsBookmark(BookmarkVO bookmarkVO);

    List<ContentsVO> likeItList(BookmarkVO bookmarkVO);

    List<ContentsVO> seenList(BookmarkVO bookmarkVO);

    void bookmarkSeq(BookmarkVO bookmarkVO);
}
