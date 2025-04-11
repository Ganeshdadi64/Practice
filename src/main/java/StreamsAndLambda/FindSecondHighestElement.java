package StreamsAndLambda;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindSecondHighestElement {

    //1. Find the Second-Highest Number in a List

    List<Integer> numbers = Arrays.asList(10, 20, 5, 30, 40, 40, 25);
    int secondHighest = numbers.stream()
            .distinct() // Remove duplicates
            .sorted(Comparator.reverseOrder()) // Sort in descending order
            .skip(1) // Skip the highest number
            .findFirst() // Get the next highest number
            .orElseThrow(() -> new NoSuchElementException("List must have at least two distinct numbers"));

//System.out.println(secondHighest);



    //2. Find the Most Frequent Element in a List

    List<Integer> numbers2 = Arrays.asList(4, 2, 2, 8, 4, 4, 8, 8, 8);

    int mostFrequent = numbers.stream()
            .collect(Collectors.groupingBy(n -> n, Collectors.counting())) // Count occurrences
            .entrySet().stream()
            .max(Map.Entry.comparingByValue()) // Find max frequency
            .map(Map.Entry::getKey)
            .orElseThrow();

//System.out.println(mostFrequent);


    //3)3. Find Employees with the Highest Salary in Each Department

    class Employee {
        String name;
        String department;
        double salary;
        Employee(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }
    }

    List<Employee> employees = Arrays.asList(
            new Employee("Alice", "IT", 60000),
            new Employee("Bob", "IT", 75000),
            new Employee("Charlie", "HR", 50000),
            new Employee("David", "HR", 55000),
            new Employee("Eve", "IT", 80000)
    );





//    Map<String, Employee> highestPaidInDept = employees.stream()
//            .collect(Collectors.toMap(
//                    Employee::department,
//                    Function.identity(),
//                    (e1, e2) -> e1.salary > e2.salary ? e1 : e2
//            ));

//highestPaidInDept.forEach((dept, emp) ->
//            System.out.println(dept + " -> " + emp.name));
//




}
