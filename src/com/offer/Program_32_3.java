package com.offer;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 按之字形顺序打印二叉树
 */
public class Program_32_3 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode root) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        boolean reverse = false;
        while (!queue.isEmpty()) {
            int cnt = queue.size();
            ArrayList list = new ArrayList();
            while (cnt-- > 0) {
                TreeNode node = queue.poll();
                if (node == null) continue;
                list.add(node.val);
                queue.add(node.left);
                queue.add(node.right);

            }
            if (reverse)
                Collections.reverse(list);
            reverse = !reverse;
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
