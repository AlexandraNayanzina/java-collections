package org.naianzina.javacollections.streamapi.tasks1;

import java.util.List;
import java.util.stream.Collectors;


public class Task1PersonsNames {

    public static void main(String [] args){

        // Task1: Get names of all Persons

        List<Person> listOfPersons = TestPersonGenerator.getListOfPersons();

        System.out.println("--- The initial list of Persons with Orders ---");
        for (int i=0; i < listOfPersons.size(); i++){
            System.out.print("Person " + i + ": ");
            System.out.println("Name: "+ listOfPersons.get(i).getName() + ", age: "+ listOfPersons.get(i).getAge());
            for(int j = 0; j < listOfPersons.get(i).getOrders().size(); j++){
                System.out.print ("Order " + j + ": ");
                System.out.println(listOfPersons.get(i).getOrders().get(j));
            }
        }

        System.out.println("--- Names of all people ---");
        listOfPersons
                .stream()
                .map(Person::getName)
                .forEach(System.out::println);


    }
}
