package com.example.demo.design.adapter.example.fishingboat;

/**
 * <h3>概要:</h3><p>Captain</p>
 * <h3>功能:</h3><p>船长</p>
 * <h3>履历:</h3>
 * <li>2017年5月24日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public class Captain {

    private BattleFishingBoat battleFishingBoat;

    public Captain() {
    }

    public Captain(BattleFishingBoat battleFishingBoat) {
        this.battleFishingBoat = battleFishingBoat;
    }

    public void fire() {
        battleFishingBoat.fire();
    }

    public void move() {
        battleFishingBoat.move();
    }
}
