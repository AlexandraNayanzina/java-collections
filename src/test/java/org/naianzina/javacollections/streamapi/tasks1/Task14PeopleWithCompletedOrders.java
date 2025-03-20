package org.naianzina.javacollections.streamapi.tasks1;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task14PeopleWithCompletedOrders {

    public static void main(String [] args) {

        // Task14: Find people with at least one Completed Order

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

        System.out.println("--- People with at least one Completed Order---");

        List<String> personsWithCompletedOrders = listOfPersons
                .stream()
                .filter(p-> p.getOrders().stream().anyMatch(o-> "Completed".equals(o.getStatus())))
                .map(Person::getName)
                .toList();


        personsWithCompletedOrders.forEach(System.out::println);
        }
}
