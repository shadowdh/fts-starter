package dev.foliage.fts.site.modules.index.service.impl;

import dev.foliage.fts.site.modules.index.domain.Slider;
import dev.foliage.fts.site.modules.index.service.CategoryService;
import dev.foliage.fts.site.modules.index.service.IndexService;
import dev.foliage.fts.site.modules.index.service.SliderService;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Classname IndexServiceImpl
 * @Description TODO
 * @Author ShadowDh
 * @Date 2020-04-10 03:50
 */

@Service
public class IndexServiceImpl implements IndexService {

    private final SliderService sliderService;
    private final CategoryService categoryService;

    public IndexServiceImpl(SliderService sliderService, CategoryService categoryService) {
        this.sliderService = sliderService;
        this.categoryService = categoryService;
    }

    @Override
    public void index(HttpSession session, Model model) {
        //类目

        //轮播图
        List<Slider> sliders = sliderService.queryAll();
        //展示橱窗

        model.addAttribute("sliders", sliders);
    }
}
