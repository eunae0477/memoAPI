package memo.bookmark.service.impl;

import lombok.RequiredArgsConstructor;
import memo.bookmark.mapper.BookmarkMapper;
import memo.bookmark.service.BookmarkService;
import memo.vo.BookmarkVO;
import memo.vo.ContentsVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service (value = "bookmarkService")
@RequiredArgsConstructor
public class BookmarkServiceImpl implements BookmarkService {

    private final BookmarkMapper bookmarkMapper;

    @Override
    public ContentsVO contentsBookmark(BookmarkVO bookmarkVO) {
        return bookmarkMapper.contentsBookmark(bookmarkVO);
    }

    @Override
    public List<ContentsVO> bookmarkList(BookmarkVO bookmarkVO) {
        String type = bookmarkVO.getBookmarkType();
        List<ContentsVO> resultList = new ArrayList<>();
        switch (type) {
            case "likeIt":
                resultList = bookmarkMapper.likeItList(bookmarkVO);
                break;
            case "seen":
                resultList = bookmarkMapper.seenList(bookmarkVO);
                break;
            case "bookmark":
                resultList = bookmarkMapper.bookmarkList(bookmarkVO);
                break;
        }
        return resultList;
    }

    @Override
    @Transactional
    public void bookmark(BookmarkVO bookmarkVO) {
        Boolean bookmark = bookmarkVO.getBookmark();
        String type = bookmarkVO.getBookmarkType();

        switch (type) {
            case "likeIt":
                if (Boolean.TRUE.equals(bookmark)) {
                    bookmarkMapper.bookmarkLikeIt(bookmarkVO);
                } else {
                    bookmarkMapper.bookmarkLikeItDel(bookmarkVO);
                }
                break;
            case "seen":
                if (Boolean.TRUE.equals(bookmark)) {
                    bookmarkMapper.bookmarkSeen(bookmarkVO);
                } else {
                    bookmarkMapper.bookmarkSeenDel(bookmarkVO);
                }
                break;
            case "bookmark":
                if (Boolean.TRUE.equals(bookmark)) {
                    Integer maxSeq = bookmarkMapper.getMaxSeqForUpdate(bookmarkVO);
                    int nextSeq = (maxSeq != null ? maxSeq : 0) + 1;
                    bookmarkVO.setSeq(nextSeq);
                    bookmarkMapper.bookmark(bookmarkVO);
                } else {
                    bookmarkMapper.bookmarkDel(bookmarkVO);
                }
                break;
        }
    }

    @Override
    public int bookmarkViewCnt(BookmarkVO bookmarkVO) {
        return bookmarkMapper.bookmarkViewCnt(bookmarkVO);
    }
}
