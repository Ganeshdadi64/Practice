package StreamsAndLambda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertTloUppercase {
    List<String> names = Arrays.asList("java", "stream", "api");
    List<String> upperCaseNames = names.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toList());
//System.out.println(upperCaseNames); // Output: [JAVA, STREAM, API]




    //2)  Sum OF Elements
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    int sum = numbers.stream()
            .mapToInt(Integer::intValue)
            .sum();
//System.out.println(sum); // Output: 15


    //3) Remove Duplicates for array

    List<Integer> numbers1 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
    List<Integer> uniqueNumbers = numbers.stream()
            .distinct()
            .collect(Collectors.toList());
//System.out.println(uniqueNumbers); // Output: [1, 2, 3, 4, 5]




    //4) Sorting the given array

    List<String> names1 = Arrays.asList("Ganesh", "Ram", "Amit", "Suresh");
    List<String> sortedNames = names.stream()
            .sorted()
            .collect(Collectors.toList());
//System.out.println(sortedNames); // Output: [Amit, Ganesh, Ram, Suresh]


    //5) Find max and min values

    List<Integer> numbers2 = Arrays.asList(5, 9, 2, 8, 1);

    int max = numbers.stream().max(Integer::compareTo).orElseThrow();
    int min = numbers.stream().min(Integer::compareTo).orElseThrow();

//System.out.println("Max: " + max); // Output: Max: 9
//System.out.println("Min: " + min); // Output: Min: 1


    //6) using groupBuy()

    class Person {
        String name;
        int age;
        Person(String name, int age) { this.name = name; this.age = age; }
    }

    List<Person> people = Arrays.asList(new Person("Alice", 30), new Person("Bob", 25), new Person("Charlie", 30));

    Map<Integer, List<Person>> groupedByAge = people.stream()
            .collect(Collectors.groupingBy(p -> p.age));

//System.out.println(groupedByAge);





}
