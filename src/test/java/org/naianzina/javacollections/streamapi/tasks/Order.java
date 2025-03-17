package org.naianzina.javacollections.streamapi.tasks;

import java.util.Objects;

public class Order {

    private int id;
    private String customer;
    private int amount;
    private String status;

    public Order(int id, String customer, int amount, String status){
        this.id = id;
        this.customer = customer;
        this.amount = amount;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && amount == order.amount && Objects.equals(customer, order.customer) && Objects.equals(status, order.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customer, amount, status);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer='" + customer + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                '}';
    }
}
