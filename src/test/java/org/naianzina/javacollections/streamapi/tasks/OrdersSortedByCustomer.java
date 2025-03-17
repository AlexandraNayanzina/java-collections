package org.naianzina.javacollections.streamapi.tasks;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

public class OrdersSortedByCustomer {

    public static void main(String [] args){

        // Task19: Create a List of Orders Sorted by Customer Name

        List<Order> orders = TestOrderGenerator.getListOfOrders();

        System.out.println("--- Original list of Orders ---");
        orders.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("--- Orders sorted by Customer Names ---");

        var sortedByName = orders
                .stream()
                .sorted(comparing(Order::getCustomer))
                .toList();

 sortedByName.forEach(System.out::println);

    }
}
