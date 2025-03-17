package org.naianzina.javacollections.streamapi.tasks;

import java.util.List;

public class CheckDeliveredOrders {

    public static void main(String [] args){

        // Task16: Check if anyOrder has status "Delivered"

        List<Order> orders = TestOrderGenerator.getListOfOrders();

        System.out.println("--- Original list of Orders ---");
        orders.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("--- Check if anyOrder has status \"Delivered\" ---");

        var isDeliveredExists = orders
                .stream()
                .anyMatch(order -> "Delivered".equals(order.getStatus()));

        if(isDeliveredExists) {
            System.out.println("There are some delivered orders");
        }


    }
}
