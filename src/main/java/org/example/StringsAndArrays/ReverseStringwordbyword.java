package org.example.StringsAndArrays;

public class ReverseStringwordbyword {
    public static void main(String[] args) {

        //1)this is word by word
        String str="Hello World";
        String[] words=str.split(" ");
        for(int i=0;i<words.length;i++){
            String temp="";
            for(int j=words[i].length()-1;j>=0;j--){
                temp+=words[i].charAt(j);
            }
            words[i]=temp;
        }
         //above solution and this both are same
        //2) solve reverse characters also in word by word
        String A="Hello World";;
        String final_ste="";
        String temp_str="";
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)!=' '){
                temp_str=temp_str+A.charAt(i);
            }
            else{
                final_ste=" "+temp_str+final_ste;
                temp_str="";
            }
        }
        final_ste=temp_str+final_ste; //last lo ee line mandetory because string lo last word ki space undadhu
        final_ste=final_ste.trim();
        System.out.println(final_ste);


    }
}
