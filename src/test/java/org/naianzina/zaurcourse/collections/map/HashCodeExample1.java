package org.naianzina.zaurcourse.collections.map;

import java.util.Objects;
import java.util.Map;
import java.util.HashMap;

public class HashCodeExample1 {

    /*
    - Good practice to override equals() and hasCode()
    - if obj1.equals(obj2) => obj1.hashCode() == obj2.hashCode()
    - if !obj1.equals(obj2 => obj1.hashCode() == obj2.hashCode() || obj1.hashCode() == obj2.hashCode()
     */

    public static void main(String [] args) {

        Map<Student, Double> map = new HashMap<>();
        Student student1 = new Student("Alex", 3);
        Student student2 = new Student("Sasha", 1);
        Student student3 = new Student("Tom", 2);
        Student student4 = new Student("Ford", 3);
        Student student5 = new Student("Ford", 3);

        map.put(student1, 4.5);
        map.put(student2, 6.5);
        map.put(student3, 5.5);
        map.put(student4, 4.5);
        // map.put(student5, 4.5);

        System.out.println(map);
//        boolean res = map.containsKey(student5);
//        System.out.println(res);
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student4.hashCode());
        System.out.println(student5.hashCode());

        for(Map.Entry<Student, Double>  entry: map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}

class Student{

    String name;
    int course;

    public Student(String name, int course) {
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
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, course);
    }
}
