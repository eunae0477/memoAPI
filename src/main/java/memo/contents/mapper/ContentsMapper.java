package memo.contents.mapper;

import memo.vo.ContentsVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ContentsMapper {
    List<ContentsVO> contentsList(ContentsVO contentsVO);
}
