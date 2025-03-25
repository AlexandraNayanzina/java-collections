package org.naianzina.zaurcourse.collections.linkedlist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearchExample {

    public static void main(String [] args){
        ArrayList<Integer> arrList = new ArrayList();

        arrList.add(2);
        arrList.add(-3);
        arrList.add(7);
        arrList.add(50);
        arrList.add(34);
        arrList.add(-20);
        arrList.add(5);
        arrList.add(90);

        int index1 = Collections.binarySearch(arrList, 50);
        System.out.println(index1);
        Collections.sort(arrList);
        int index2 = Collections.binarySearch(arrList, 50);
        System.out.println(index2);

        Employee emp1 = new Employee(1, 10_000, "Alex");
        Employee emp2 = new Employee(7, 20_000, "Sasha");
        Employee emp3 = new Employee(90, 60_000, "Tom");
        Employee emp4 = new Employee(2, 20_000, "Jerry");
        Employee emp5 = new Employee(65, 90_000, "Bruno");

        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);


        for(Employee emp: empList){
            System.out.println(emp);
        }


        System.out.println("Sorted empList");
        Collections.sort(empList);
        for(Employee emp: empList){
            System.out.println(emp);
        }

        int index3 = Collections.binarySearch(empList, emp2);
        System.out.println(index3);

        int [] array = {2, 4, -3, 54, 123, -45, -6, 3};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array, 123));
        System.out.println("Sorted array in reversed order");
        Arrays.sort(array);





    }
}

class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;

    public Employee(int id, int salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee emp){
     int result = this.id - emp.id;
     if( result == 0){
         result = this.name.compareTo(emp.name);
     }
     return result;

    }
}
