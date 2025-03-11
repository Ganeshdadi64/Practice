package org.example.Stacks;

import java.util.Stack;

//There is a football event going on in your city. In this event, you are given A passes and players having ids between 1 and 106.
//
//
//Initially, some player with a given id had the ball in his possession. You have to make a program to display the id of the player who possessed the ball after exactly A passes.
//
//There are two kinds of passes:
//
//        1) ID
//
//2) 0
//
//For the first kind of pass, the player in possession of the ball passes the ball "forward" to the player with id = ID.
//
//For the second kind of pass, the player in possession of the ball passes the ball back to the player who had forwarded the ball to him.
//
//In the second kind of pass "0" just means Back Pass.
//
//Return the ID of the player who currently possesses the ball.



public class Problem1 {
    public static int findFinalPossession(int A, int B, int[] C) {
        Stack<Integer> stack = new Stack<>();
        stack.push(B);  // Initial player with the ball

        for (int pass : C) {
            if (pass == 0) {
                stack.pop();  // Back pass
            } else {
                stack.push(pass);  // Forward pass
            }
        }

        return stack.peek();  // The player who has the ball
    }

    public static void main(String[] args) {
        int A = 5;
        int B = 2;
        int[] C = {3, 0, 5, 0, 4};

        System.out.println(findFinalPossession(A, B, C));  // Output: 4
    }
}
