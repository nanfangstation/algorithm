package com.lydia.datastructure;

import org.junit.Test;

/**
 * @author Lydia
 * @since 2020-04-25 13:59
 **/
public class ArrayDemo {

    @Test
    public void copy() {
        int[] oldArray = new int[10];

        int[] newArray = new int[20];

        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }

        // 也可以使用System.arraycopy方法来实现数组间的复制
        // System.arraycopy(oldArray, 0, newArray, 0, oldArray.length);

        oldArray = newArray;
    }

}
