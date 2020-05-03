package com.lydia.leetcode.tree;

import org.junit.Test;

/**
 * @author Lydia
 * @see https://leetcode-cn.com/problems/balanced-binary-tree/
 * @since 2020-05-03 20:21
 **/
public class BalancedBinaryTree {

    @Test
    public void testOne() {
        TreeNode a = new TreeNode(3);
        a.left = new TreeNode(9);
        a.right = new TreeNode(20);
        a.right.left = new TreeNode(15);
        a.right.right = new TreeNode(7);
        System.out.println(isBalanced(a));
    }

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(height(root.left) - height(root.right)) < 2
                && isBalanced(root.left)
                && isBalanced(root.right);
    }

    private int height(TreeNode root) {
        if (root == null) {
            return -1;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
