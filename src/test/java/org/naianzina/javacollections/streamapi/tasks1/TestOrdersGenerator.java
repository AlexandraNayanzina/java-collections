package org.naianzina.javacollections.streamapi.tasks1;

import java.util.List;
import java.util.Arrays;

public class TestOrdersGenerator {

    public static List<Order> getListOfOrdersOne(){

        return Arrays.asList(
                new Order(1, 20.3, "Shipped"),
                new Order(2, 50.7, "Delivered"),
                new Order(3, 60.6, "Shipped")
        );
    }

    public static List<Order> getListOfOrdersTwo(){

        return Arrays.asList(
                new Order(4, 20.3, "Shipped"),
                new Order(5, 80.7, "Delivered"),
                new Order(6, 90.6, "Completed"),
                new Order(7, 100.6, "Shipped")
        );
    }

    public static List<Order> getListOfOrdersThree(){

        return Arrays.asList(
                new Order(7, 10.3, "Shipped"),
                new Order(8, 58.7, "Completed"),
                new Order(9, 69.6, "Delivered")
        );
    }

}
