package org.example.Stacks;

import java.util.Stack;

public class InfinixProblem2 {

//    Given string A denoting an infix expression. Convert the infix expression into a postfix expression.
//    String A consists of ^, /, *, +, -, (, ) and lowercase English alphabets where lowercase English alphabets are operands and ^, /, *, +, - are operators.
//    Find and return the postfix expression of A.
//            NOTE:
//            ^ has the highest precedence.
//            / and * have equal precedence but greater than + and -.
//            + and - have equal precedence and lowest precedence among given operators.
//
//            Problem Constraints
//           1 <= length of the string <= 500000
//
//    Input Format
//    The only argument given is string A.
//
//            Output Format
//    Return a string denoting the postfix conversion of A.
//            Example Input
//    Input 1:
//
//    A = "x^y/(a*z)+b"
//    Input 2:
//    A = "a+b*(c^d-e)^(f+g*h)-i"
//
//    Example Output
//    Output 1:"xy^az*/b+"
//    Output 2:"abcd^e-fgh*+^*+i-"


//    Infix	       Postfix
//    a + b	         ab+
//   (a + b) * c	     ab+c*
//    a + b * c	     abc*+
//    a * (b + c) / d	 abc+*d/

    public static String infixToPostfix(String A) {
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for (char ch : A.toCharArray()) {
            if (Character.isLetter(ch)) { // Operand
                result.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop(); // Remove '('
            } else { // Operator
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                    if (ch == '^' && stack.peek() == '^') // Right-associative
                        break;
                    result.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        // Pop remaining operators
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        return result.toString();
    }

    private static int precedence(char op) {
        switch (op) {
            case '^': return 3;
            case '*': case '/': return 2;
            case '+': case '-': return 1;
            default: return 0;
        }
    }

    public static void main(String[] args) {
        String expr1 = "a+b*c";
        System.out.println("Postfix: " + infixToPostfix(expr1)); // Output: "abc*+"

        String expr2 = "(a+b)*c";
        System.out.println("Postfix: " + infixToPostfix(expr2)); // Output: "ab+c*"

        String expr3 = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println("Postfix: " + infixToPostfix(expr3)); // Output: "abcd^e-fgh*+^*+i-"
    }


}
