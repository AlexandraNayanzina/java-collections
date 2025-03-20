package org.naianzina.javacollections.streamapi.tasks1;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task13AllOrdersSortedByAmount {

    public static void main(String [] args) {

        // Task13: Get a list of all orders sorted by amount (desc)

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

        System.out.println("--- All Orders sorted by Ampunt ---");

        List<Order> ordersSortedByAmount = listOfPersons
                .stream()
                .flatMap(p-> p.getOrders().stream())
                .sorted(Comparator.comparingDouble(Order::getAmount).reversed())
                .toList();

        ordersSortedByAmount.forEach(System.out::println);
        }
}
