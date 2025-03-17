package org.naianzina.javacollections.streamapi.tasks;

import java.util.Arrays;
import java.util.List;

public class TestOrderGenerator {

    public static List<Order> getListOfOrders(){

        return Arrays.asList(
                new Order(1, "Alice", 30, "Shipped"),
                new Order(2, "Bob", 40, "Pending"),
                new Order(3, "Charlie", 10, "Shipped"),
                new Order(4, "David", 60, "Delivered"),
                new Order(5, "Alice", 60, "Pending"),
                new Order(6, "Eve", 30, "Shipped"),
                new Order(7, "Alice", 500, "Shipped"),
                new Order(8, "Alice", 300, "Pending")
        );

    }

}
