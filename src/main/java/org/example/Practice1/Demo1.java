package org.example.Practice1;

public class Demo1 {


    public static void main(String[] args) {
        //input
        String str="a2b3c2";
        //output=aabbbcc
        String temp="";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLetter(ch)){
                int count = str.charAt(i + 1) - '0';

                sb.append(String.valueOf(ch).repeat(count));
            }
        }
    }
}
