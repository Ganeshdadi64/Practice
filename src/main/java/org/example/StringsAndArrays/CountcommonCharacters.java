package org.example.StringsAndArrays;

import java.util.HashMap;

public class CountcommonCharacters {
    public static void main(String[] args) {
        String s1 = "bcbcabb";
        String s2 = "caebaadc";
        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            if (h1.containsKey(ch)) {
                h1.put(ch, h1.get(ch) + 1);
            } else {
                h1.put(ch, 1);
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (h2.containsKey(ch)) {
                h2.put(ch, h2.get(ch) + 1);
            } else {
                h2.put(ch, 1);
            }
        }


        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            Character ch = s1.charAt(i);
            if (h1.containsKey(ch) && h2.containsKey(ch)) {
                if (h1.containsKey(ch) == h1.containsKey(ch)) {
                    if (h1.get(ch) <= h2.get(ch)) {
                        count = count + h1.get(ch);    //min ekkada aupdate chesamu h1.get() min kakapothe else lo h2.ch nee add chestundi
                        h1.remove(ch);
                    } else {
                        count = count + h2.get(ch);
                        h2.remove(ch);
                    }
                }

            }
        }
        System.out.println(count);


//        Dry Run per Iteration
//        Index (i)	Character (ch)	h1[ch]	h2[ch]	min(h1[ch], h2[ch])	Count After Addition	Action Taken
//        0	         b	               4	   1	   1	              1	Added 1 to count, removed b from h1
//        1	         c	               2	   2	   2	              3	Added 2 to count, removed c from h1
//        2	         b	               -	   -	   -	              3	Skipped, b removed from h1
//        3	         c	               -	   -	   -	              3	Skipped, c removed from h1
//        4	         a              	1	   3	   1	              4	Added 1 to count, removed a from h1
//        5	         b               	-	   -	   -	              4	Skipped, b removed from h1
//        6	         b	                -	   -	   -	              4	Skipped, b removed from h1


    }}
