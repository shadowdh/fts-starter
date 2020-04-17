package dev.foliage.fts.site.modules.index.enums;


/**
 * @Classname CategoryLevel
 * @Description TODO
 * @Author ShadowDh
 * @Date 2020-04-17 15:27
 */

public enum CategoryEnum {
    FIRST_LEVEL("第一级", 1),
    SECOND_LEVEL("绿色", 2),
    THIRD_LEVEL("白色", 3),
    FOURTH_LEVEL("黄色", 4);

    private String name;
    private int level;

    private CategoryEnum(String name, int index) {
        this.level = index;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }
}
