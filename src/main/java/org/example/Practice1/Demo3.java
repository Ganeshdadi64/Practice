package org.example.Practice1;

import java.util.HashSet;
import java.util.Stack;

public class Demo3 {
    public static void main(String[] args) {

        String str= "pwwkew";
        int ans=lenOfString(str);
        System.out.println(ans);

    }

    private static int lenOfString(String str) {
        HashSet<Character> st = new HashSet<>(); // Use HashSet to track unique characters
        int maxLen = 0;
        int left = 0; // Pointer to track the start of the substring

        for (int right = 0; right < str.length(); right++) {
            char ch = str.charAt(right);

            // If duplicate character is found, remove elements from the left
            while (st.contains(ch)) {
                st.remove(str.charAt(left));
                left++;
            }

            // Add the new character to the set
            st.add(ch);

            // Update the max length of the substring
            maxLen = Math.max(maxLen, st.size());
        }

        return maxLen;
    }








 //my approch
 //============

//    private static int lenofstring(String str) {
//        HashSet<Character> st=new HashSet<>();
//        int maxlen=0;
//        for(int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            if(st.contains(ch)){
//                maxlen=Math.max(maxlen,st.size());
//                while(!st.isEmpty() && st.size()<=0){
//                    st.add(ch);
//                }
//                st.add(ch);
//            }else {
//                st.add(ch);
//            }
//        }
//        return maxlen;
//    }



}
