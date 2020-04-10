package dev.foliage.fts.site.modules.index.service;

import dev.foliage.fts.site.modules.index.service.dto.CategoryDto;

import java.util.List;

/**
 * @Classname CategoryService
 * @Description TODO
 * @Author ShadowDh
 * @Date 2020-04-10 14:18
 */


public interface CategoryService {
    List<CategoryDto> queryAll();
}
