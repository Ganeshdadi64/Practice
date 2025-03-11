package org.example.Stacks;

import java.util.Stack;

public class InfinixProblem1 {

//    An arithmetic expression is given by a string array A of size N. Evaluate the value of an arithmetic expression in Reverse Polish Notation.
//    Valid operators are +, -, *, /. Each string may be an integer or an operator.
//        Note: Reverse Polish Notation is equivalent to Postfix Expression, where operators are written after their operands.
//    Problem Constraints
//    1 <= N <= 105
//
//    Input Format
//    The only argument given is string array A.
//
//    Output Format
//    Return the value of arithmetic expression formed using reverse Polish Notation.
//
//
//
//            Example Input
//
//    Input 1:
//    A =   ["2", "1", "+", "3", "*"]
//    Input 2:
//    A = ["4", "13", "5", "/", "+"]


//    Example Output
//
//    Output 1:
//            9
//    Output 2:
//            6




//    🔹 Input:
//    A = ["2", "1", "+", "3", "*"]
//
//            🔹 Step-by-step Execution:
//
//    Step	   Stack	          Operation
//    Read "2"	[2]	           Push 2
//    Read "1"	[2, 1]	       Push 1
//    Read "+"	[3]	           Pop 1 and 2, compute 2 + 1 = 3, push 3
//    Read "3"	[3, 3]	       Push 3
//    Read "*"	[9]	           Pop 3 and 3, compute 3 * 3 = 9, push 9
//    Final Result	9	        Answer: 9
//
//            🔹 Output:9



    public static int evalRPN(String[] A) {

        Stack<Integer> stack = new Stack<>();

        for (String token : A) {
            if (isOperator(token)) {
                int b = stack.pop(); // Second operand
                int a = stack.pop(); // First operand

                int result = applyOperator(a, b, token);
                stack.push(result);
            } else {
                stack.push(Integer.parseInt(token)); // Convert string to integer
            }
        }

        return stack.pop(); // Final result
    }

    private static boolean isOperator(String token) {
        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");

    }

    private static int applyOperator(int a, int b, String operator) {
        switch (operator) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b; // Integer division
            default: throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }


    public static void main(String[] args) {
        String[] A1 = {"2", "1", "+", "3", "*"};
        System.out.println("Result: " + evalRPN(A1)); // Output: 9

        String[] A2 = {"4", "13", "5", "/", "+"};
        System.out.println("Result: " + evalRPN(A2)); // Output: 6
    }



}
