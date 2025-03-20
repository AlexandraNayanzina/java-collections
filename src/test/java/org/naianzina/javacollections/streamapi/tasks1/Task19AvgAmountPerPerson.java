package org.naianzina.javacollections.streamapi.tasks1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Task19AvgAmountPerPerson {
    public static void main(String [] args) {

        // Task19: Find avg order amount per person

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

        System.out.println("--- Avg order amount per person ---");

        Map<String, Double> mapPersonAvgAmount = listOfPersons
                .stream()
                .collect(Collectors.toMap(
                        Person::getName,
                        p-> p.getOrders().stream().mapToDouble(Order::getAmount).average().orElse(0)
                ));


        mapPersonAvgAmount.forEach((k, v) -> System.out.println("Name: " +k+ ", avg order amount: " + Math.round(v)));

    }
}
