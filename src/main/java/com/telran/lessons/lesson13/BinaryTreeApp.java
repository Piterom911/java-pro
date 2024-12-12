package com.telran.lessons.lesson13;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeApp {

    public static void main(String[] args) {
        TreeNode root = TreeUtils.getSampleThree();

        // BFS -> Breadth First Search -> Iteratively
        breadthFirstSearch(root);
        breadthFirstSearchWithLevelInfo(root);

        // DFS -> Depth First Search -> Recursively (Inorder, Preorder, Postorder)
        inorderDepthFirstSearch(root);
        System.out.println();
        preorderDepthFirstSearch(root);
        System.out.println();
        postDepthFirstSearch(root);
    }

    private static void postDepthFirstSearch(TreeNode root) {
        if (root == null) {
            return;
        }

        preorderDepthFirstSearch(root.getLeft());
        preorderDepthFirstSearch(root.getRight());
        System.out.print(root.getValue() + " ");
    }

    private static void preorderDepthFirstSearch(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.getValue() + " ");
        preorderDepthFirstSearch(root.getLeft());
        preorderDepthFirstSearch(root.getRight());
    }

    private static void inorderDepthFirstSearch(TreeNode root) {
        if (root == null) {
            return;
        }

        inorderDepthFirstSearch(root.getLeft());
        System.out.print(root.getValue() + " ");
        inorderDepthFirstSearch(root.getRight());
    }

    private static void breadthFirstSearch(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.getValue() + " ");
            if (node.getLeft() != null) {
                queue.add(node.getLeft());
            }
            if (node.getRight() != null) {
                queue.add(node.getRight());
            }
        }
        System.out.println();
    }

    private static void breadthFirstSearchWithLevelInfo(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                System.out.print(node.getValue() + " ");
                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                }
                if (node.getRight() != null) {
                    queue.add(node.getRight());
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
