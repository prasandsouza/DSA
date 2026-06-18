package org.streams;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class employeeTesting {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee("John Doe", "IT", 76000, "E001", LocalDateTime.of(2024,12,12,8,45,45)),
                new Employee("Jane Smith", "HR", 65000, "E002", LocalDateTime.of(2023,10,12,8,45,45)),
                new Employee("Alice Johnson", "Finance", 80000, "E003", LocalDateTime.of(2024,12,10,8,45,45)),
                new Employee("Bob Brown", "IT", 79000, "E004",LocalDateTime.of(2024,10,12,8,45,45))
        );


        //filter who is earning more than 75k
        List<Employee> higestEarner = employeeList.stream().filter(emp->emp.getSalary()>=75000).toList();

        higestEarner.forEach(lists->{
            System.out.println("Employee with highest salary"+lists);
        });

        //sort using date of joining

        List<Employee> sortedList = employeeList.stream().sorted(Comparator.comparing(Employee::getDateOfJoining)).toList();
        sortedList.forEach(System.out::println);
        //reverse sort using joining date

        List<Employee> reversedList = employeeList.stream().sorted(Comparator.comparing(Employee::getDateOfJoining).reversed()).toList();

        reversedList.forEach(System.out::println);



        //how many people are there in each department
        //average salary across all
        //average salary per department
    }


}
