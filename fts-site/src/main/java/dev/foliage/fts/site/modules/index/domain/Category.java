package dev.foliage.fts.site.modules.index.domain;

import lombok.Data;

import javax.persistence.*;
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
    private Integer id;

    @Column(name = "name_en_us")
    private String nameEnUs;

    @Column(name = "name_zh_cn")
    private String nameZhCn;

    @Column(name = "leave")
    private Integer leave;

    @Column(name = "parent_id")
    private Integer parentId;

    @Column(name = "order")
    private Integer order;

}
