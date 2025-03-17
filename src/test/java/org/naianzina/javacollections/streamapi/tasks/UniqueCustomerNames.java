package org.naianzina.javacollections.streamapi.tasks;

import java.util.List;

import static java.util.Comparator.comparing;

public class UniqueCustomerNames {

    public static void main(String [] args){

        // Task20: Unique Customers

        List<Order> orders = TestOrderGenerator.getListOfOrders();

        System.out.println("--- Original list of Orders ---");
        orders.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("--- Orders sorted by Customer Names ---");

        var uniqueCustomers = orders
                .stream()
                .map(Order::getCustomer)
                .distinct()
                .toList();

        uniqueCustomers.forEach(System.out::println);


    }
}
