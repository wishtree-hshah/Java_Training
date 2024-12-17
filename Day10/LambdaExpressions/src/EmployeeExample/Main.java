package EmployeeExample;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("abc", 25, 50000),
                new Employee("xyz", 35, 80000),
                new Employee("pqr", 28, 60000),
                new Employee("mno", 40, 90000),
                new Employee("hij", 33, 75000)
        );

        List<Employee> nameOfEmployees = employees.stream()
                .filter(e -> e.getAge() > 30)
                .toList();

        nameOfEmployees.forEach(e -> System.out.println(e.getName()));
    }
}
