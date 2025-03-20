package org.naianzina.javacollections.streamapi.tasks1;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task9CheckOrderOver {

    public static void main(String [] args) {

        // Task9: Check if any person has an order over $500

        List<Person> listOfPersons = TestPersonGenerator.getListOfPersons();

        System.out.println("--- The initial list of Persons with Orders ---");
        for (int i = 0; i < listOfPersons.size(); i++) {
            System.out.print("Person " + i + ": ");
            System.out.println("Name: " + listOfPersons.get(i).getName() + ", age: " + listOfPersons.get(i).getAge());
            for (int j = 0; j < listOfPersons.get(i).getOrders().size(); j++) {
                System.out.print("Order " + j + ": ");
                System.out.println(listOfPersons.get(i).getOrders().get(j));
            }
        }

        System.out.println("--- Check if any person has an order over $500 ---");

        boolean maxAmountOpt = listOfPersons
                .stream()
                .flatMap(p -> p.getOrders().stream())
                .anyMatch(o-> o.getAmount() > 500);

        if(maxAmountOpt){
            System.out.println("There are the orders with amount grater than 500");
        } else {
            System.out.println("There is no orders with amount grater than 500");
        }

    }
}
