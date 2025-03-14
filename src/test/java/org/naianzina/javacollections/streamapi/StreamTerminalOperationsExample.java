package org.naianzina.javacollections.streamapi;

import java.util.ArrayList;
import java.util.List;

public class StreamTerminalOperationsExample {

    /* Stream Terminal Operations
    Trigger the stream pipeline execution and produce a result

- forEach(): Performs an action on each element of the stream
- collect(): Collects the elements of the stream into a collection or another data structure
- reduce(): Reduces the elements of the stream into a single result
- count(): Counts the number of elements in the stream
- findFirst(): Finds the first element in the stream
     */

    public static void main(String [] args){

        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("mango");
        fruits.add("melon");
        fruits.add("guava");
        fruits.add("cherry");
        fruits.add("strawberries");


        //count()
        long fruitsListCount = fruits.stream()
                .count();

        System.out.println("The number of the elements in the fruits list: " + fruitsListCount);

        //forEach
        fruits.stream()
                .map(fruit-> fruit.toUpperCase())
                .limit(2)
                .forEach(fruit -> System.out.println("Fruit name: " + fruit));
    }
}
