package org.example.StringsAndArrays.Arraays;

import java.util.HashMap;

public class FindSymmetricPairs {

//    What is a Symmetric Pair?
//    A symmetric pair in a given set of pairs (a, b) exists if and only if there is another pair (b, a).
//    For example, in the set [(1, 2), (3, 4), (2, 1), (5, 6), (6, 5)], the symmetric pairs are:
//            👉 (1,2) & (2,1)
//            👉 (5,6) & (6,5)

    public static void main(String[] args) {
        int[][] pairs = { {1, 2}, {3, 4}, {2, 1}, {5, 6}, {6, 5}, {7, 8} };

        findSymmetricPairs(pairs);

    }

    public static void findSymmetricPairs(int[][] pairs) {
        HashMap<Integer, Integer> map = new HashMap<>();

        System.out.println("Symmetric Pairs:");
        for (int[] pair : pairs) {
            int a = pair[0], b = pair[1];

            // Check if the reverse pair (b, a) exists in the map
            if (map.containsKey(b) && map.get(b) == a) {
                System.out.println("(" + a + ", " + b + ")");
            } else {
                map.put(a, b); // Store (a, b) in the map
            }
        }
    }



}
