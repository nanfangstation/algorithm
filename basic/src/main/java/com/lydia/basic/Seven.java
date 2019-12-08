package com.lydia.basic;

public class Seven {
    public static void main(String[] args) {
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001)
            t = (9.0/t + t) / 2.0;
        System.out.println(String.format("%.5f\n", t));
    }
    /*
    3.00009
    */
}
