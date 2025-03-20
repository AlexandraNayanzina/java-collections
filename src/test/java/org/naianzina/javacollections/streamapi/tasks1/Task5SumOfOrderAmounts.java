package org.naianzina.javacollections.streamapi.tasks1;

import java.util.List;
import java.util.stream.Collectors;

public class Task5SumOfOrderAmounts {

    public static void main(String [] args) {

        // Task5: Find the sum of all orders amounts

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

        System.out.println("--- Sum od Order amounts ---");
        var sumOfOrderAmount = listOfPersons
                .stream()
                .flatMap(p -> p.getOrders().stream())
                .mapToDouble(Order::getAmount)
                .sum();


        System.out.print(sumOfOrderAmount);

    }
}
