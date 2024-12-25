package org.example.Trees;

public class InsertBST {

    public static void main(String[] args) {
        // Create a sample tree (root node with value 2)
        TreeNode root = new TreeNode(2);

        // Call the method to insert a new value into the BST
        insertIntoBST(root, 3);
        searchBST(root,2);
        IsBst(root);
    }

    private static void IsBst(TreeNode root) {
        if(root==null){
            return;
        }

        if(root.left!=null && root.data<=root.left.data){
            System.out.println("Not BST");
            return;
        }
        if(root.right!=null && root.data>=root.right.data){
            System.out.println("Not BST");
        }
        else{
            System.out.println("BST");
        }

    }

    //SEARCH ELEMENT IN BST
   static void searchBST(TreeNode root, int i) {
        if (root == null) {
            return;
        }
        if (root.data == i) {
            System.out.println("Found");
        } else if (i < root.data) {
            searchBST(root.left, i);
        } else {
            searchBST(root.right, i);
        }

    }

    // Method to insert a value in the Binary Search Tree
    static TreeNode insertIntoBST(TreeNode root, int k) {
        // Base case: If the root is null, create a new node and return it
        if (root == null) {
            return new TreeNode(k);
        }

        // If the value is less than the current node, recurse to the left
        if (k < root.data) {
            root.left = insertIntoBST(root.left, k);
        } else if (k > root.data) { // If the value is greater, recurse to the right
            root.right = insertIntoBST(root.right, k);
        }

        // Return the (unchanged) root node
        return root;
    }
}