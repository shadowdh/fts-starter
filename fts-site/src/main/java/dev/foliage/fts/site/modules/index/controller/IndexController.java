package dev.foliage.fts.site.modules.index.controller;

import dev.foliage.fts.site.modules.index.service.IndexService;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @Classname IndexController
 * @Description TODO
 * @Author ShadowDh
 * @Date 2020-04-10 04:12
 */

@Api(tags = "首页")
@Controller
public class IndexController {

    private final IndexService indexService;

    public IndexController(IndexService indexService) {
        this.indexService = indexService;
    }

    @RequestMapping("/")
    public ModelAndView index(HttpSession session, Model model) {
        indexService.index(session, model);
        return new ModelAndView("index", model.asMap());
    }
}
