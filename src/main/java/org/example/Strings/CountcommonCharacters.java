package org.example.Strings;

import javax.swing.*;
import java.util.HashMap;

public class CountcommonCharacters {
    public static void main(String[] args) {
        String s1="bcbcabb";
        String s2="caebaadc";
        HashMap<Character,Integer> h1=new HashMap<>();
        HashMap<Character, Integer> h2=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            if(h1.containsKey(ch)){
                h1.put(ch,h1.get(ch)+1);
            }
            else{
                h1.put(ch,1);
            }
        }
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            if(h2.containsKey(ch)){
                h2.put(ch,h2.get(ch)+1);
            }
            else {
                h2.put(ch, 1);
            }
        }
        
        
        int count=0;
        for(int i=0;i<s1.length();i++){
            Character ch= s1.charAt(i);
            if(h1.containsKey(ch) && h2.containsKey(ch)){
                if(h1.containsKey(ch)== h1.containsKey(ch)){
                   if(h1.get(ch)<=h2.get(ch)){
                      count=count+h1.get(ch);
                      h1.remove(ch);
                   }
                   else {
                       count=count+h2.get(ch);
                       h2.remove(ch);
                   }
                }

            }
        }
        System.out.println(count);
        
    }
}
