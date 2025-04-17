package memo.bookmark.web;

import lombok.RequiredArgsConstructor;
import memo.bookmark.service.BookmarkService;
import memo.vo.BookmarkVO;
import memo.vo.ContentsVO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BookmarkController {

    private final BookmarkService bookmarkService;

    @GetMapping(value = "/contents-bookmark")
    @ResponseBody
    private ContentsVO contentsBookmark(@Validated BookmarkVO bookmarkVO) {
        return bookmarkService.contentsBookmark(bookmarkVO);
    }

    @GetMapping(value = "/bookmark-list")
    @ResponseBody
    private List<ContentsVO> bookmarkList(@Validated BookmarkVO bookmarkVO) {
        return bookmarkService.bookmarkList(bookmarkVO);
    }

    @GetMapping(value = "/bookmark")
    @ResponseBody
    private void bookmark(@Validated BookmarkVO bookmarkVO) {
        bookmarkService.bookmark(bookmarkVO);
    }

    @GetMapping(value = "/bookmark-view-cnt")
    @ResponseBody
    private int bookmarkViewCnt(@Validated BookmarkVO bookmarkVO) {
        return bookmarkService.bookmarkViewCnt(bookmarkVO);
    }

    @PostMapping(value = "/bookmark-seq")
    @ResponseBody
    private void bookmarkSeq(@RequestBody @Validated BookmarkVO bookmarkVO) {
        bookmarkService.bookmarkSeq(bookmarkVO);
    }
}
