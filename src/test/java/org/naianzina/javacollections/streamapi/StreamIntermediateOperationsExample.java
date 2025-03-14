package org.naianzina.javacollections.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamIntermediateOperationsExample {

    public static void main(String [] args){
        /* Stream Intermediate Operations

        There are operations that transform a stream into another stream.
        The Intermediate operations are lazy -> they don't do anything until a terminal operations is invoked.
        The Intermediate operations build up a description on what needs to happen, but nothing is executed yet.

        Common intermediate operations:
        - filter(): Filters the elements based on the conditions
        - map(): Transforms each element of the stream into another form
        - sorted(): Sorts the elements of the stream
        - distinct(): Removes duplicate elements in the stream
        - limit(): Limit the number of elements in the stream
         */

        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("cherry");
        fruits.add("apricot");
        fruits.add("blueberry");
        fruits.add("mango");
        fruits.add("lemon");
        fruits.add("lemon");
        fruits.add("lemon");

        System.out.println("Original list before modification with stream: " + fruits);


        // filter()
        List <String> fruitsFilteredByName = fruits.stream()
                .filter(fruit-> fruit.startsWith("a"))
                .collect(Collectors.toList());
        System.out.println("Fruits starts from letter 'a': " + fruitsFilteredByName);


        // map()
        List<String> fruitsToUpperCase = fruits.stream()
                .map(fruit-> fruit.toUpperCase())
                .collect(Collectors.toList());

        System.out.println("Fruits to upper case: "+ fruitsToUpperCase);

        // distinct()
        List<String> distinctFruits = fruits.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("Distinct fruits: " + distinctFruits);

        // sorted()
        List<String> alphabeticallySortedFruits = fruits.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Alphabetically sorted fruits: " + alphabeticallySortedFruits);






    }
}
