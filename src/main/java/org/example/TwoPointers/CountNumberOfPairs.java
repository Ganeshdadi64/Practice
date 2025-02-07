package org.example.TwoPointers;

//Problem Statement:
//Given a sorted integer array A of size N and an integer B, find the number of unique pairs (A[i], A[j]) such that:
//
//A[i] + A[j] = B
//i < j (i.e., A[i] comes before A[j] in the array)
//Since the answer can be large, return it modulo 10⁹ + 7 (1000000007).
//

//Pairs that sum to 3:
//(1, 2) → Found at index (0,2)
//(1, 2) → Found at index (0,3)
//(1, 2) → Found at index (1,2)
//(1, 2) → Found at index (1,3)

//ans=4



public class CountNumberOfPairs {

    public int countPairs(int[] A, int B) {
        final int MOD = 1000000007;
        int i = 0, j = A.length - 1;
        long count = 0;

        while (i < j) {
            int sum = A[i] + A[j];

            if (sum < B) {
                i++; // Increase sum by moving left pointer
            } else if (sum > B) {
                j--; // Decrease sum by moving right pointer
            } else { // sum == B
                // Count frequencies of A[i] and A[j]
                int leftCount = 1, rightCount = 1;//ee values number of occurrences of matching value

                while (i + 1 < j && A[i] == A[i + 1]) {

                    leftCount++;
                    i++;
                }
                while (j - 1 > i && A[j] == A[j - 1]) {
                    rightCount++;
                    j--;
                }

                // Add pairs
                count += (long) leftCount * rightCount;
                count %= MOD;

                // Move pointers
                i++;
                j--;
            }
        }

        return (int) count;
    }


}
