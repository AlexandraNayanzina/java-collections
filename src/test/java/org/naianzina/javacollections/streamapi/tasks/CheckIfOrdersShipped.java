package org.naianzina.javacollections.streamapi.tasks;

import java.util.List;
import java.util.stream.Collectors;

public class CheckIfOrdersShipped {

    public static void main(String [] args){

        // Task15: Check if all Order has status "Shipped"

        List<Order> orders = TestOrderGenerator.getListOfOrders();

        System.out.println("--- Original list of Orders ---");
        orders.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("--- Check how many order are not shipped ---");

        var shippedOrders = orders
                .stream()
                .filter(order-> "Shipped".equals(order.getStatus()))
                .count();



        System.out.println("Number of not shipped orders: " + shippedOrders + " out of " + orders.size()+ " orders");


    }

}
