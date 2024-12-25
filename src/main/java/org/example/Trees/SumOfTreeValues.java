package org.example.Trees;

public class SumOfTreeValues {
    public static void main(String[] args) {
        TreeNode t1=new TreeNode(2);
        t1.left=new TreeNode(3);
        t1.right=new TreeNode(5);
        t1.left.left=new TreeNode(7);
        t1.left.right=new TreeNode(11);
        t1.right.left=new TreeNode(13);
        t1.right.right=new TreeNode(17);

        System.out.println(sum(t1));
    }
    static int sum(TreeNode root){
        if(root==null){
            return 0;
        }
        return root.data+sum(root.left)+sum(root.right);
    }
}
