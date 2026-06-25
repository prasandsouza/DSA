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

    }
}
