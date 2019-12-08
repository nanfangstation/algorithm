package com.lydia.basic;

public class Nine {
    /* 将一个正整数 N 用二进制表示并转换为一个 String 类型的值 s */
    public static void main(String[] args) {
        int N = 10;
        String s = "";
        for (int n = N; n > 0; n /= 2)
            s = (n % 2) + s;
        System.out.println(s);
        System.out.println(Integer.toBinaryString(N));
    }
    /*
    1010
    1010
    */
}
