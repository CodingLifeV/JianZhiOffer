package com.offer;

import java.util.ArrayList;

/**
 * 二叉树中和为某一值的路径
 */
public class Program_34 {
    private ArrayList<ArrayList<Integer>> ret = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        backTracking(root, target, new ArrayList<>());
        return ret;
    }

    private void backTracking(TreeNode node, int target, ArrayList<Integer> path) {
        if (node == null)
            return;
        path.add(node.val);
        target -= node.val;
        if (target == 0 && node.left == null && node.right == null) {
            ret.add(new ArrayList<>(path));
        } else {
            backTracking(node.left, target, path);
            backTracking(node.right, target, path);
        }
        path.remove(path.size() - 1);
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
