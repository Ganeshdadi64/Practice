package StreamsAndLambda;

import java.util.LinkedHashMap;
import java.util.Map;

//q) find first non repeating character
public class FindNonRepeatingChar {
    public static void main(String[] args) {
        String str = "America";
        Map<Character, Integer> mp = new LinkedHashMap<>(); // Maintains order

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        // Find the first non-repeating character
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeating character: " + entry.getKey());
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}
