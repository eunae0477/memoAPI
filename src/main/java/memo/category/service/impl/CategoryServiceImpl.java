package memo.category.service.impl;

import lombok.RequiredArgsConstructor;
import memo.category.mapper.CategoryMapper;
import memo.category.service.CategoryService;
import memo.vo.CategoryVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service (value = "categoryService")
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {
    private final CategoryMapper categoryMapper;

    @Override
    public List<CategoryVO> categoryList(CategoryVO categoryVO) {
        return categoryMapper.categoryList(categoryVO);
    }
}
