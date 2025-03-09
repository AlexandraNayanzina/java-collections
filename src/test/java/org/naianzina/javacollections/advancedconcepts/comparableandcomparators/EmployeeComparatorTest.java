package org.naianzina.javacollections.advancedconcepts.comparableandcomparators;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;


class Employee{
    private String firstName;
    private String lastName;
    private double salary;
    private String department;
    private LocalDate employmentStartDate;

    public Employee(String firstName, String lastName, double salary ,String department, LocalDate employmentStartDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
        this.employmentStartDate = employmentStartDate;
    }

    public String toString(){
        return  firstName + " " + lastName + ", salary: "+ salary + ", department: "+ department + ", employmentStartDate: "+ employmentStartDate;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public double getSalary(){
        return this.salary;
    }
    public String getDepartment(){
        return this.department;
    }
    public LocalDate getEmploymentStartDate(){
        return this.employmentStartDate;
    }

}

class FirstNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2){
        return e1.getFirstName().compareTo(e2.getFirstName());
    }
}

class LastNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2){
        return e1.getLastName().compareTo(e2.getLastName());
    }
}
class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2){
        return Double.compare(e2.getSalary(), e1.getSalary());
    }
}
class DepartmentComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2){
        return e1.getDepartment().compareTo(e2.getDepartment());
    }
}

class EmploymentStartDateComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2){
        return e1.getEmploymentStartDate().compareTo(e2.getEmploymentStartDate());
    }
}


public class EmployeeComparatorTest {

    public static void main(String [] args){

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Alex", "Naianzina", 10000, "IT", LocalDate.of(2000, 2, 10)));
        empList.add(new Employee("Sasha", "Naianzina", 20000, "IT", LocalDate.of(2001, 3, 11)));
        empList.add(new Employee("David", "Choi", 30000, "Admin", LocalDate.of(2002, 4, 12)));
        empList.add(new Employee("Anna", "Big", 10000, "Management", LocalDate.of(2003, 5, 13)));
        empList.add(new Employee("Denis", "Little", 20000, "Admin", LocalDate.of(2004, 6, 13)));
        empList.add(new Employee("Carl", "Lag", 30000, "IT", LocalDate.of(2005, 6, 13)));
        empList.add(new Employee("Ben", "Smith", 40000, "Admin", LocalDate.of(2005, 6, 13)));
        empList.add(new Employee("Fill", "Clock", 20000, "IT", LocalDate.of(2006, 7, 15)));
        empList.add(new Employee("Jenifer", "Garnier", 60000, "IT", LocalDate.of(2007, 8, 15)));
        empList.add(new Employee("Sally", "Winlson", 20000, "Tech", LocalDate.of(2008, 9, 16)));

        // 1. Sorted by last name then first name
        Comparator<Employee> lasNameThenFirstName = new FirstNameComparator().thenComparing(new LastNameComparator());
        Collections.sort(empList, lasNameThenFirstName);

        System.out.println("1. The list of employees sorted by last name then first name");
        for(Employee emp: empList){
            System.out.println(emp);
        }

        // 2. Sorted by last department then salary
        Comparator<Employee> departmentThenSalary= new DepartmentComparator().thenComparing(new SalaryComparator());
        Collections.sort(empList, departmentThenSalary);

        System.out.println("___________________________________");
        System.out.println("2. The list of employees sorted by department then salary");
        for(Employee emp: empList){
            System.out.println(emp);
        }

        // 3. Sorted by employment start date
        Comparator<Employee> byEmploymentStartDate= new EmploymentStartDateComparator();
        Collections.sort(empList, byEmploymentStartDate);

        System.out.println("___________________________________");
        System.out.println("3. The list of employees sorted by by employment start date");
        for(Employee emp: empList){
            System.out.println(emp);
        }


    }
}
