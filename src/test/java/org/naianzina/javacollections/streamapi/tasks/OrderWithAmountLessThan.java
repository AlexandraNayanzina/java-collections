package org.naianzina.javacollections.streamapi.tasks;

import java.util.List;

public class OrderWithAmountLessThan {

    public static void main(String[] args) {

        // Task12: Find Orders with amount less than 200
        List<Order> orders = TestOrderGenerator.getListOfOrders();

        System.out.println("--- Original list of Orders ---");
        orders.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("--- Amount less than 200 ---");

        var amountLessThan = orders
                .stream()
                .filter(order-> order.getAmount() < 200)
                .toList();

        amountLessThan.forEach(System.out::println);

    }
}
