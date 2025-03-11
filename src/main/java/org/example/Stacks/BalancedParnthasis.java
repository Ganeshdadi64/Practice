package org.example.Stacks;

import java.util.Stack;

public class BalancedParnthasis {
    public static boolean isBalanced(String A) {
        Stack<Character> stack = new Stack<>();

        for (char ch : A.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        String A1 = "{[()]}";
        String A2 = "{[(])}";
        String A3 = "{{[[(())]]}}";

        System.out.println(isBalanced(A1)); // true
        System.out.println(isBalanced(A2)); // false
        System.out.println(isBalanced(A3)); // true
    }
}
