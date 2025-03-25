package org.naianzina.zaurcourse.collections.queue;

import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample2 {
    public static void main(String [] args){

        Queue<Student3> prQ = new PriorityQueue<>();

        Student3 st1 = new Student3("Alex", 4);
        Student3 st2 = new Student3("Vika", 3);
        Student3 st3 = new Student3("Sasha", 4);
        Student3 st4 = new Student3("Tom", 2);
        prQ.add(st1);
        prQ.add(st2);
        prQ.add(st3);
        prQ.add(st4);

        for(Student3 student: prQ){
            System.out.println(student);
        }

        System.out.println("The top element with the highest priority: " + prQ.peek());
        System.out.println("Removed element with remove()" + prQ.remove());
        System.out.println("Top element: " + prQ.peek());



    }
}

class Student3 implements Comparable<Student3>{

    String name;
    int course;

    public Student3(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student3{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student3 student3 = (Student3) o;
        return Objects.equals(name, student3.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    @Override
    public int compareTo(Student3 st){
        return this.course - st.course;

    }
}
