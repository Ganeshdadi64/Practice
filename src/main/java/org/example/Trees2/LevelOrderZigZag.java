package org.example.Trees2;

import org.example.Trees.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class LevelOrderZigZag {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        Deque<TreeNode> q=new LinkedList<>();
        q.add(root);
        int level=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode t=q.poll();
                if(level%2==0){
                    q.addLast(t.right);
                    q.addLast(t.left);

                }else{
                    q.addFirst(t.left);
                    q.addFirst(t.right);

                }
            }
            level++;
        }
    }
}
