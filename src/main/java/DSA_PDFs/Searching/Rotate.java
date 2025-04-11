package DSA_PDFs.Searching;

public class Rotate {

//    ✅ Problem:
//    You’re given a sorted array rotated some number of times (right to left). Find the index of a target element.
//
//            Example:
//    Sorted array: [1, 2, 3, 4, 5, 6, 7]
//    Rotated: [4, 5, 6, 7, 1, 2, 3] ← rotated left 3 times
//    Target: 2 → Output: 5
//

//    🔍 Key Idea (Binary Search Logic):
//    Even though the array is rotated, one half is always sorted.
//
//    Check arr[mid] == target → return mid
//
//    Determine if left half is sorted (arr[low] <= arr[mid])
//
//    If target is in that half → shrink right
//
//    Else → shrink left
//
//    Otherwise, right half is sorted
//
//    If target is in that half → shrink left
//
//    Else → shrink right





    public static int search(int[] arr, int target) {
        int low = 0, high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) return mid;

            // Left half is sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= target && target < arr[mid]) {
                    high = mid - 1; // Target in left half
                } else {
                    low = mid + 1;  // Target in right half
                }
            }
            // Right half is sorted
            else {
                if (arr[mid] < target && target <= arr[high]) {
                    low = mid + 1; // Target in right half
                } else {
                    high = mid - 1; // Target in left half
                }
            }
        }

        return -1; // Not found
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2, 3};
        int target = 2;
        int index = search(arr, target);
        System.out.println("Index of " + target + " is: " + index);
    }
}
