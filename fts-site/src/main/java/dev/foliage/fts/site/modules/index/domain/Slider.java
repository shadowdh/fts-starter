package dev.foliage.fts.site.modules.index.domain;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @Classname IndexSlider
 * @Description TODO
 * @Author ShadowDh
 * @Date 2020-04-10 03:40
 */

@Entity
@Data
@Table(name="site_index_slider")
public class Slider {
    /**
     * 轮播图编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     *
     */
    @Column(name = "data_bg_img")
    private String dataBgImg;

    /**
     *
     */
    @Column(name = "banner_image")
    private String bannerImage;

    /**
     *
     */
    @Column(name = "category")
    private String category;

    /**
     *
     */
    @Column(name = "title")
    private String title;

    /**
     *
     */
    @Column(name = "description")
    private String description;

    /**
     *
     */
    @Column(name = "link_page")
    private String link_page;

    @CreationTimestamp
    private Timestamp createTime;
}
