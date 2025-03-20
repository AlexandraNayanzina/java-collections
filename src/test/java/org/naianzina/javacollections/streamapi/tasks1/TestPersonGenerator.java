package org.naianzina.javacollections.streamapi.tasks1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class TestPersonGenerator {

    public static List<Person> getListOfPersons(){

        List<Order> ordersListOne = TestOrdersGenerator.getListOfOrdersOne();
        List<Order> ordersListTwo = TestOrdersGenerator.getListOfOrdersTwo();
        List<Order> ordersListThree = TestOrdersGenerator.getListOfOrdersThree();
        List<Order> emptyOrdersList = new ArrayList<>(Arrays.asList());

        return Arrays.asList(
                new Person("Alice", 35, ordersListOne ),
                new Person("Bob", 20, ordersListTwo),
                new Person("Alex", 40, ordersListThree),
                new Person("Marcy", 20, emptyOrdersList)


        );
    }

}
