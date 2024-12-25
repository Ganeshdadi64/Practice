package org.example.Trees2;

import org.example.Trees.TreeNode;

import java.util.Stack;

public class IterativeInOrder {

    public static void main(String[] args) {

        TreeNode t1=new TreeNode(2);
        inOrder(t1);
        PreOrder(t1);
        PostOrder(t1);
    }

     static void PostOrder(TreeNode t1) {
        Stack<TreeNode> st=new Stack<>();
        st.push(t1);
        while(st.size()>0){
            TreeNode t2=st.peek();
            st.pop();
            if(t2.left!=null){
                st.push(t2.left);
            }
            if(t2.right!=null){
                st.push(t2.right);
            }
        }

    }

     static void PreOrder(TreeNode t1) {
        Stack<TreeNode> st=new Stack<>();
        st.push(t1);
        while(st.size()>0){
            TreeNode t2=st.peek();
            st.pop();
            System.out.println(t2.data);
            if(t2.right!=null){
                st.push(t2.right);
            }
            if(t2.left!=null){
                st.push(t2.left);
            }

        }


    }

    static void inOrder(TreeNode t1) {
         Stack<TreeNode> st = new Stack<>();
         TreeNode curr=t1;
         while(curr!=null || st.size()>0){
             while(curr !=null){
                 st.push(curr);
                 curr=curr.left;
             }
             TreeNode t2=st.peek();
             st.pop();
             System.out.println(t2.data);
         }
    }
}
