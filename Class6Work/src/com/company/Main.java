package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Multiplier fourImputs = new Multiplier();
        Multiplier productByList = new Multiplier();
        Multiplier bidDMultiplier = new Multiplier();
        Adder bigD = new Adder();
        Address myHause = new Address();


        ArrayList<Integer> arrayListA = new ArrayList<Integer>();
        arrayListA.add(2);
        arrayListA.add(5);
        arrayListA.add(4);
        arrayListA.add(4);

        ArrayList<BigDecimal> arrayListB = new ArrayList<BigDecimal>();
        arrayListB.add(BigDecimal.valueOf(53.552));
        arrayListB.add(BigDecimal.valueOf(5.32));
        arrayListB.add(BigDecimal.valueOf(5.302));
        arrayListB.add(BigDecimal.valueOf(0.532));


        System.out.println(fourImputs.multiply(2,4,6,3));
        System.out.println(productByList.multiply(arrayListA));
        System.out.println(bidDMultiplier.multiply(3.4565, 3467));
        System.out.println(bigD.add(arrayListB));
        String myAddress = myHause.createAddress("usa", "Maplewood", 07052);
        System.out.println(myAddress);
    }
}
