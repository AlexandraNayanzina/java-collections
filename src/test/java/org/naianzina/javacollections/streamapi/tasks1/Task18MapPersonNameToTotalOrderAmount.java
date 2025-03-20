package org.naianzina.javacollections.streamapi.tasks1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Task18MapPersonNameToTotalOrderAmount {

    public static void main(String [] args) {

        // Task18: Create a map of Person name to order total amount

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

        System.out.println("--- Map of Person name to order total amount ---");

        Map<String, Double> mapPerson = listOfPersons
                .stream()
                .collect(Collectors.toMap(
                        Person::getName,
                        p-> p.getOrders().stream().mapToDouble(Order::getAmount).sum()
                ));


        for(Map.Entry<String, Double> entry: mapPerson.entrySet()){
            System.out.println("Name: " + entry.getKey()+ ", amount: " + entry.getValue());
        }
        
    }
}
