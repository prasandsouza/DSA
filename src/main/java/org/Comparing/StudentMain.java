package org.Comparing;

import java.time.LocalDateTime;

public class StudentMain {

    public static void main(String[] args) {

        Student s1 = new Student("John", 20, LocalDateTime.of(2020, 1, 1, 10, 0));
        Student s2 = new Student("John", 20, LocalDateTime.of(2020, 1, 1, 10, 0));
        Student s3 = new Student("Jane", 22, LocalDateTime.of(2021, 5, 15, 14, 30));

        System.out.println("s1 equals s2: " + s1.equals(s2)); // true
        System.out.println("s1 equals s3: " + s1.equals(s3)); // false

        System.out.println("s1 hashCode: " + s1.hashCode());
        System.out.println("s2 hashCode: " + s2.hashCode());
        System.out.println("s3 hashCode: " + s3.hashCode());
    }
}
