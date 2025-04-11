package StreamsAndLambda;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};

        int[] merged = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2))
                .toArray();

        System.out.println(Arrays.toString(merged)); // [1, 2, 3, 4, 5, 6]

    }
}
