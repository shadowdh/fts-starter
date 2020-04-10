package dev.foliage.fts.site.modules.index.service.dto;

import dev.foliage.fts.site.modules.index.domain.Category;
import lombok.Data;

import java.util.List;

/**
 * @Classname CategoryDto
 * @Description TODO
 * @Author ShadowDh
 * @Date 2020-04-10 14:15
 */

@Data
public class CategoryDto {

    /**
     *
     */
    private Category category;

    /**
     *
     */
    private List<Category> children;
}
