package com.lydia.leetcode.tree;

import org.junit.Test;

/**
 * @author Lydia
 * @see https://leetcode-cn.com/problems/same-tree/
 * @since 2020-05-03 15:32
 **/
public class SameTree {

    @Test
    public void testOne() {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);
        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);
        System.out.println(isSameTree(p, q));
    }

    /*
    时间复杂度 : O(N)，其中 N 是树的结点数，因为每个结点都访问一次。

    空间复杂度 : 最优情况（完全平衡二叉树）时为 O(log(N))，最坏情况下（完全不平衡二叉树）时为 O(N)，用于维护递归栈。

    * */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false; // 此处最好不要反过来判断
        }
        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
