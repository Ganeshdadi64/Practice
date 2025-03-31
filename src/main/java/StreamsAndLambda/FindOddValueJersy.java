package StreamsAndLambda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//You are given a list of players, where each player is represented by their jersey number (Integer) and their name (String). This data is stored in a Map<Integer, String>.
//
//Your Task:
//Use Java Streams to process the player data.
//From the given map:
//Filter players whose jersey numbers are odd.
//Sort these players by their jersey numbers in descending order.
//Collect the names of these filtered and sorted players into a List<String>.
//
//



public class FindOddValueJersy {

    public static void main(String[] args) {
        // Step 1: Create the Map
        Map<Integer, String> players = new HashMap<>();
        players.put(10, "Messi");
        players.put(7, "Ronaldo");
        players.put(18, "Kohli");
        players.put(45, "Rohit");
        players.put(33, "Dhoni");

        //Step 2: Stream processing
        List<String> oddJerseyPlayersDesc = players.entrySet().stream()
                .filter(entry -> entry.getKey() % 2 != 0)// Odd jersey numbers output [7=Ronaldo, 45=Rohit, 33=Dhoni]

                .sorted(Map.Entry.<Integer, String>comparingByKey().reversed()) // Descending order
                .map(Map.Entry::getValue) // Get player names
                .collect(Collectors.toList());

        // Print result
        System.out.println("Players with odd jersey numbers (desc order): " + oddJerseyPlayersDesc);
    }
}


