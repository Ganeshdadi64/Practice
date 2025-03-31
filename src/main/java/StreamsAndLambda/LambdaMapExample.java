package StreamsAndLambda;

import java.util.HashMap;
import java.util.Map;

public class LambdaMapExample {
    public static void main(String[] args) {
        // Creating a map with string keys and values
        Map<String, String> myMap = new HashMap<>();
        myMap.put("A", "Apple");
        myMap.put("B", "Banana");
        myMap.put("C", "Cherry");

        // Using lambda function to iterate and print key-value pairs
        myMap.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}
