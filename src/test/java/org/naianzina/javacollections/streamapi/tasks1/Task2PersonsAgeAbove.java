package org.naianzina.javacollections.streamapi.tasks1;

import java.util.List;

public class Task2PersonsAgeAbove {

    public static void main(String [] args){

        // Task2: Filter people above 25 years old

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

        System.out.println("--- People above 25 years old ---");
        listOfPersons
                .stream()
                .filter(p -> p.getAge() > 25)
                .forEach(p-> System.out.println(p.getName() +" "+ p.getAge()));

    }
}
