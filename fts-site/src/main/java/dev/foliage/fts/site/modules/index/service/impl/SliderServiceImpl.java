package dev.foliage.fts.site.modules.index.service.impl;

import dev.foliage.fts.site.modules.index.domain.Slider;
import dev.foliage.fts.site.modules.index.repository.SliderRepository;
import dev.foliage.fts.site.modules.index.service.SliderService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname SliderServiceImpl
 * @Description TODO
 * @Author ShadowDh
 * @Date 2020-04-10 17:11
 */

@Service
public class SliderServiceImpl implements SliderService {

    private final SliderRepository sliderRepository;

    public SliderServiceImpl(SliderRepository sliderRepository) {
        this.sliderRepository = sliderRepository;
    }

    @Override
    public List<Slider> queryAll() {
        return sliderRepository.findAll();
    }
}
