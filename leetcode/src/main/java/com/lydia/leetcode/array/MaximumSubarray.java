package com.lydia.leetcode.array;

/**
 * @author Lydia
 * @see https://leetcode-cn.com/problems/maximum-subarray/
 * @since 2020-04-29 17:27
 **/
public class MaximumSubarray {

    /*
    这道题用动态规划的思路并不难解决，比较难的是后文提出的用分治法求解，但由于其不是最优解法，所以先不列出来
    动态规划的是首先对数组进行遍历，当前最大连续子序列和为 sum，结果为 ans
    如果 sum > 0，则说明 sum 对结果有增益效果，则 sum 保留并加上当前遍历数字
    如果 sum <= 0，则说明 sum 对结果无增益效果，需要舍弃，则 sum 直接更新为当前遍历数字
    每次比较 sum 和 ans的大小，将最大值置为ans，遍历结束返回结果
    时间复杂度：O(n)
    * */
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int ans = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
