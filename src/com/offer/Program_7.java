package com.offer;

import sun.reflect.generics.tree.Tree;

import javax.swing.tree.TreeNode;
import java.util.HashMap;
import java.util.Map;

/**
 * 重建二叉树
 */
public class Program_7 {

    private Map<Integer, Integer> indexForInOrders = new HashMap<>();

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        for (int i = 0; i < in.length; i++) {
            indexForInOrders.put(in[i], i);
        }

        return reConstructBinaryTree(pre, 0, pre.length-1, 0);
    }

    private TreeNode reConstructBinaryTree(int[] pre, int preL, int preR, int inL) {
        if (preL > preR) return null;
        TreeNode root = new TreeNode(pre[preL]);
        int inIndex = indexForInOrders.get(root.val);
        int leftTreeSize = inIndex - inL;
        root.left  =
                reConstructBinaryTree(pre, preL+1, preL+leftTreeSize, inL);
        root.right =
                reConstructBinaryTree(pre, preL+leftTreeSize+1, preR, inL+leftTreeSize+1);
        return root;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
