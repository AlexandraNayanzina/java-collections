package org.naianzina.javacollections.streamapi.tasks1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.stream.Collectors;

public class Task4UniqueOrderIds {

    public static void main(String [] args){

        // Task4: Get a list of unique order Ids

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

        System.out.println("--- Unique Order Ids ---");
        var listOfOrders = listOfPersons
                .stream()
                .flatMap(p-> p.getOrders().stream())
                .map(Order::getId)
                .collect(Collectors.toSet());

        System.out.println(listOfOrders);


    }
}
