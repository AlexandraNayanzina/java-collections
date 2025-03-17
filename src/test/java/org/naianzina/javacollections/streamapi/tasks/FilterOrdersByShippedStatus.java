package org.naianzina.javacollections.streamapi.tasks;

import java.util.List;

public class FilterOrdersByShippedStatus {

    public static void main(String [] args){

        List<Order> orders = TestOrderGenerator.getListOfOrders();

        System.out.println("--- Original list of Orders ---");
        orders.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("--- Filtered by Status ---");

        var shippedOrders = orders.stream()
                .filter((Order order)-> order.getStatus().equals("Shipped"))
                .toList();

        shippedOrders.forEach(System.out::println);

    }
}
