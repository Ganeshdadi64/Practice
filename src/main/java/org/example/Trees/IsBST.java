package org.example.Trees;

public class IsBST {
    public static void main(String[] args) {
        TreeNode t1=new TreeNode(2);
        isBst(t1);
    }

    private static void isBst(TreeNode t1) {
        TreeNode pre=null;
        boolean isbst=true;
        if(t1==null){
            return;
        }
        isBst(t1.left);
        if(pre !=null && pre.data>t1.data){
            isbst=false;
        }
       pre=t1;
        isBst(t1.right);

    }
}
