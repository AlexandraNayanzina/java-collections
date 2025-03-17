package org.naianzina.javacollections.streamapi.tasks;

import java.util.List;

public class UniqueStatuses {

    public static void main(String [] args){

        // Task6: Extract distinct order statuses
        List<Order> orders = TestOrderGenerator.getListOfOrders();

        System.out.println("--- Original list of Orders ---");
        orders.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("--- Unique Statuses ---");

        var distinctOrderStatuses = orders
                .stream()
                .map(Order::getStatus)
                .distinct()
                .toList();

        distinctOrderStatuses.forEach(System.out::println);

    }
}
