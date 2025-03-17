package org.naianzina.javacollections.streamapi.tasks;

import java.util.List;

public class FirstOrderAmountGraterThan {

    public static void main(String [] args){

        // Find the First order with amount grater than 200

        List<Order> orders = TestOrderGenerator.getListOfOrders();

        System.out.println("--- Original list of Orders ---");
        orders.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("--- Filtered by Status ---");

        var countPendingOrders = orders.stream()
                .filter(order-> order.getAmount() > 200)
                .findFirst();

        System.out.println("The first Order with amount grater than 200: " + countPendingOrders);



    }
}
