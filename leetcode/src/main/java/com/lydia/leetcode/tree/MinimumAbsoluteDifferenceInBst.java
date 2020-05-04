package com.lydia.leetcode.tree;

import org.junit.Test;

/**
 * @author Lydia
 * @see https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/
 * @since 2020-05-05 01:41
 **/
public class MinimumAbsoluteDifferenceInBst {

    @Test
    public void testOne() {
        TreeNode a = new TreeNode(1);
        a.right = new TreeNode(3);
        a.right.left = new TreeNode(2);
        System.out.println(getMinimumDifference(a));
    }

    TreeNode pre = null;
    int res = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) return 0;
        helper(root);
        return res;
    }

    private void helper(TreeNode root) {
        if (root == null) return;
        helper(root.left);
        if (pre != null) {
            //求相邻节点的差值
            res = Math.min(res, Math.abs(root.val - pre.val));
        }
        pre = root;
        helper(root.right);
    }
}
