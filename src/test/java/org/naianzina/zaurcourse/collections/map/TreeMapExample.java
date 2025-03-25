package org.naianzina.zaurcourse.collections.map;

import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String[] args) {
        /*
        - Elements are stored in ascending sorted order
        - TreeMap is based on the self-balanced binary tree
         */

        TreeMap<Integer, Student1> map = new TreeMap<>();
        Student1 st1 = new Student1("Alex", 3);
        Student1 st2 = new Student1("Sasha", 1);
        Student1 st3 = new Student1("Vika", 2);
        Student1 st4 = new Student1("Olek", 4);

        map.put(4, st1);
        map.put(2, st2);
        map.put(5, st3);
        map.put(1, st4);


        for (Map.Entry<Integer, Student1> entry : map.entrySet()) {
            System.out.println(entry);
        }
        // descendingMap() method
        System.out.println(map.descendingMap());

        // tailMap() - elements from key
        System.out.println(map.tailMap(4));

        // headMap() - elements to key
        System.out.println(map.headMap(2));

        // lastEntry()
        System.out.println(map.lastEntry());

        // firstEntry()
        System.out.println(map.firstEntry());

    }
}


    class Student1 {
        String name;
        int course;

        public Student1(String name, int course) {
            this.name = name;
            this.course = course;
        }

        public String getName() {
            return name;
        }

        public void setName(String name, int course) {
            this.name = name;
            this.course = course;
        }

        public int getCourse() {
            return course;
        }

        public void setCourse(int course) {
            this.course = course;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student1 student1 = (Student1) o;
            return course == student1.course && Objects.equals(name, student1.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, course);
        }

        @Override
        public String toString() {
            return "Student1{" +
                    "name='" + name + '\'' +
                    ", course=" + course +
                    '}';
    }
}