package com.example.demo.gc;

/**
 * Function: Eden区不够分配时，发生minorGC
 * @since JDK 1.8
 */
public class MinorGC {

    /**
     * 1M
     */
    private static final int SIZE = 1024 * 1024 ;

    /**
     *
     -XX:+PrintGCDetails
     -XX:+UseG1GC / +UseConcMarkSweepGC  / +UseSerialGC / +UseParallelGC
     -XX:PrintTenuringDistribution
     -Xms20M
     -Xmx20M
     -Xmn10M
     -XX:SurvivorRatio=8
     * @param args
     */
    public static void main(String[] args) {
        byte[] one ;
        byte[] two ;
        byte[] three ;
        byte[] four ;

        one = new byte[4 * SIZE] ;


        //再分配一个 5M 内存时，Eden区不够了，
        two = new byte[5 * SIZE] ;

        three = new byte[5 * SIZE] ;

        //防止对象游离
        two = null;

        //再分配一个 5M 内存时，会不会发生 full GC ?
        four = new byte[5 * SIZE] ;
    }
}
