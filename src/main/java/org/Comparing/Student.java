package org.Comparing;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student implements Comparable<Student> {

    private String name;
    private int id;
    private LocalDateTime dateOfAdmission;


    @Override
    public int compareTo(Student o) {
       return this.dateOfAdmission.compareTo(o.dateOfAdmission);
    }
}
