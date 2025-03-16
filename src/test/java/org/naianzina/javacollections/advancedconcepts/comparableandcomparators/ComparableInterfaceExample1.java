package org.naianzina.javacollections.advancedconcepts.comparableandcomparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterfaceExample1 {

    public static void main(String [] args) {

        List<Emp> empList = new ArrayList<>();

        empList.add(new Emp(1, "Alex", "N", 10_000));
        empList.add(new Emp(5, "Sasha", "K", 30_000));
        empList.add(new Emp(390, "Alexandra", "K", 50_000));
        empList.add(new Emp(4, "Alex", "P", 70_000));

        for(Emp emp: empList){
            System.out.println(emp.toString());
        }
        Collections.sort(empList);
        System.out.println("-------Sorted list by id-------");

        for(Emp emp: empList){
            System.out.println(emp.toString());
        }
    }

}

class Emp implements Comparable<Emp>{

    int id;
    String firstName;
    String lastName;
    int salary;

    public Emp(int id, String firstName, String lastName, int salary){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }
    @Override
    public String toString(){
        return "Employee id: " + id + "; name: " + firstName + "; lastName: " + lastName + "; salary: " + salary;
    }

    @Override
    public int compareTo(Emp anotherEmp){
        return id - anotherEmp.id;
    }


}
