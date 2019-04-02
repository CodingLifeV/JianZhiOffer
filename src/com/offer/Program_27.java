package com.offer;

/**
 * 二叉树的镜像
 */
public class Program_27 {
    public void Mirror(TreeNode root) {
        if (root == null) return;
        swap(root);
        Mirror(root.left);
        Mirror(root.right);
    }
    private void swap(TreeNode root) {
        TreeNode t = root.left;
        root.left = root.right;
        root.right = t;
    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
