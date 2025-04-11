package StreamsAndLambda;

import java.util.LinkedHashMap;
import java.util.Map;

public class SortingMapValues {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("a", 3, "b", 1, "c", 2);

        Map<String, Integer> sortedByValue = new LinkedHashMap<>();
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue()) // sort by value ascending
                .forEach(entry -> sortedByValue.put(entry.getKey(), entry.getValue()));

        System.out.println(sortedByValue);



        //print based on alphabetic oder

        Map<String, Integer> map1 = Map.of("a", 3, "b", 1, "c", 2);

        Map<String, Integer> sortedByKey = new LinkedHashMap<>();
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey()) // sort by key alphabetically
                .forEach(entry -> sortedByKey.put(entry.getKey(), entry.getValue()));

        System.out.println(sortedByKey);


    }
}
