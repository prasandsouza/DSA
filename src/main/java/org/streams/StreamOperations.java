package org.streams;


import java.util.*;
import java.util.stream.Stream;

public class StreamOperations {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Johns", "Jane", "Jack", "Jill","Jacob","James");

        // 1. Given a list of names, transform every name to uppercase.
        List<String> upperCaseNames = names.stream().map(String::toUpperCase).toList();
        System.out.println("Uppercase Names: " + upperCaseNames);


        //2. Filter out names that contain less than 4 characters
        List<String> filteredNames = names.stream().filter(name->name.length()>4).toList();
        System.out.println("Filtered Names: " + filteredNames);

        //3. Given a list of integers, extract only the even ones

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenList = numbers.stream().filter(number->number%2==0).toList();
        System.out.println("Even Numbers: " + evenList);

        //4. Map a list of integers to their corresponding square values.
        List<Integer> squareList = numbers.stream().map(number->number*number).toList();
        System.out.println("Square Values: " + squareList);

        //5. Remove all null elements from a list of objects safely.
        List<Object> listWithNulls = Arrays.asList("A", null, "B", null, "C",3,34L,5.50,'q');
        List<Object> listWithoutNulls = listWithNulls.stream().filter(Objects::nonNull).toList();
        System.out.println("List without Nulls: " + listWithoutNulls);

        //6. Convert a list of strings into a list representing their integer lengths.
        List<String> values = List.of("Apple","Banana","Carrot","Dragon Fruit","Egg Fruit");
        List<Integer> lengths = values.stream().map(v->v.length()).toList();
        System.out.println("Lengths of Strings: " + lengths);

        //7. Find all domain strings that start with the string "https".
        List<String> domains = List.of("https://www.google.com", "http://www.facebook.com", "https://www.twitter.com", "http://www.instagram.com");
        List<String> DomainWithHttps = domains.stream().filter(domain->domain.startsWith("https")).toList();
        System.out.println("Domains starting with https: " + DomainWithHttps);

        //8.Given a list of User objects, extract a list of their string email addresses.
        List<User> users = Arrays.asList(
                new User("John Doe", "john.doe@example.com",32,"san joe"),
                new User("Jane Smith", "jane.smith@example.com",45,"Alaska"),
                new User("Bob Johnson", "bob.johnson@example.com",50,"Texas"),
                new User("Alice Williams", "alice.williams@sample.com",34,"")
        );

        List<String> emails = users.stream().map(emp->emp.getEmail()).toList();
        System.out.println("Emails: " + emails);

        //9.Filter a list of tasks to include only those where `isCompleted()` is true
        //10.Filter an integer list to retain only positive numbers (>= 0)
        List<Integer> numbersList = List.of(-5, -2, 0, 3, 7, -1, 9);
        List<Integer> positiveNumber = numbersList.stream().filter(num->num>=0).toList();
        System.out.println("Positive Numbers: " + positiveNumber);

        // 11. Count how many products have a price greater than 100.
        Map<String , Integer> productPrices = Map.of("Product A", 150, "Product B", 80, "Product C", 200,"Product D",30);
        long count = productPrices.entrySet().stream().filter(entry->entry.getValue()>100).count();
        System.out.println("Count of products with price greater than 100: " + count);



        // 12. Find the first employee who works in the "IT" department.

        List<Employee> employees = Arrays.asList(
                new Employee("John Doe", "IT", 76000, "E001"),
                new Employee("Jane Smith", "HR", 63000, "E002"),
                new Employee("Alice Johnson", "Finance", 80000, "E003"),
                new Employee("Bob Brown", "IT", 79000, "E004")
        );
        String empName = String.valueOf(employees.stream().filter(emp-> emp.getDept().equals("IT")).findFirst().orElse(null));
        System.out.println("First employee in IT department: " + empName);


        // 13. Verify if any transaction in a list exceeds a value of $10,000.
        List<Double> transactions = Arrays.asList(5000.0, 12000.0, 8000.0, 15000.0, 3000.0);
        boolean exceedsLimit = transactions.stream().anyMatch(trans -> trans >10000);
        System.out.println("Any transaction exceeds $10,000: " + exceedsLimit);

        // 14. Verify if every single user account in a list is currently active.


        // 15. Confirm that no user in the list has an empty username string
        // 16. Collect all unique city names from an array containing duplicates.
        // 17. Sort a list of scores and pick only the top 3 highest scores
        // 18. Get items for page 3 assuming page size is 10 (skip 20 elements, take next 10)
        // 19. Sort a list of raw product categories alphabetically
        // 20. Sort a list of employees based on their salary ascending

    }
}
