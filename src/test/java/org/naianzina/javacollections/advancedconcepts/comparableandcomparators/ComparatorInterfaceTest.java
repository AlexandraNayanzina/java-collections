package org.naianzina.javacollections.advancedconcepts.comparableandcomparators;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

class NameComparator implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2){
        return s1.name.compareTo(s2.name);

    }

}

class AgeComparator implements Comparator<Student>{

    @Override
    public int compare(Student s1, Student s2){
        return Integer.compare(s1.age, s2.age);
    }
}

public class ComparatorInterfaceTest {

    public static void main(String [] args){

        /*
        - Comparator Interface allows to define multiple sorting orders for the same class
        - Comparator Interface provides two methods:
        -- compare(T o1, T o2) - Compares two objects and returns a result based on their relative order
        -- reversed() - Returns a comparator that sorts in reverse order
        - Comparator allows to write external classes or use lambda expressions to define sorting logic
        outside the object itself
        * */

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alex", 20));
        students.add(new Student("Alex", 23));
        students.add(new Student("Alex", 24));
        students.add(new Student("Sasha", 25));
        students.add(new Student("Alexandra", 22));

        Comparator<Student> nameThenAgeComparator = new NameComparator().thenComparing(new AgeComparator());

        Collections.sort(students, nameThenAgeComparator);

        for(Student student:students) {


            System.out.println(student);

        }

    }
}
