package dev.foliage.fts.site.modules.index.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * @Classname category
 * @Description TODO
 * @Author ShadowDh
 * @Date 2020-04-10 13:34
 */

@Entity
@Data
@Table(name="site_index_category")
public class Category implements Serializable {
    /**
     * 唯一编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long id;

    @Column(name = "name_en_us")
    private String nameEnUs;

    @Column(name = "name_zh_cn")
    private String nameZhCn;

    @Column(name = "level")
    private Integer level;

    @Column(name = "parent_id")
    private Long parentId;

    @Column(name = "link_page")
    private String link_page;

    @Column(name = "order")
    private Integer order;

}
