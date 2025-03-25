package org.naianzina.zaurcourse.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ArrayListExample2 {

    public static void main(String [] args){

        Student4 st1 = new Student4("Alex", 4);
        Student4 st2 = new Student4("Vika", 3);
        Student4 st3 = new Student4("Sasha", 2);
        Student4 st4 = new Student4("Tom", 4);
        Student4 st5 = new Student4("Bella", 3);
        Student4 st6 = new Student4("Jerry", 1);
        Student4 st7 = new Student4("Max", 5);
        Student4 st8 = new Student4("Max", 5);

        ArrayList<Student4> stArrayList = new ArrayList<>();
        stArrayList.add(st1);
        stArrayList.add(st2);
        stArrayList.add(st3);
        stArrayList.add(st4);

        System.out.println("Removing an element: " + stArrayList.remove(st1));

        stArrayList.add(st5);
        stArrayList.add(st6);
        stArrayList.add(st7);
        stArrayList.add(st8);

        System.out.println("indexOf() method: " + stArrayList.indexOf(st7));
        System.out.println("lastIndexOf() method: " + stArrayList.lastIndexOf(st7));
        System.out.println("Is array empty;  " + stArrayList.isEmpty());
        System.out.println("Is ArrayList contains st8;  " + stArrayList.contains(st8));
        System.out.println("Is ArrayList contains st8;  " + stArrayList.contains(st8));

        // Sorting the ArrayList
//        Collections.sort(stArrayList);

        Student4 [] studs = {st1, st2, st3, st4};
        Arrays.sort(studs);

        for(Student4 student: studs){
            System.out.println(student);
        }


    }
}


class Student4 implements Comparable<Student4>{

    String name;
    int course;

    public Student4(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student4 student = (Student4) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    @Override
    public int compareTo(Student4  st){
            return this.course - st.course;
    }
}
