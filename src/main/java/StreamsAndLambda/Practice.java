package StreamsAndLambda;

import java.util.Arrays;
import java.util.OptionalInt;

public class Practice {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        OptionalInt maxval = Arrays.stream(nums).max();

        if (maxval.isPresent()) {
            System.out.println("Maximum value: " + maxval.getAsInt());
        } else {
            System.out.println("Array is empty");
        }
    }
}
