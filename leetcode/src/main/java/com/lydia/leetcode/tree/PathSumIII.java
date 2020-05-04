package com.lydia.leetcode.tree;

/**
 * @author Lydia
 * @since 2020-05-05 00:52
 **/
public class PathSumIII {

    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return helper(root, sum) + helper(root.left, sum) + helper(root.right, sum);
    }

    private int helper(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        sum -= root.val;
        return (sum == 0 ? 1 : 0) + helper(root.left, sum) + helper(root.right, sum);
    }
}
