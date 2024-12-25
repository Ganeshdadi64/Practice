package org.example.Stacks;

import java.util.Stack;

public class NextSmallerLeftElement {
    public static void main(String[] args) {
        int[] array={1,2,5,7,3,9,4,1};
        int[] ans=new int[array.length];
        Stack<Integer> st=new Stack<>();

        ans[0]=-1;
        for(int i=0;i<array.length;i++){
            while (st.size()>0 && st.peek()>=array[i]){
                st.pop();
            }
            if(st.size()==0){
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(array[i]);
        }
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }

    }


}
