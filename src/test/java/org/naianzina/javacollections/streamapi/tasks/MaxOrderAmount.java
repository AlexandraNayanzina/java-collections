package org.naianzina.javacollections.streamapi.tasks;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;

public class MaxOrderAmount {

    public static void main(String[] args) {

        // Task10: Get Max Order Amount
        List<Order> orders = TestOrderGenerator.getListOfOrders();

        System.out.println("--- Original list of Orders ---");
        orders.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("--- Max order Amount ---");

        var maxAmount = orders
                .stream()
                .max(comparing(Order::getAmount));

        System.out.println("Max order amount: " + maxAmount);

    }
}
