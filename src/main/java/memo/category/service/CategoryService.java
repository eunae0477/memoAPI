package memo.category.service;

import memo.vo.CategoryVO;

import java.util.List;

public interface CategoryService {
    List<CategoryVO> categoryList(CategoryVO categoryVO);
}
