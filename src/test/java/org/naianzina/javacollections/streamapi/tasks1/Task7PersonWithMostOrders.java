package org.naianzina.javacollections.streamapi.tasks1;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task7PersonWithMostOrders {

    public static void main(String [] args) {

        // Task7: Find the person with the most orders

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

        System.out.println("--- The Person with the most Orders ---");

        Optional<Person> maxOrdersOpt = listOfPersons
                .stream()
                .max(Comparator.comparingInt(p-> p.getOrders().size()));

        if (maxOrdersOpt.isPresent()) {
            Person maxOrders = maxOrdersOpt.get();
            System.out.println(maxOrders.getOrders().size());
        }
    }
}
