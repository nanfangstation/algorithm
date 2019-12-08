package com.lydia.basic;

import java.util.Random;

public class Thirteen {
    // 打印出一个 M 行 N 列的二维数组的转置(交换行和列)
    public static void main(String[] args) {
        int M = 3;
        int N = 2;
        int[][] array = new int[M][N];
        int[][] transpose = new int[N][M];
        System.out.println("转置前···");
        System.out.print(" ");
        for (int i = 0; i < N; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
        for (int i = 0; i < M; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < N; j++) {
                array[i][j] = new Random().nextInt(100);
                transpose[j][i] = array[i][j];
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("转置后···");
        System.out.print(" ");
        for (int i = 0; i < M; i++) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
        for (int i = 0; i < N; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < M; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
    /*
    转置前···
      0  1
    0 83 79
    1 81 45
    2 26 70
    转置后···
      0  1  2
    0 83 81 26
    1 79 45 70
    */
}
