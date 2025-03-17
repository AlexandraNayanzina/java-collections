package org.naianzina.javacollections.streamapi.tasks;

import java.util.List;

public class IncreasedAmountByTenPercent {

    public static void main(String[] args) {

        // Task8: Increase the amount of each order by 10%

        List<Order> orders = TestOrderGenerator.getListOfOrders();

        System.out.println("--- Original list of Orders ---");
        orders.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("--- Increased amount by 10% ---");

        orders.forEach(order -> {
            var amount = order.getAmount();
            amount += (int) (amount * 0.1);
            order.setAmount(amount);
        });
        orders.forEach(System.out::println);


        var increasedAmount = orders.stream()
                .map(order -> {
                    var amount = order.getAmount();
                    amount += (int) (amount * 0.1);
                    order.setAmount(amount);
                    return order;
                })
                .toList();

        increasedAmount.forEach(System.out::println);
    }
}
