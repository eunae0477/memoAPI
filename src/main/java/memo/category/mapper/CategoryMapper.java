package memo.category.mapper;

import memo.vo.CategoryVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryMapper {
    List<CategoryVO> categoryList(CategoryVO categoryVO);
}
