package com.example.demo.design.builder.example.hero;

/**
 * <h3>概要:</h3><p>Hero</p>
 * <h3>功能:</h3><p>Hero</p>
 * <h3>履历:</h3>
 * <li>2017年5月23日  v0.1 版本内容: 新建</li>
 */
public final class Hero {

    private String name; // 名称

    private String armor; // 盔甲

    private String weapon; // 武器

    private Hero(Builder builder) {
        this.name = builder.name;
        this.armor = builder.armor;
        this.weapon = builder.weapon;
    }

    @Override
    public String toString() {
        StringBuffer content = new StringBuffer();
        content.append("Person[");
        content.append("name = ").append(this.name).append(", ");
        content.append("armor = ").append(this.armor).append(", ");
        content.append("weapon = ").append(this.weapon).append("]");
        return content.toString();
    }

    public static class Builder {
        private String name; // 名称

        private String armor; // 盔甲

        private String weapon; // 武器

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setArmor(String armor) {
            this.armor = armor;
            return this;
        }

        public Builder setWeapon(String weapon) {
            this.weapon = weapon;
            return this;
        }

        public Hero build() {
            return new Hero(this);
        }
    }
}