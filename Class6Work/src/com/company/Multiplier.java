package com.company;

import java.math.BigDecimal;
import java.util.ArrayList;

public class Multiplier {

    private int a;
    private int b;
    private int c;
    private int d;
    private double e;
    private double f;
    private BigDecimal g;
    private BigDecimal h;
    public ArrayList<Integer> intArray = new ArrayList<Integer>();

    public int multiply (int a, int b){
        this.a = a;
        this.b = b;
        return a * b;
    }
    public int multiply (int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;

        int e = a*b;
        int f = c*d;

        int multiply = multiply(e, f);
        return multiply;
    }
    public double multiply (double e, double f){
        return e * f;
    }

    public BigDecimal multiply (BigDecimal g, BigDecimal h) {
        this.g = g;
        this.h = h;
        return g.multiply(h);
    }

    public int multiply(ArrayList<Integer>arrayListA){
    int product = 1;
        for (int i = 0; i < arrayListA.size(); i++){
        product *= arrayListA.get(i);
    }
        return product;
    }

}
