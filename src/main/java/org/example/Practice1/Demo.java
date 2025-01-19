package org.example.Practice1;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Demo {
    public static void main(String[] args) {
        String str="Test Automation Java Automation";

    }

    static void CharacterCount(String inputString) {
        // Use TreeMap to maintain sorted order of keys
        TreeMap<String, Integer> charCountMap = new TreeMap<>();

        // Split the string into words and count frequencies
        for (String s : inputString.split(" ")) {
            if (charCountMap.containsKey(s)) {
                charCountMap.put(s, charCountMap.get(s) + 1);
            } else {
                charCountMap.put(s, 1);
            }
        }

        System.out.println(charCountMap.size());
    }
}
