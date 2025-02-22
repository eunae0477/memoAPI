package memo.contents.service;

import memo.vo.ContentsVO;

import java.util.List;

public interface ContentsService {
    List<ContentsVO> contentsList(ContentsVO contentsVO);
}
