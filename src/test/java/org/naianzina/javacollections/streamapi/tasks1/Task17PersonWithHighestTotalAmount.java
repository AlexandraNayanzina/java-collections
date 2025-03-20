package org.naianzina.javacollections.streamapi.tasks1;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task17PersonWithHighestTotalAmount {

    public static void main(String [] args) {

        // Task17: Find the Person with the highest Order total amount

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

        System.out.println("--- The Person with the highest order total amount ---");

        Optional<Person> highestAmount = listOfPersons
                .stream()
                .max(Comparator.comparingDouble(p-> p.getOrders().stream().mapToDouble(Order::getAmount).sum()));

            System.out.println(highestAmount);
        }
}
