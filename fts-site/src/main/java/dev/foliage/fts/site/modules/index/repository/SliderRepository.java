package dev.foliage.fts.site.modules.index.repository;

import dev.foliage.fts.site.modules.index.domain.Slider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Classname SliderRepository
 * @Description TODO
 * @Author ShadowDh
 * @Date 2020-04-10 15:37
 */

@Repository
public interface SliderRepository extends JpaRepository<Slider,Long> {
}
