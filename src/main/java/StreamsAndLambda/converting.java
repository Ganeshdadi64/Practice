package StreamsAndLambda;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class converting {
    public static void main(String[] args) {
        List<String> list = List.of("apple", "banana", "apple", "orange");

        Map<String, Long> frequencyMap = list.stream()
                .collect(Collectors.groupingBy(
                        s -> s,
                        Collectors.counting()
                ));

        System.out.println(frequencyMap); // {banana=1, orange=1, apple=2}

    }
}
