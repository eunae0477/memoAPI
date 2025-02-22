package memo.contents.service.impl;

import lombok.RequiredArgsConstructor;
import memo.contents.mapper.ContentsMapper;
import memo.contents.service.ContentsService;
import memo.vo.ContentsVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "contentsService")
@RequiredArgsConstructor
public class ContentsServiceImpl implements ContentsService {
    private final ContentsMapper contentsMapper;

    @Override
    public List<ContentsVO> contentsList(ContentsVO contentsVO) {
        return contentsMapper.contentsList(contentsVO);
    }
}
