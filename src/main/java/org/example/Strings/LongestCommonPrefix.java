package org.example.Strings;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] A={"flower","flow","flight"};
        StringBuilder result=new StringBuilder();
        //sort the array
        Arrays.sort(A);
        char[] first=A[0].toCharArray();
        char[] last=A[A.length-1].toCharArray();

        //start comparing

        for(int i=0;i<first.length;i++){
            if(first[i] !=last[i]){
                break;
            }
            result.append(first[i]);
        }
        System.out.println(result);
    }
}
