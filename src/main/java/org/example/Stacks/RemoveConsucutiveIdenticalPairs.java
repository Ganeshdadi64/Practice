package org.example.Stacks;

import java.util.Stack;

public class RemoveConsucutiveIdenticalPairs {
    public static String removeAdjacentPairs(String A) {

        Stack<Character>stack=new Stack<>();
        for(char c: A.toCharArray()){
            if(!stack.isEmpty() && stack.peek()==c){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "abbacddce";
        String output = removeAdjacentPairs(input);
        System.out.println("Final transformed string: " + output); // Output: "e"
    }

}
