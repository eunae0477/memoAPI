package memo.category.web;

import lombok.RequiredArgsConstructor;
import memo.category.service.CategoryService;
import memo.vo.CategoryVO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping(value = "/category-list")
    @ResponseBody
    private List<CategoryVO> categoryList(@Validated CategoryVO categoryVO) {
        return categoryService.categoryList(categoryVO);
    }
}
