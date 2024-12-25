package org.example.Trees;

// This class demonstrates how to calculate the height of a binary tree.
public class HeightOfTree {
    public static void main(String[] args) {
        // Creating the root node of the tree with a value of 2
        TreeNode t1 = new TreeNode(2);
        // Adding left and right child nodes for the root
        t1.left = new TreeNode(3);
        t1.right = new TreeNode(5);
        // Adding child nodes for the left and right children of the root
        t1.left.left = new TreeNode(7);
        t1.left.right = new TreeNode(11);
        t1.right.left = new TreeNode(13);
        t1.right.right = new TreeNode(17);

        // Printing the height of the binary tree rooted at t1
        System.out.println(height(t1));
    }

    // This function recursively calculates the height of a binary tree.
    // The height of a tree is defined as the maximum depth from the root to any leaf node.
    static int height(TreeNode root) {
        // Base case: if the tree is empty, the height is 0
        if (root == null) {
            return 0;
        }
        // Recursive case: 1 (for the current node) + maximum height of left and right subtrees
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
