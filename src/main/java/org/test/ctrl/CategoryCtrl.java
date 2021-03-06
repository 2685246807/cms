package org.test.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.test.entity.Category;
import org.test.entity.CategoryVO;
import org.test.service.CategoryService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CategoryCtrl {
    @Autowired
    CategoryService mCategoryService;

    @RequestMapping("/queryCategorylist.do")
    public ModelAndView reqEditorPage() {
        Map<String, Object> model = new HashMap<String, Object>();
        List<CategoryVO> categories = mCategoryService.getCategorys();
        model.put("categories", categories);
        return new ModelAndView("/admin/categoryList", model);
    }

    @RequestMapping("/queryCategorylist1.do")
    public ModelAndView reqEditorPage1() {
        Map<String, Object> model = new HashMap<String, Object>();
        List<Category> categories = mCategoryService.getCategory();
        model.put("category", categories);
        return new ModelAndView("/admin/categoryList1", model);
    }
}
