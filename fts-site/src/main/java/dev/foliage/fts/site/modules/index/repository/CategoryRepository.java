package dev.foliage.fts.site.modules.index.repository;

import dev.foliage.fts.site.modules.index.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @Classname CategoryRository
 * @Description TODO
 * @Author ShadowDh
 * @Date 2020-04-10 14:25
 */

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>, JpaSpecificationExecutor<Category> {
}
