package org.example.StringsAndArrays;

public class Problem1 {
    //remove spaces problem and print character wise
    public static String reverseword(String word){
      StringBuilder sb=new StringBuilder();
      char[] wordarray= word.toCharArray();
      for(char w:wordarray){

          if(w !=' '){
              sb.append(w).append(w);
          }
      }

      return sb.toString();
    }



    public static void main(String[] args) {
        String word="hello world good morning";
        System.out.println(reverseword(word));
    }
}
