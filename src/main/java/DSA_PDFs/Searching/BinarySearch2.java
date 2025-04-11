package DSA_PDFs.Searching;

public class BinarySearch2 {
    public static int findLastOccurrence(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                result = mid;        // Found target, but continue searching to the right
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 4, 5, 6};
        int target = 4;
        int index = findLastOccurrence(arr, target);
        System.out.println("Last occurrence of " + target + " is at index: " + index);
    }
}
