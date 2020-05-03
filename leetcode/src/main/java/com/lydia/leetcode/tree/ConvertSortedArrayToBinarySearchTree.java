package com.lydia.leetcode.tree;

import org.junit.Test;

/**
 * @author Lydia
 * @see https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree/
 * @since 2020-05-03 19:24
 **/
public class ConvertSortedArrayToBinarySearchTree {

    @Test
    public void testOne() {
        System.out.println((sortedArrayToBST(new int[]{-10, -3, 0, 5, 9})));
    }

    int[] nums;

    public TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return helper(0, nums.length - 1);
    }

    public TreeNode helper(int left, int right) {
        if (left > right) return null;

        // always choose left middle node as a root
        int p = (left + right) / 2;

        // inorder traversal: left -> node -> right
        TreeNode root = new TreeNode(nums[p]);
        root.left = helper(left, p - 1);
        root.right = helper(p + 1, right);
        return root;
    }

}
