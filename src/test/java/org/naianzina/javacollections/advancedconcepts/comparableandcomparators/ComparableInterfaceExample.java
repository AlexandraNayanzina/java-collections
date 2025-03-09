package org.naianzina.javacollections.advancedconcepts.comparableandcomparators;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

class Student implements Comparable<Student>{

    String name;
    int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;

    }

    @Override
    public int compareTo(Student student){
        return Integer.compare(this.age, student.age);
    }

    public String toString(){
        return name + " ("+age+")";
    }
}

public class ComparableInterfaceExample {

    public static void main(String [] args){
        /* Comparable and Comparator Interfaces provide a mechanism for comparing the objects
        - Comparable Interface indicates that its objects have a natural ordering
        - Comparable Interface contains only one method - compareTo()
        - compareTo() define how two objects of the same class are compared to each other
        - It returns an integer:
        -- negative - if current object is less than the specified object
        -- zero - if they are equal
        -- positive - if the current object is grater than specified object
        *
        * */


        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex", 20));
        students.add(new Student("Sasha", 21));
        students.add(new Student("Alexandra", 22));

        Collections.sort(students);
        System.out.println(students);


    }
}
