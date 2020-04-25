package com.lydia.leetcode.array;

import org.junit.Test;

/**
 * @author Lydia
 * @see https://leetcode-cn.com/problems/third-maximum-number/
 * @since 2020-04-26 02:22
 **/
public class ThirdMax {
    /*
    给定一个非空数组，返回此数组中第三大的数。如果不存在，则返回数组中最大的数。要求算法时间复杂度必须是O(n)。

    示例 1:

    输入: [3, 2, 1]

    输出: 1

    解释: 第三大的数是 1.
    * */

    @Test
    public void test() {
        int[] nums = {2, 2, 3, 1};
        System.out.println(thirdMax(nums));
    }

    public int thirdMax(int[] nums) {
        long one = -Long.MAX_VALUE;
        long two = -Long.MAX_VALUE;
        long three = -Long.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > one) {
                three = two;
                two = one;
                one = nums[i];
            } else if (nums[i] > two && nums[i] < one) {
                three = two;
                two = nums[i];
            } else if (nums[i] > three && nums[i] < two)
                three = nums[i];
        }
        if (three == -Long.MAX_VALUE) return (int) one;
        else return (int) three;
    }
}
