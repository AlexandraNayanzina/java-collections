package org.naianzina.javacollections.streamapi.tasks1;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Task16StringOfCustomerNames {

    public static void main(String [] args) {

        // Task6: Concatenate all names into  a single string (comma-separated)

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

        System.out.println("--- String od all names (comma-separated) ---");

        String stringOfNames = listOfPersons
                .stream()
                .map(Person::getName)
                .collect(Collectors.joining(", "));

            System.out.println(stringOfNames);
        }
}
