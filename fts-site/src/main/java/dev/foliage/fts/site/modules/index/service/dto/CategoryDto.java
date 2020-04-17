package dev.foliage.fts.site.modules.index.service.dto;

import dev.foliage.fts.site.modules.index.domain.Category;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.List;

/**
 * @Classname CategoryDto
 * @Description TODO
 * @Author ShadowDh
 * @Date 2020-04-10 14:15
 */

@Data
@NoArgsConstructor
public class CategoryDto {

    /**
     *
     */
    private Category category;

    /**
     *
     */
    private List<CategoryDto> children;

    public CategoryDto(Category category) {
        this.category = category;
    }

    public CategoryDto(Category category, List<CategoryDto> children) {
        this.category = category;
        this.children=children;
    }
}
