package org.callBy;

public class Main {

    static void change(int x, Employee emp) {
        x = 100;                    // Changes local copy only
        emp.name = "Prasan";        // Modifies original object

        emp = new Employee("John"); // Reassigns local reference only
    }

    static void exceptionCheck(){
        try{
            throw new RuntimeException("Invalid");
        }
        catch (Exception e){
            throw e;
        }

    }

    public static void main(String[] args) {

        int num = 10;
        Employee e = new Employee("David");

        change(num, e);

        System.out.println(num);     // 10
        System.out.println(e.name);  // Prasan

        Employee emp = new Employee();

        emp.setName("sample");
    }


}
