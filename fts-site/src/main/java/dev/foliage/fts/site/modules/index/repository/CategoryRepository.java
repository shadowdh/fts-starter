package dev.foliage.fts.site.modules.index.repository;

import dev.foliage.fts.site.modules.index.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Classname CategoryRository
 * @Description TODO
 * @Author ShadowDh
 * @Date 2020-04-10 14:25
 */

public interface CategoryRepository extends JpaRepository<Category, Integer>, JpaSpecificationExecutor<Category> {
}
