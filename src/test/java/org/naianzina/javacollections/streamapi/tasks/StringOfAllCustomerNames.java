package org.naianzina.javacollections.streamapi.tasks;

import java.util.List;
import java.util.stream.Collectors;

public class StringOfAllCustomerNames {

    public static void main(String [] args){

        // Task14: Create a string of all customer names

        List<Order> orders = TestOrderGenerator.getListOfOrders();

        System.out.println("--- Original list of Orders ---");
        orders.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("--- All customer names ---");

        var customerNames = orders
                .stream()
                .map(Order::getCustomer)
                .distinct()
                .collect(Collectors.joining(", ", "[", "]"));


        System.out.println("Customer names: " + customerNames);


    }


}
