package org.example.StringsAndArrays.Arraays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.OptionalInt;

public class FindSecondSmallestinArray {



    public static void main(String[] args) {
        int[] arr = {12, 13, 1, 10, 34, 1};

        if (arr.length < 2) {
            System.out.println("Array doesn't have enough elements.");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }

        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element.");
        } else {
            System.out.println("Second smallest element is: " + secondSmallest);
        }
    }

//    Now, let's go through the logic of Method 2 where we keep track of the smallest and second smallest elements as we iterate through the array.
//
//    Initial Array:
//    arr = {12, 13, 1, 10, 34, 1}
//    We initialize two variables:
//    smallest = Integer.MAX_VALUE and secondSmallest = Integer.MAX_VALUE.
//
//            Iteration 1 (num = 12):
//
//    Since 12 < smallest (Integer.MAX_VALUE), we update smallest = 12.
//    The secondSmallest remains Integer.MAX_VALUE.
//            Iteration 2 (num = 13):
//
//    Since 13 > smallest (12) and 13 < secondSmallest (Integer.MAX_VALUE), we update secondSmallest = 13.
//    Iteration 3 (num = 1):
//
//    Since 1 < smallest (12), we update secondSmallest = smallest (12) and smallest = 1.
//    Iteration 4 (num = 10):
//
//    Since 10 > smallest (1) and 10 < secondSmallest (12), we update secondSmallest = 10.
//    Iteration 5 (num = 34):
//
//    Since 34 > smallest (1) and 34 > secondSmallest (10), there is no update.
//    Iteration 6 (num = 1):
//
//    Since 1 == smallest (1), no update is made to smallest or secondSmallest.
//    At the end of the loop, secondSmallest = 10.
//
//
//
//
//



  //using java8 features

    public static void main1(String[] args) {
        int[] arr = {12, 13, 1, 10, 34, 1};

        // Use Stream to find the second smallest element
        OptionalInt secondSmallest = Arrays.stream(arr)
                .distinct()                   // Remove duplicates
                .sorted()                     // Sort the array in ascending order
                .skip(1)                      // Skip the first (smallest) element
                .findFirst();                 // Find the first element in the remaining stream

        // Check if second smallest exists
        if (secondSmallest.isPresent()) {
            System.out.println("Second smallest element is: " + secondSmallest.getAsInt());
        } else {
            System.out.println("There is no second smallest element.");
        }
    }



//Find second largest number in array

    public static void main2(String[] args) {
        int[] arr = {12, 13, 1, 10, 34, 1};

        // Use Stream to find the second largest element
        Optional<Integer> secondLargest = Arrays.stream(arr)
                .distinct()                   // Remove duplicates
                .boxed()                      // Convert int to Integer (necessary for finding second largest)
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .skip(1)                      // Skip the largest element
                .findFirst();                 // Get the first element, which is the second largest

        // Check if second largest exists
        if (secondLargest.isPresent()) {
            System.out.println("Second largest element is: " + secondLargest.get());
        } else {
            System.out.println("There is no second largest element.");
        }
    }







}
