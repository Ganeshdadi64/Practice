package org.example.StringsAndArrays;

import java.util.HashMap;

public class PermitationOrNot {


    static int ans=0;
    public static void main(String[] args) {

        String s1="abacb";
        String s2="acacabbeace";
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
        int match=0;
        for(int i=0;i<s1.length();i++){
            char ch=s2.charAt(i);
            if(h1.containsKey(ch) && h2.get(ch)<=h1.get(ch)){
                //ekkada h2 chars frequency always < undali h1 frequency is already fixed  h2 anedhi
                //h1 kanna thakkuvaga untene valid avuthundi
                match++;
                h2.put(ch,h2.get(ch)+1);
            }
        }
        if(match== s1.length()){
            ans++;

        }
        int s=1; int e=s1.length();

        while(e<s1.length()){
            char rem= s2.charAt(s-1);
            int f=h2.get(rem);
            h2.put(rem,f-1);
             if(h1.containsKey(rem) && h2.get(rem)<=h1.get(rem)){
                 match--;
             }
             char add=s2.charAt(e);
             int g=h2.get(add);
             h2.put(add,g+1);
             if(h1.containsKey(add) && h2.get(add)<=h1.get(add)){
                 match++;
             }
             if(match==s1.length()){
                 ans++;
                 s++;
                 e++;
             }

        }

    }

}
