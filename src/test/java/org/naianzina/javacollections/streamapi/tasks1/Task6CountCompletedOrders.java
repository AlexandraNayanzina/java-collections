package org.naianzina.javacollections.streamapi.tasks1;

import java.util.List;

public class Task6CountCompletedOrders {

    public static void main(String [] args) {

        // Task6: Count completed orders

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

        System.out.println("--- Number of Completed Orders ---");

        long completedOrders = listOfPersons
                .stream()
                .flatMap(p -> p.getOrders().stream())
                .filter(o-> "Completed".equals(o.getStatus()))
                .count();


        System.out.print(completedOrders);

    }
}
