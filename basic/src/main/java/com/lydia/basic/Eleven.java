package com.lydia.basic;

public class Eleven {
    /* 打印出一个二维布尔数组的内容。其中，使用 * 表示真，空格表示假。打印出行号和列号*/
    public static void main(String[] args) {
        int row = 2;
        int column = 3;
        boolean[][] a = {{false, true, false}, {false, false, true}};
        System.out.print(" ");
        for (int j = 0; j < column; j++) {
            System.out.print(j);
        }
        System.out.println();
        for (int i = 0; i < row; i++) {
            System.out.print(i);
            for (int j = 0; j < column; j++) {
                if (a[i][j]) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
    /*
     012
    0 *
    1  *
    */
}
