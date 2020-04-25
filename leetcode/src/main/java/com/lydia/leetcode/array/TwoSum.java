package com.lydia.leetcode.array;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author Lydia
 * @see https://leetcode-cn.com/problems/two-sum/
 * @since 2020-04-26 00:44
 **/
public class TwoSum {
    /*
    给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
    你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
    示例:

    给定 nums = [2, 7, 11, 15], target = 9

    因为 nums[0] + nums[1] = 2 + 7 = 9
    所以返回 [0, 1]
    * */

    /*
    思路：暴力搜索
    时间复杂度：O(n^2)
    空间复杂度：O(1)
    * */
    @Test
    public void testOne() {
        int[] nums = {3, 3};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
