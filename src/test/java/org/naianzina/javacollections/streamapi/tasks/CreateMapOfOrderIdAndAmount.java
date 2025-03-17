package org.naianzina.javacollections.streamapi.tasks;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CreateMapOfOrderIdAndAmount {

    public static void main(String [] args){

        // Task18: Create a Map of Order ID to Amount

        List<Order> orders = TestOrderGenerator.getListOfOrders();

        System.out.println("--- Original list of Orders ---");
        orders.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("--- Map of Order Id and Amount ---");

       Map<Integer, Integer> ordersMap = orders
               .stream()
               .collect(Collectors.toMap(Order::getId, Order::getAmount));

        System.out.println(ordersMap);



    }
}
