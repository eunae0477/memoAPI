package memo.contents.web;

import lombok.RequiredArgsConstructor;
import memo.contents.service.ContentsService;
import memo.vo.ContentsVO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class ContentsController {
    private final ContentsService contentsService;

    @GetMapping(value = "/contents-list")
    @ResponseBody
    private List<ContentsVO> contentsList(@Validated ContentsVO contentsVO) {
        return contentsService.contentsList(contentsVO);
    }
}
