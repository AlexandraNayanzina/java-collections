package org.naianzina.javacollections.streamapi.tasks1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Task11GroupOrdersByStatus {

    public static void main(String [] args) {

        // Task11: Group Orders by Status

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

        System.out.println("--- Grouped Orders by Status ---");

        Map<String, List<Order>> groupedOrdersByStatus = listOfPersons
                .stream()
                .flatMap(p -> p.getOrders().stream())
                .collect(Collectors.groupingBy(Order::getStatus));


        groupedOrdersByStatus.forEach( (k, v) -> {
            System.out.println(k);
            System.out.println(v);
        });



    }
}
