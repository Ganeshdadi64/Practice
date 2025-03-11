package org.example.StringsAndArrays;

import java.util.Arrays;

public class SeparateLettersandNumbers {
    //given a string combination of both letters and numbers return both separately

    public static void main(String[] args) {
        String input = "a1b2c3d4";
        String[] result = separateLettersAndNumbers(input);

        System.out.println(Arrays.toString(result));

    }

    public static String[] separateLettersAndNumbers(String input) {
        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters.append(ch);
            } else if (Character.isDigit(ch)) {
                numbers.append(ch);
            }
        }

        return new String[]{letters.toString(), numbers.toString()};
    }
}
