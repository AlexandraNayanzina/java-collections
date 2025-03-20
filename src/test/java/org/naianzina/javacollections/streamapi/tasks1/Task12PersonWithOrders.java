package org.naianzina.javacollections.streamapi.tasks1;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task12PersonWithOrders {

    public static void main(String [] args) {

        // Task12: Partition people by whether they have placed orders

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

        System.out.println("--- The Persons with Orders ---");

        List<Person> personWithOrders = listOfPersons
                .stream()
                .filter(p -> p.getOrders().size() > 0)
                .toList();

        personWithOrders.forEach(System.out::println);
    }

}
