package org.example.TwoPointers;


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
