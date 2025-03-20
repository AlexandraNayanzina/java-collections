package org.naianzina.javacollections.streamapi.tasks1;

import java.util.List;
import org.naianzina.javacollections.streamapi.tasks1.Order;
public class Person {

    private String name;
    private int age;
    private List<Order> orders;

    public Person(String name, int age, List<Order> orders) {
        this.name = name;
        this.age = age;
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Person name: " + name + ", age: " + age + ", orders: " + orders.toString();
    }
}
