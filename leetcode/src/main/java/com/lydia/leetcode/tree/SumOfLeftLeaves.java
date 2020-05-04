package com.lydia.leetcode.tree;

import org.junit.Test;

/**
 * @author Lydia
 * @since 2020-05-05 00:36
 **/
public class SumOfLeftLeaves {

    @Test
    public void testOne() {
        TreeNode a = new TreeNode(3);
        a.left = new TreeNode(9);
        a.right = new TreeNode(20);
        a.right.left = new TreeNode(15);
        a.right.right = new TreeNode(7);
        System.out.println(sumOfLeftLeaves(a));
    }

    int sum = 0;

    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) //如果输入的是空树就直接退出
            return 0;

        if (root.left != null && (root.left.right != null || root.left.left != null))
            sumOfLeftLeaves(root.left);

        if (root.left != null && root.left.left == null && root.left.right == null)
            sum += root.left.val;

        if (root.right != null && (root.right.right != null || root.right.left != null))
            sumOfLeftLeaves(root.right);

        return sum;
    }
}
