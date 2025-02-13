package org.example.Strings;

public class BOBOccurences {
    public static void main(String[] args) {
        String A = "abobcdbobbob"; // Input string
        int n = countBobOccurrences(A);
        System.out.println("Number of occurrences of 'bob': " + n);
        System.out.println(Thread.currentThread().getName());
    }

    public static int countBobOccurrences(String A) {
        int count = 0; // Counter for "bob"
        int n = A.length();

        // Loop through the string checking for "bob" substrings
        for (int i = 0; i <= n - 3; i++) {
            // Extract the substring of length 3
            if (A.substring(i, i + 3).equals("bob")) {
                count++;
            }
        }
        return count;
    }

}
