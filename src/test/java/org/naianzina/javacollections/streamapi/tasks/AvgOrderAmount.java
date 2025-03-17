package org.naianzina.javacollections.streamapi.tasks;

import java.util.List;
import java.util.stream.Collectors;

public class AvgOrderAmount {

    public static void main(String [] args){

        // Task13: Get the avg order amount

        List<Order> orders = TestOrderGenerator.getListOfOrders();

        System.out.println("--- Original list of Orders ---");
        orders.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("--- Filtered by Status ---");

        var avgOrderAmount = orders
                .stream()
                .collect(Collectors.averagingDouble(Order::getAmount));

        System.out.println("The avg order amount " + avgOrderAmount);


    }


}
