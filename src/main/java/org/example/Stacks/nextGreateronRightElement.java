package org.example.Stacks;

import java.util.Stack;

public class nextGreateronRightElement {
    public static void main(String[] args) {


        int[] array={1,2,5,7,3,9,4,1};
        int[] ans=new int[array.length];
        Stack<Integer> st=new Stack<>();
//        for(int j=0;j<array.length;j++){
//            st.push(array[j]);
//        }

        for(int i=array.length-1;i>=0;i--){
            while (st.size()>0 && st.peek() <= array[i]){  // the only difference is here
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
