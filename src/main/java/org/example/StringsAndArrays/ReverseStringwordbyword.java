package org.example.StringsAndArrays;

import java.io.FilterOutputStream;

public class ReverseStringwordbyword {
    public static void main(String[] args) {

        //1)this is word by word
        String str="Hello World";
        String[] words=str.split(" ");
        String temp="";
        for(int i=words.length-1;i>=0;i--){

            temp+=words[i];


        }

        System.out.println(temp);
//        for(String s:words){
//            System.out.println(s);
//        }
         //above solution and this both are same
        //2) solve reverse characters also in word by word
//        String A="Hello World";;
//        String final_ste="";
//        String temp_str="";
//        for(int i=0;i<A.length();i++){
//            if(A.charAt(i)!=' '){
//                temp_str=temp_str+A.charAt(i);
//            }
//            else{
//                final_ste=" "+temp_str+final_ste;
//                temp_str="";
//            }
//        }
//        final_ste=temp_str+final_ste; //last lo ee line mandetory because string lo last word ki space undadhu
//        final_ste=final_ste.trim();
//        System.out.println(final_ste);
//

    }
}
