package com.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 把二叉树打印成多行
 */
public class Program_32_2 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode root) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int n = queue.size();
            while (n-- > 0) {
                TreeNode node = queue.poll();
                if (node == null) {
                    continue;
                }
                list.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
            if (list.size() != 0) {
                ret.add(list);
            }
        }
        return ret;
    }
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
