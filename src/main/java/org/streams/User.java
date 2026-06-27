package org.streams;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String name;
    private String email;
    private int age;
    private String address;
    private boolean activeStatus;
}
