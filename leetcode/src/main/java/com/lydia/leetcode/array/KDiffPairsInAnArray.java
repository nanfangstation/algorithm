package com.lydia.leetcode.array;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Lydia
 * @see https://leetcode-cn.com/problems/k-diff-pairs-in-an-array/
 * @since 2020-05-05 01:56
 **/
public class KDiffPairsInAnArray {

    @Test
    public void testOne() {
        System.out.println(findPairs(new int[]{3, 1, 4, 1, 5}, 2));
        ;
    }

    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;
        if (k < 0) return count;
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], 0);
            map.put(nums[i], map.get(nums[i]) + 1);
        }
        for (int i : map.keySet()) {
            if (k == 0) {
                if (map.get(i) > 1)
                    count++;
            } else if (map.containsKey(i + k)) {
                count++;
            }
        }
        return count;
    }
}
