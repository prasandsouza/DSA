package org.streams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Comparable<Employee> {


    private String name;
    private String dept;
    private double salary;
    private String empId;
    private LocalDateTime dateOfJoining;


    @Override
    public int compareTo(Employee o) {
        // Order by dateOfJoining in reverse (newest first).
        // Handle nulls: treat null as older (so it sorts after non-null dates).
        if (this.dateOfJoining == null && o == null) {
            return 0;
        }
        if (this.dateOfJoining == null) {
            return 1; // this is older -> after
        }
        if (o == null || o.dateOfJoining == null) {
            return -1; // other is older/null -> this comes before
        }
        // Reverse order: compare other to this
        return o.dateOfJoining.compareTo(this.dateOfJoining);
    }
}
