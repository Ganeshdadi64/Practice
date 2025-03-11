package org.example.Stacks;

import java.util.Stack;

public class RemoveRedundentBraces {

    public static String removeRedundantBraces(String expression) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder(expression);
        Stack<Integer> indexStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);

            if (ch == '(') {
                stack.push(ch);
                indexStack.push(i);
            } else if (ch == ')') {
                boolean hasOperator = false;
                int startIndex = indexStack.pop(); // Matching '(' index

                // Check if the content inside the brackets has an operator
                for (int j = startIndex + 1; j < i; j++) {
                    if (expression.charAt(j) == '+' || expression.charAt(j) == '-' ||
                            expression.charAt(j) == '*' || expression.charAt(j) == '/') {
                        hasOperator = true;
                        break;
                    }
                }

                // If no operator inside, mark the braces as removable
                if (!hasOperator) {
                    result.setCharAt(startIndex, ' '); // Replace '(' with space
                    result.setCharAt(i, ' ');          // Replace ')' with space
                }
            }
        }

        // Remove spaces and return the cleaned expression
        return result.toString().replaceAll(" ", "");
    }

    public static void main(String[] args) {
        String expression = "((a+b)) + (c*(d+e))";
        String result = removeRedundantBraces(expression);
        System.out.println("Original: " + expression);
        System.out.println("After removing redundant braces: " + result);
    }
}
