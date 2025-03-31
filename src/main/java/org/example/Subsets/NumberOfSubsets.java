package org.example.Subsets;

public class NumberOfSubsets {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};  // Example array

        int n = arr.length;

        int numberOfSubsets = (int) Math.pow(2, n);

        System.out.println("Number of subsets: " + numberOfSubsets);
        
    }
}
