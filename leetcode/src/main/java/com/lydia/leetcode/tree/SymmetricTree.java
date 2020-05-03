package com.lydia.leetcode.tree;

import org.junit.Test;

/**
 * @author Lydia
 * @see https://leetcode-cn.com/problems/symmetric-tree/
 * @since 2020-05-03 15:58
 **/
public class SymmetricTree {

    @Test
    public void testOne() {
        TreeNode a = new TreeNode(1);
        a.left = new TreeNode(2);
        a.right = new TreeNode(2);
        a.left.left = new TreeNode(3);
        a.left.right = new TreeNode(4);
        a.right.left = new TreeNode(4);
        a.right.right = new TreeNode(3);
        System.out.println(isSymmetric(a));
    }

    /*
    时间复杂度：O(n)，因为我们遍历整个输入树一次，所以总的运行时间为 O(n)，其中 n 是树中结点的总数。
    空间复杂度：递归调用的次数受树的高度限制。在最糟糕情况下，树是线性的，其高度为 O(n)。因此，在最糟糕的情况下，由栈上的递归调用造成的空间复杂度为 O(n)。
    * */
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    public boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
