package org.naianzina.javacollections.streamapi;

import java.util.List;
import java.util.ArrayList;


public class StreamIsNonDestructiveExample {
    /*
    - Intermediate operations:
    filter(); map(); distinct(); sorted().
    Intermediate operations are lazy, meaning they do not perform any computations until
    a terminal operation is invoked.

    - Terminal operations:
    forEach(); collect(); reduce(); count().
    Terminal operations are eager, meaning they execute the entire stream pipeline when called.

    Streams are non-destructive!!!
    Streams process the data and return a new result, leaving the original collection intact

     */

    public static void main(String [] args){
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("banana");
        list.add("mango");
        list.add("cherry");

        System.out.println("The original list before modification with stream: " + list);

        list.stream()
                .map((String fruit)-> fruit.toUpperCase())
                .forEach(fruits -> System.out.print(" " + fruits));

        System.out.println("");
        System.out.println("The original list after the modification with stream: " + list);

    }
}
