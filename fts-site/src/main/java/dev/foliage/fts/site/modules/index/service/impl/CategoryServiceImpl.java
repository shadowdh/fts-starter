package dev.foliage.fts.site.modules.index.service.impl;

import dev.foliage.fts.site.modules.index.domain.Category;
import dev.foliage.fts.site.modules.index.enums.CategoryEnum;
import dev.foliage.fts.site.modules.index.repository.CategoryRepository;
import dev.foliage.fts.site.modules.index.service.CategoryService;
import dev.foliage.fts.site.modules.index.service.dto.CategoryDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Classname CategoryServiceImpl
 * @Description TODO
 * @Author ShadowDh
 * @Date 2020-04-10 14:22
 */

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    /**
     * 对于一个分类，要先确定它的子分类，直到最后的分类都没有子类，这样适合递归查找
     *
     * @return
     */
    @Override
    public List<CategoryDto> queryAll() {
        //查找所有的分类 只查询一次数据
        List<Category> categories = categoryRepository.findAll();
        //
        Map<Integer, List<Category>> levelMap
                = categories.stream()
                .collect(Collectors.groupingBy(Category::getLevel));
        //
        List<Category> firstLevel = levelMap.get(CategoryEnum.FIRST_LEVEL.getLevel());
        //
        List<CategoryDto> categoryDtos = new ArrayList<>();
        firstLevel.forEach(category -> {
            var categoryDto = new CategoryDto(category);
            categoryDto.setChildren(
                    //
                    this.categoryRecursion(category, categories)
            );
            categoryDtos.add(categoryDto);
        });

        return categoryDtos;
    }

    /**
     * 对于一个指定的分类，得到这个分类的所有子分类，并且包含层级关系
     *
     * @param category
     * @param categoryList
     * @return
     */
    public List<CategoryDto> categoryRecursion(Category category, List<Category> categoryList) {
        //创建List用于存储返回结果
        List<CategoryDto> categoryDtos = new ArrayList<>();
        //获取直系后代分类
        List<Category> children = categoryList
                .stream()
                .filter(
                        c -> c.getParentId().equals(category.getId())
                ).collect(Collectors.toList());
        //如果只系后代不为空，则递归查找直系后代的直系后代
        if (!children.isEmpty()) {
            children.forEach(childrenCategory -> {
                var childrenCategoryDto = new CategoryDto(childrenCategory);
                childrenCategoryDto.setChildren(this.categoryRecursion(childrenCategory, categoryList));
                categoryDtos.add(childrenCategoryDto);
            });
        }
        return categoryDtos;
    }

    public List<CategoryDto> categoryRecursion(Category category) {

        final long id = category.getId();

        List<Category> categoryList = new ArrayList<>();
        for (Category c : categoryRepository.findAll()) {
            if (c.getParentId().equals(id)) {
                categoryList.add(c);
            }
        }

        return categoryList
                .stream()
                .map(cc -> {
                    if (null != cc) {
                        var childrenCategoryDto = new CategoryDto(cc);
                        childrenCategoryDto.setChildren(this.categoryRecursion(cc));
                        return childrenCategoryDto;
                    } else return null;
                }).collect(Collectors.toList());


    }

    public List<CategoryDto> queryAllFunction() {

        return categoryRepository
                .findAll()
                .stream()
                .filter(category -> category.getLevel().equals(CategoryEnum.FIRST_LEVEL.getLevel()))
                .map(firstLevel -> {
                    var categoryDto = new CategoryDto(firstLevel);
                    categoryDto.setChildren(categoryRecursion(firstLevel));
                    return categoryDto;
                })
                .collect(Collectors.toList());
    }
}
