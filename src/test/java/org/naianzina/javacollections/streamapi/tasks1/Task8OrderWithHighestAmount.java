package org.naianzina.javacollections.streamapi.tasks1;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task8OrderWithHighestAmount {

    public static void main(String [] args) {

        // Task8: Find the order with the highest amount

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

        System.out.println("--- The Order with the highest amount ---");

        Optional<Order> maxAmountOpt = listOfPersons
                .stream()
                .flatMap(p-> p.getOrders().stream())
                .max(Comparator.comparingDouble(Order::getAmount));


        if (maxAmountOpt.isPresent()) {
            Order maxAmount = maxAmountOpt.get();
            System.out.println("Max amount: " + maxAmount.getAmount());
        }
    }
}
