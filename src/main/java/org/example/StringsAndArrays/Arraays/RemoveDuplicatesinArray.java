package org.example.StringsAndArrays.Arraays;

import java.util.Arrays;
//1)remove duplicates from sorted array
//2) for unsorted array we will use set
//3)find the repeated elements
//4)find the non-repeated elements



public class RemoveDuplicatesinArray {

    public class RemoveDuplicatesWithRepeated {
        public static void main(String[] args) {
            int[] arr = {1, 1, 2, 2, 3, 4, 4, 5}; // Example sorted array
            int n = arr.length;
            int[] repeated = new int[n]; // Array to store repeated values (extra space)
            int repIndex = 0; // Separate index for repeated elements

            int index = 1; // Pointer for unique elements

            for (int i = 1; i < arr.length; i++) {
                if (arr[i] != arr[i - 1]) { // If new unique element found
                    arr[index] = arr[i]; // Store it at 'index'
                    index++; // Move index forward
                } else {
                    repeated[repIndex] = arr[i]; // Store repeated element
                    repIndex++; // Move repeated index forward
                }
            }

            // Print results
            System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arr, index)));
            System.out.println("Repeated elements: " + Arrays.toString(Arrays.copyOf(repeated, repIndex)));
        }
    }
}
