package StreamsAndLambda;

import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequency {
    public static void main(String[] args) {
        String str = "banana";

        Map<Character, Long> freqMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        c -> c,
                        Collectors.counting()
                ));

        System.out.println(freqMap); // {a=3, b=1, n=2}

    }
}
