package org.example.StringsAndArrays;

import java.util.Arrays;
import java.util.Comparator;

//giving u a set of words u just print based on the word length
public class PrintBasedOnWordLength {



    public static void main(String[] args) {
        String[] words={"ganesh","Gopi","basha","prakesh","raj"};
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length() , o2.length());
            }
        });
        for(String st:words){
            System.out.println(st);
        }
    }

}
