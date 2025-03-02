package memo.bookmark.service.impl;

import lombok.RequiredArgsConstructor;
import memo.bookmark.mapper.BookmarkMapper;
import memo.bookmark.service.BookmarkService;
import memo.vo.BookmarkVO;
import memo.vo.ContentsVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service (value = "bookmarkService")
@RequiredArgsConstructor
public class BookmarkServiceImpl implements BookmarkService {

    private final BookmarkMapper bookmarkMapper;

    @Override
    public List<ContentsVO> bookmarkList(BookmarkVO bookmarkVO) {
        return bookmarkMapper.bookmarkList(bookmarkVO);
    }

    @Override
    public void bookmark(BookmarkVO bookmarkVO) {
        bookmarkMapper.bookmark(bookmarkVO);
    }
}
