package org.example.Subsets;

public class FindTarget {

    public static boolean isSubsetSum(int[] arr, int n, int target) {
        // Base Cases
        if (target == 0) {
            return true;
        }
        if (n == 0) {
            return false;
        }

        // Exclude the current element
        //if we remove the one element still there is a possibility for make sum equals to target from remaining elements
        boolean exclude = isSubsetSum(arr, n - 1, target);

        // Include the current element (only if it doesn't exceed the target)
        boolean include = (target >= arr[n - 1]) && isSubsetSum(arr, n - 1, target - arr[n - 1]);

        // Return true if either include or exclude is true
        return exclude || include;
//
//        Target = 9
//    ├─ Exclude 2: Subset {3, 34, 4, 12, 5} with target 9
//    └─ Include 2: Subset {3, 34, 4, 12, 5} with target 7
//        ├─ Exclude 5: Subset {3, 34, 4, 12} with target 7
//        └─ Include 5: Subset {3, 34, 4, 12} with target 2




    }

    public static void main(String[] args) {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int target = 9;

        if (isSubsetSum(arr, arr.length, target)) {
            System.out.println("Subset with the given target exists.");
        } else {
            System.out.println("No subset with the given target exists.");
        }
    }
}
