package com.lydia.leetcode.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Lydia
 * @see https://leetcode-cn.com/problems/permutations/
 * @since 2020-04-26 00:08
 **/
public class Permutations {
    /*
    给定一个 没有重复 数字的序列，返回其所有可能的全排列。
    示例
    输入: [1,2,3]
    输出:
    [
      [1,2,3],
      [1,3,2],
      [2,1,3],
      [2,3,1],
      [3,1,2],
      [3,2,1]
    ]
    * */

    /*
    思路1：递归
    * */
    @Test
    public void testOne() {
        int[] nums = {1, 2, 3};
        System.out.println(permute(nums));
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null)
            return res;
        if (nums.length == 0) {
            res.add(new ArrayList<Integer>());
            return res;
        }

        ArrayList<Integer> list = new ArrayList<>();
        dfs(res, list, nums);
        return res;
    }

    private void dfs(List<List<Integer>> res, ArrayList<Integer> list, int[] nums) {

        int n = nums.length;
        if (list.size() == n) {
            res.add(new ArrayList<Integer>(list));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (list.contains(nums[i]))
                continue;
            list.add(nums[i]);
            dfs(res, list, nums);
            list.remove(list.size() - 1);
        }
    }
}
