package StreamsAndLambda;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Merging1 {
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("a", 1, "b", 2);
        Map<String, Integer> map2 = Map.of("b", 3, "c", 4);

        Map<String, Integer> merged = Stream.concat(map1.entrySet().stream(), map2.entrySet().stream())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        Integer::sum // handle duplicate keys
                ));

        System.out.println(merged); // {a=1, b=5, c=4}

    }
}
