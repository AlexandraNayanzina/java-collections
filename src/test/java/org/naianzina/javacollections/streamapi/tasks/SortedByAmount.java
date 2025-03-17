package org.naianzina.javacollections.streamapi.tasks;

import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;

public class SortedByAmount {

    public static void main(String [] args){

        // Task5: Sort the orders by their amount in ascending order

        List<Order> orders = TestOrderGenerator.getListOfOrders();

        System.out.println("--- Original list of Orders ---");
        orders.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("--- Sorted by Amount ---");

        var sortedByAmount = orders
                .stream()
                .sorted(comparing(Order::getAmount))
                .toList();


        sortedByAmount.forEach(System.out::println);

    }
}
