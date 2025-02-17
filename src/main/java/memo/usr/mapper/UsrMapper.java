package memo.usr.mapper;

import memo.vo.UsrVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UsrMapper {
    List<UsrVO> usrList();
}
