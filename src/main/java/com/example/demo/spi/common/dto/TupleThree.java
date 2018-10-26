package com.example.demo.spi.common.dto;

/**
 * Created by xu_yanga on 2017/2/3.
 */
public class TupleThree<FirstType, SecondeType, ThreeType> {

    private final FirstType item1;
    private final SecondeType item2;
    private final ThreeType item3;

    public TupleThree(FirstType item1, SecondeType item2, ThreeType item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    public ThreeType getItem3() {
        return item3;
    }

    public FirstType getItem1() {
        return item1;
    }

    public SecondeType getItem2() {
        return item2;
    }
}
