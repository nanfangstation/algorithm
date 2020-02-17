package com.lydia.basic;

public class Sixteen {
    // 给出 exR1(6) 的返回值
    public static void main(String[] args) {
        System.out.println(exR1(6));
    }

    public static String exR1(int n) {
        if (n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }
    /*
    311361142246
    */
}
