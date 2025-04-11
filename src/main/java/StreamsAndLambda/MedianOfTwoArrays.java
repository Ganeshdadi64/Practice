package StreamsAndLambda;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MedianOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {3, 5, 1};
        int[] arr2 = {4, 2, 6};

        double median = findMedianOfTwoArrays(arr1, arr2);
        System.out.println("Median: " + median);
    }

    public static double findMedianOfTwoArrays(int[] arr1, int[] arr2) {
        int[] mergedSorted = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .sorted()
                .toArray();

        int n = mergedSorted.length;

        if (n % 2 == 1) {
            return mergedSorted[n / 2];
        } else {
            return (mergedSorted[n / 2 - 1] + mergedSorted[n / 2]) / 2.0;
        }
    }
}
