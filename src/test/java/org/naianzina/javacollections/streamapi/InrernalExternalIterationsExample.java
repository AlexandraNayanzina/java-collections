package org.naianzina.javacollections.streamapi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InrernalExternalIterationsExample {
    public static void main(String [] args){

        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("cherry");


        // EXTERNAL ITERATIONS


        // Traditional way (forEach() loop or Iterator)
        System.out.println("------External iteration using for-each loop------");

        for (String fruit: fruits){
            System.out.print(fruit + " ");
        }

        // External Iteration using Iterator
        System.out.println(" ");
        System.out.println("------External iteration using Iterator------");
        Iterator<String> iter = fruits.iterator();
        while(iter.hasNext()){
            String elem = iter.next();
            System.out.print(elem + " ");
        }

        // Internal Iteration using Stream
        System.out.println(" ");
        System.out.println("------Internal iteration using Stream------");
        fruits.stream()
                .forEach(fruit-> System.out.print(fruit + " "));

        // Internal Iteration using Stream with other operations: map(); filter()
        System.out.println(" ");
        System.out.println("------Internal iteration using Stream with map(), filter() operations ------");
fruits.stream()
        .filter(fruit-> fruit.startsWith("a"))
        .map(fruit-> fruit.toUpperCase())
        .forEach(System.out::print);

    }
}
