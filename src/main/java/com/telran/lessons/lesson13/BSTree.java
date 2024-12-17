package com.telran.lessons.lesson13;

public class BSTree {

    public static void main(String[] args) {
        searchElement(TreeUtils.getBSTree(), 20);
    }

    private static void searchElement(TreeNode root, int element) {
        TreeNode current = root;
        System.out.println("Path: ");
        while(current != null) {
            System.out.print(current.getValue() + " -> ");
            if (current.getValue() == element) {
                System.out.println("\nElement " + element + " found");
                break;
            }
            if (current.getValue() > element) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }
    }
}
