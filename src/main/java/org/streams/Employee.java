package org.streams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {


    private String name;
    private String dept;
    private double salary;
    private String empId;
    private Date dateOfJoining;

}
