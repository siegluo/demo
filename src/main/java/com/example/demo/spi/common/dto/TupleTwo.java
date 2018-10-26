package com.example.demo.spi.common.dto;

/**
 * Created by xu_yanga on 2017/2/3.
 */
public class TupleTwo<FirstType, SecondeType> {

    private final FirstType item1;
    private final SecondeType item2;

    public TupleTwo(FirstType item1, SecondeType item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public FirstType getItem1() {
        return item1;
    }

    public SecondeType getItem2() {
        return item2;
    }
}
