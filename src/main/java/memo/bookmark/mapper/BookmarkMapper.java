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
}
