package org.naianzina.zaurcourse.collections.lambda;


import java.util.ArrayList;

public class StudentInfo {

    public static void main(String [] args){

        Student st1 = new Student("Alex", 'm', 20, 3, 6.7);
        Student st2 = new Student("Sasha", 'f', 19, 2, 9.7);
        Student st3 = new Student("Tom", 'm', 22, 4, 8.7);
        Student st4 = new Student("Jerry", 'f', 23, 5, 9.1);
        Student st5 = new Student("Jerry", 'm', 23, 5, 9.1);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo studentInfo = new StudentInfo();
        System.out.println("---Students with higher grade than 8 ---");
        studentInfo.printStudentsOverGrade1(students, 8);
        System.out.println("Students older than 20: ");
        studentInfo.printStudentsUnderAge(students, 20);
        System.out.println("Students older than 22, grade higher than 8, sex 'f': ");
        studentInfo.printStudentsOverGrade(students, 22,10, 'm');
        System.out.println("---!!!---");
        studentInfo.testStudents(students, new checkOverGrade());


    }
         void testStudents(ArrayList<Student> stList, StudentChecks sCheck){
        for(Student s: stList){
            if (sCheck.check(s)){
                System.out.println(s);
            }
        }
         }

        void printStudentsOverGrade1(ArrayList<Student> arrStuds, double grade){
        for(Student s: arrStuds){
            if(s.avgGrade > grade){
                System.out.println(s);
            }
        }
        }
         void printStudentsUnderAge(ArrayList<Student> arrStuds, int age){
             for(Student s: arrStuds){
                 if(s.age < age){
                     System.out.println(s);
                 }
             }
        }
         void printStudentsOverGrade(ArrayList<Student> arrStuds,int age, double grade, char sex){
             for(Student s: arrStuds){
                 if(s.age>age && s.avgGrade < grade && s.sex == sex){
                     System.out.println(s);
                 }
             }

        }
}


interface StudentChecks{
    boolean check(Student s);
}

class checkOverGrade implements StudentChecks{
    @Override
    public boolean check(Student s){
        return s.avgGrade>8;
    }
}
