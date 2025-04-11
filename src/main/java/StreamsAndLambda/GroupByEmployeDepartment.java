package StreamsAndLambda;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByEmployeDepartment {

    class Employee {
        String name;
        String department;
        int salary;
        int age;

        public Employee(String name, String department, int salary, int age) {
            this.name = name;
            this.department = department;
            this.salary = salary;
            this.age = age;
        }

        public Employee() {

        }

        // Getters omitted for brevity
    }


    public void main(String[] args) {
        Employee employees=new Employee();
//        Map<String, List<Employee>> byDept = employees.stream()
//                .collect(Collectors.groupingBy(e -> e.department));

    }
}
