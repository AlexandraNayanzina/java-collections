package org.naianzina.javacollections.streamapi.tasks;

import java.util.List;

public class CountPendingOrders {

    public static void main(String [] args){

        // Task4: Count how many orders have the status Pending

        List<Order> orders = TestOrderGenerator.getListOfOrders();

        System.out.println("--- Original list of Orders ---");
        orders.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("--- Filtered by Status ---");

        var ordersStatusPending = orders.stream()
                .filter(order-> order.getStatus().equals("Pending"))
                .count();

        System.out.println("The number of orders in Pending status: " + ordersStatusPending);





    }

}
