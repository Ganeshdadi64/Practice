package DSA_PDFs.Searching;

public class Findunique {
//    🔍 Key Insight:
//    In the sorted array, pairs start at even indices:
//
//    Before the unique element: pairs like [a, a], [b, b]
//
//    After the unique element: pairing is offset by 1 → [c, c], [d, d] becomes [c, c], [d, d] but indices are shifted
//
//    So, if mid is even and arr[mid] == arr[mid + 1], unique is to the right
//
//    If mid is odd and arr[mid] == arr[mid - 1], unique is to the right
//
//    Else, it's to the left
//

//    🧠 Key Idea:
//    In a perfect world with no unique element, elements appear in pairs, starting at even indices:
//

//    Index:  0  1  2  3  4  5  6
//    Array: [1, 1, 2, 2, 3, 3, 4]
//            ^     ^     ^
//           pair  pair  pair


    //✅ Example 1: Unique is to the Right
    int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 5};
//    Unique element is 3, at index 4.
//
//    Let's say: mid = 2 (even), arr[mid] = 2, arr[mid+1] = 2
//    So arr[mid] == arr[mid + 1] → pair is intact → unique is after this pair → go right.
//
//    Update: low = mid + 2 = 4
//
//    Now the search continues in the right half where the unique lies.



    //✅ Example 2: Unique is to the Left
    //int[] arr = {1, 1, 2, 3, 3, 4, 4};

//    Unique element is 2, at index 2.
//
//    Let’s say: mid = 2 (even), arr[mid] = 2, arr[mid + 1] = 3
//    arr[mid] != arr[mid + 1] → mismatch → unique is at or before mid → go left.
//
//    Update: high = mid = 2


    public static int findUnique(int[] arr) {
        int low = 0, high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Make sure mid is even
            if (mid % 2 == 1) {
                mid--;
            }

            // Check pair
            if (arr[mid] == arr[mid + 1]) {
                // Unique element is after this pair
                low = mid + 2;
            } else {
                // Unique is on the left including mid
                high = mid;
            }
        }

        return arr[low];
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 5};
        int unique = findUnique(arr);
        System.out.println("Unique element is: " + unique);
    }

}
