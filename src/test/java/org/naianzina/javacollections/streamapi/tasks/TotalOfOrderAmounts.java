package org.naianzina.javacollections.streamapi.tasks;

import java.util.List;

import static java.util.Comparator.comparing;

public class TotalOfOrderAmounts {

    public static void main(String[] args) {

        // Task11: Total of Orders Amounts
        List<Order> orders = TestOrderGenerator.getListOfOrders();

        System.out.println("--- Original list of Orders ---");
        orders.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("--- Total Amount ---");

        var totalAmount = orders
            .stream()
            .map(Order::getAmount)
            .reduce(0, Integer::sum);

        System.out.println("Total amount: " + totalAmount);

    }
}
