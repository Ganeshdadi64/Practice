package org.example.StringsAndArrays;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class a2b3c3d2 {
    public static void main(String[] args) {
        String str="aabbbccdd";
        HashMap<Character,Integer> hm= new LinkedHashMap<>();
        for(int i=0;i<str.length();i++){

            char ch=str.charAt(i);
            if(hm.containsKey(ch)){
                int val=hm.get(ch);
                hm.put(ch,val+1);
            }else {
                hm.put(ch,1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            sb.append(entry.getKey()).append(entry.getValue());
        }

        System.out.println(sb);
    }
}
