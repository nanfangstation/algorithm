package com.lydia.leetcode.tree;

/**
 * @author Lydia
 * @since 2020-05-04 00:15
 **/
public class PathSum {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        sum -= root.val;
        if (root.left == null && root.right == null) {
            return (sum == 0);
        }
        return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
    }
}
