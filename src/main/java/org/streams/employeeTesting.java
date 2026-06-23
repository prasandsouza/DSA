package org.streams;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class employeeTesting {

    public static void main(String[] args) {

        List<Employee> employeeList = Arrays.asList(
                new Employee("John Doe", "IT", 76000, "E001", LocalDateTime.of(2024,12,12,8,45,45)),
                new Employee("Jane Smith", "HR", 65000, "E002", LocalDateTime.of(2023,10,12,8,45,45)),
                new Employee("Jane willy", "HR", 65000, "E003", LocalDateTime.of(2023,10,8,8,45,45)),
                new Employee("Smith walker", "HR", 65000, "E004", LocalDateTime.of(2023,10,7,8,45,45)),
                new Employee("Alice Johnson", "Finance", 80000, "E005", LocalDateTime.of(2021,12,10,8,45,45)),
                new Employee("Bob Brown", "IT", 79000, "E006",LocalDateTime.of(2020,10,12,8,45,45))
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

        //salary for each dept
        Map<String,Double> salaryPerDept =  employeeList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.summingDouble(Employee::getSalary)));

        salaryPerDept.forEach((emplkey, emplvale)->{
            System.out.println("employee dept:"+emplkey +"spending salary"+emplvale);
        });


        //how many people are there in each department
        Map<String,Long>  personPerDept =   employeeList.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));

        personPerDept.forEach((key,value)-> System.out.println("Dept ::"+key+" "+value));

        //average salary across all
        Double averageSalary = employeeList.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);

        System.out.println(averageSalary);
        //average salary per department

        Map<String,Double> averageSalaryPerDept = employeeList.stream().collect(
                Collectors.groupingBy(Employee::getDept,Collectors.averagingDouble(Employee::getSalary))
        );

        averageSalaryPerDept.forEach((key,value)-> System.out.println("Dept ::"+ key +" "+value));

        Double avgSal = employeeList.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);

        System.out.println(avgSal);


        List<String> items = Arrays.asList("pen","pencil","pen","rubber","pen","pencil","keyBoard");

        Map.Entry<String,Long> listedItems = items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).orElse(null);

        System.out.println("listed items are "+ listedItems);

    } 


}
