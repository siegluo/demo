package com.example.demo.design.adapter.example.fishingboat;

/**
 * <h3>概要:</h3><p>BattleFishingBoat</p>
 * <h3>功能:</h3><p>战斗的渔船</p>
 * <h3>履历:</h3>
 * <li>2017年5月24日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public class BattleFishingBoat implements BattleShip {

    private FishingBoat boat;

    public BattleFishingBoat() {
        boat = new FishingBoat();
    }

    @Override
    public void fire() {
        System.out.println("开火 ...");
    }

    @Override
    public void move() {
        boat.sail();
    }
}
