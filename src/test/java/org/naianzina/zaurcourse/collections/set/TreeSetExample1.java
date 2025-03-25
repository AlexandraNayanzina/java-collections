package org.naianzina.zaurcourse.collections.set;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample1 {

    public static void main(String [] args){

        /*  TreesSet
        - TreeSet keeps the ordered elements
        - TreeSet is built on the TreeMap:
          -> key is an element of TreeSet
          -> value is constant (dummy value that is not used)

        Important!
        - If a.equals() -> true, a.compareTo() should return 0
When override the equals(); hashCode(); compareTo() need to use the same fields everywhere!!!
         */

        TreeSet<Student2> treeSet = new TreeSet<>();
        Student2 st1 = new Student2("Alex", 4);
        Student2 st2 = new Student2("Vika", 2);
        Student2 st3 = new Student2("Tom", 3);
        Student2 st4 = new Student2("Jerry", 1);
        Student2 st5 = new Student2("Jerry", 1);

        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        System.out.print("Initial treeSet (all elements are ordered): ");
        for(Student2 elem: treeSet){
            System.out.print(elem + " ");
        }

        System.out.println(treeSet.subSet(st5, st2));
        System.out.println(st5.hashCode() == st4.hashCode());
        System.out.println(st5.equals(st4));


    }
}

class Student2 implements Comparable<Student2>{
    String name;
    int course;

    public Student2(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return course == student2.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    @Override
    public int compareTo(Student2 o){
        return this.course - o.course;
    }
}
