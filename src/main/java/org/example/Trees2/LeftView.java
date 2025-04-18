package org.example.Trees2;

import org.example.Trees.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class LeftView {
    public static void main(String[] args) {

        TreeNode t1=new TreeNode(1);
        TreeNode t2=new TreeNode(2);
        TreeNode t3=new TreeNode(3);
        TreeNode t4=new TreeNode(4);
        TreeNode t5=new TreeNode(5);
        TreeNode t6=new TreeNode(6);
        TreeNode t7=new TreeNode(7);
        t1.left=t2;
        t1.right=t3;
        t2.left=t4;
        t2.right=t5;
        t3.left=t6;
        t3.right=t7;


        Queue<TreeNode> Q=new LinkedList<>();
        Q.add(t1);

        while(!Q.isEmpty()){
            int size=Q.size();
            for(int i=0;i<size;i++){
                TreeNode t=Q.poll();
                if(i==0){
                    System.out.println(t.data);
                }
                Q.remove();
                if(t.left!=null){
                    Q.add(t.left);
                }
                if(t.right!=null){
                    Q.add(t.right);
                }
            }
        }
    }
}
