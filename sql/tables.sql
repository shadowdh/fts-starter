CREATE DATABASE IF NOT EXISTS `fts`;

/*
    site_index_slider
*/

CREATE TABLE IF NOT EXISTS `fts`.`site_index_slider`
(
    `id`           int unsigned  NOT NULL AUTO_INCREMENT COMMENT 'ID',
    `data_bg_img`  varchar(1024) NOT NULL COMMENT '背景图片',
    `banner_image` varchar(1024) NOT NULL COMMENT '展示图片',
    `category`     varchar(36)   NOT NULL COMMENT '副标题',
    `title`        varchar(100)  NOT NULL COMMENT '主标题',
    `description`  varchar(1024) NOT NULL COMMENT '文字描述',
    `link_page`    varchar(1024) NOT NULL COMMENT '链接地址',
    `create_time`  timestamp(6)  NOT NULL DEFAULT CURRENT_TIMESTAMP(6) ON UPDATE CURRENT_TIMESTAMP(6) COMMENT '创建时间',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='轮播列表';

insert into `fts`.`site_index_slider`(data_bg_img, banner_image, category, title, description, link_page, create_time)
values ('static/img/banner/bannar1-img1.png',
        'static/img/banner/chare.png',
        '#furniture',
        'Smart Wooden Chair',
        'It is a long established fact that a reader will be distracted by the readable content of page at its layout.',
        'shop-details.html',
        CURRENT_TIMESTAMP(6));

insert into `fts`.`site_index_slider`(data_bg_img, banner_image, category, title, description, link_page, create_time)
values ('static/img/banner/bannar1-img2.png',
        'static/img/banner/bag.png',
        '#travelbag',
        'Davis Travel Bag',
        'It is a long established fact that a reader will be distracted by the readable content of page at its layout.',
        'shop-details.html',
        CURRENT_TIMESTAMP(6)),
       ('static/img/banner/bannar1-img3.png',
        'static/img/banner/lamp.png',
        '#homedecor',
        'Outdoor Table Lamp',
        'It is a long established fact that a reader will be distracted by the readable content of page at its layout.',
        'shop-details.html',
        CURRENT_TIMESTAMP(6));

select *
from `fts`.`site_index_slider`;

/*
    site_index_category
*/

CREATE TABLE IF NOT EXISTS `fts`.`site_index_category`
(
    `id`         int unsigned  NOT NULL AUTO_INCREMENT COMMENT 'ID',
    `name_en_us` varchar(50)   NOT NULL COMMENT '英文名字',
    `name_zh_cn` varchar(100)  NOT NULL COMMENT '中文名字',
    `level`      tinyint       NOT NULL COMMENT '层级',
    `parent_id`  int unsigned  NOT NULL COMMENT '父ID',
    `link_page`  varchar(1024) NOT NULL COMMENT '链接地址',
    `order`      tinyint       NOT NULL COMMENT '排序位置',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8 COMMENT ='导航列表';

insert into `fts`.`site_index_category`(id, name_en_us, name_zh_cn, `level`, parent_id, link_page, `order`)
VALUES (1, 'HOME', '首页', 1, 0, 'index.html', 1),
       (2, 'SHOP', '商店', 1, 0, 'shop-details.html', 2),
       (3, 'CATEGORIES', '商品分类', 1, 0, 'categories-page1.html', 3),
       (4, 'COLLECTION', '展览馆', 1, 0, 'collection-page1.html', 4),
       (5, 'BLOG', '博客', 1, 0, 'blog-2clumn.html', 6),
       (6, 'CONTACT', '联系方式', 1, 0, 'contact.html', 7);

insert into `fts`.`site_index_category`(name_en_us, name_zh_cn, `level`, parent_id, link_page, `order`)
VALUES ('CATEGORIES1', '商品分类1', 2, 3, 'categories-page2.html', 1),
       ('CATEGORIES2', '商品分类2', 2, 3, 'categories-page2.html', 2),
       ('CATEGORIES3', '商品分类3', 2, 3, 'categories-page2.html', 3),
       ('CATEGORIES4', '商品分类4', 2, 3, 'categories-page2.html', 4),
       ('CATEGORIES5', '商品分类5', 2, 3, 'categories-page2.html', 5),
       ('CATEGORIES6', '商品分类6', 2, 3, 'categories-page2.html', 6);

insert into `fts`.`site_index_category`(name_en_us, name_zh_cn, `level`, parent_id, link_page, `order`)
VALUES ('CATEGORIES7', '商品分类7', 3, 10, 'categories-page2.html', 1),
       ('CATEGORIES8', '商品分类8', 3, 10, 'categories-page2.html', 2),
       ('CATEGORIES9', '商品分类9', 3, 10, 'categories-page2.html', 3);

insert into `fts`.`site_index_category`(name_en_us, name_zh_cn, `level`, parent_id, link_page, `order`)
VALUES ('HOME1', '首页二级1', 2, 1, 'categories-page2.html', 1),
       ('HOME2', '首页二级2', 2, 1, 'categories-page2.html', 2),
       ('HOME3', '首页二级3', 2, 1, 'categories-page2.html', 3);


select *
from `fts`.`site_index_category`;

drop table `fts`.`site_index_category`;