package org.naianzina.javacollections.streamapi.tasks;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupedOrdersByStatus {

    public static void main(String[] args) {

        // Task9: Group Orders By Status

        List<Order> orders = TestOrderGenerator.getListOfOrders();

        System.out.println("--- Original list of Orders ---");
        orders.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("--- Print orders grouped by status ---");

        // Group orders by status
        Map<String, List<Order>> ordersByStatus = orders
                .stream()
                .collect(Collectors.groupingBy(Order::getStatus));

        // Print orders
        ordersByStatus.forEach((status, orderList) ->
        {
            System.out.println("Status:" + status);
            orderList.forEach(System.out::println);
            System.out.println();
        });
    }
}
