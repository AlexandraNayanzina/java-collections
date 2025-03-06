package org.naianzina.javacollections.collectionclasses;

import java.util.Vector;

public class VectorTest {

    public static void main(String [] args){

        /* Vector is synchronized, thread-safe. When multiple threads access a Vector object,
        We don't need to worry about inconsistent states because only one thread can manipulate it at a time.
        The tradeoff is that synchronization adds overhead and slows down operations
        to the non-synchronized ArrayList.
         */

        Vector<String> vector = new Vector<>();

        vector.add("Apple");
        vector.add("Banana");
        vector.add("Grape");
        vector.add("Melon");

        System.out.println("Elements in vector: " + vector);


    }
}
