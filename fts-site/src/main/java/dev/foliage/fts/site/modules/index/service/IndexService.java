package dev.foliage.fts.site.modules.index.service;

import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;

/**
 * @Classname IndexService
 * @Description TODO
 * @Author ShadowDh
 * @Date 2020-04-10 03:37
 */

public interface IndexService {
    void index(HttpSession session, Model model);
}
