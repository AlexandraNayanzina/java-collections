package org.naianzina.javacollections.streamapi.tasks;

import java.util.List;

public class RemoveOrdersWithAmountLessThan {

    public static void main(String [] args){

        // Task17: Remove orders with amount less than 150

        List<Order> orders = TestOrderGenerator.getListOfOrders();

        System.out.println("--- Original list of Orders ---");
        orders.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("--- Remove orders with amount less than 150 ---");

        orders.removeIf(order-> order.getAmount() < 150 );
        orders.forEach(System.out::println);

        }

}
