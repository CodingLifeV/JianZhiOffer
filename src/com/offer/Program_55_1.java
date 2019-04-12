package com.offer;

/**
 * 二叉树的深度
 */
public class Program_55_1 {
    public int TreeDepth(TreeNode pRoot) {
        return (pRoot == null) ? 0 : 1 + Math.max(TreeDepth(pRoot.left), TreeDepth(pRoot.right));
    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val) { this.val = val; }
    }
}
