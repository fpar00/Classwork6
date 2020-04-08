package com.company;

import java.util.ArrayList;
import java.math.BigDecimal;

public class Adder {
    private int a;
    private int b;

    public int add(int a, int b) {
        this.a = a;
        this.b = b;
        return a+b;
    }

    public static BigDecimal add (ArrayList<BigDecimal> arrayListB) {
        BigDecimal product = BigDecimal.valueOf(0.00);
        for(int i = 0; i < arrayListB.size(); i++){
            product = product.add(arrayListB.get(i));
        }
        return product;
    }
}
