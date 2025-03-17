package org.naianzina.javacollections.streamapi.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapOrdersToTheirAmount {
    public static void main(String [] args) {

        // Task7: Map the list of orders to the list of their amounts

        List<Order> orders = TestOrderGenerator.getListOfOrders();

        List<Salary> listOfSalaries = Arrays.asList(
                new Salary(1, 30_000),
                new Salary(2, 10_000),
                new Salary(3, 20_000)
        );

        orders.forEach(System.out::println);
        orders.forEach(System.out::println);

        System.out.println(" ");
        System.out.println("--- Map orders to a list of their amounts ---");

        // Step1. Convert the list of Salaries to a Map<is, salary>
        Map<Integer, Integer>  salartMap = listOfSalaries
                .stream()
                .collect(Collectors.toMap(s-> s.id, s-> s.salary));

        // Step2. Merge Orders with salaries
        List<OrdersWithSalary> mergedOrders = orders
                .stream()
                .map(order-> new OrdersWithSalary(
                        order.getId(),
                        order.getCustomer(),
                        order.getStatus(),
                        order.getAmount()
                ))
                .toList();

        mergedOrders.forEach(System.out::println);



    }
}
class Salary{
    int id;
    int salary;

    public Salary(int id, int salary){
        this.id = id;
        this.salary = salary;
    }

}

class OrdersWithSalary{
    public int id;
    public String customer;
    public String status;
    public int amount;

    public OrdersWithSalary(int id, String customer, String status, int amount ){
        this.id = id;
        this.customer = customer;
        this.status = status;
        this.amount = amount;
    }


}
