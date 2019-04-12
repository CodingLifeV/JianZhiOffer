package com.offer;

import java.util.Map;

/**
 * 平衡二叉树
 */
public class Program_55_2 {
    private boolean isBalance = true;
    public boolean TreeDepth(TreeNode pRoot) {
        maxDepth(pRoot);
        return isBalance;
    }
    private int maxDepth(TreeNode root) {
        if (root == null || !isBalance)
            return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        if (Math.abs(l - r) > 1) isBalance = false;
        return 1 + Math.max(l, r);
    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) { this.val = val; }
    }
}
