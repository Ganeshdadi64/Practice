package org.example.Practice1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {

        String str="aabbbccdd";
        String str2=result(str);
        System.out.println(str2);
//        String str="Test Automation Java Automation";
//
//        String str1= CharacterCount(str);
//        System.out.println(str1);

    }

    private static String result(String str) {
        TreeMap<Character , Integer> sm= new TreeMap<>();
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(sm.containsKey(ch)){
                int v=sm.get(ch);
                sm.put(ch,v+1);

            }else {
                sm.put(ch,1);
            }
        }



        for (Map.Entry<Character, Integer> characterIntegerEntry : sm.entrySet()) {
            sb.append(characterIntegerEntry.getKey()).append(characterIntegerEntry.getValue());

        }
        return sb.toString();
    }

//    static String CharacterCount(String inputString) {
//        // Use TreeMap to maintain sorted order of keys
////        TreeMap<String, Integer> charCountMap = new TreeMap<>();
////
////        // Split the string into words and count frequencies
////        for (String s : inputString.split(" ")) {
////            if (charCountMap.containsKey(s)) {
////                charCountMap.put(s, charCountMap.get(s) + 1);
////            } else {
////                charCountMap.put(s, 1);
////            }
////        }
////        StringBuilder sb=new StringBuilder();
////         for(Map.Entry<String , Integer> entry: charCountMap.entrySet()){
////             if(entry.getValue()==1){
////                 sb.append(entry.getKey());
////             }
////         }
////  return  sb.toString();
//
//
//
//
//
//
//    }
}
