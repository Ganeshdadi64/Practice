package StreamsAndLambda;

import java.util.Map;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("x", 5, "y", 15, "z", 20);

        Map<String, Integer> filtered = map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 10)
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                ));

        System.out.println(filtered); // {y=15, z=20}

    }
}
