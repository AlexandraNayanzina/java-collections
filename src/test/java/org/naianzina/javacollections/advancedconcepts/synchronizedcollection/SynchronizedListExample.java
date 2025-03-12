package org.naianzina.javacollections.advancedconcepts.synchronizedcollection;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class SynchronizedListExample {

    public static void main(String [] args){
        /*
        In multi-threading applications, it's common to access shared resources including collections.
        If two or more threads modify the same collection at the same time, it can lead to unpredictable
        results or even corrupt data. This is where synchronized collections come into play.
        Synchronized collection ensures that only one thread can access or modify a collection at a time,
        making it thread-safe
        * */
        /*
        IMPORTANT:
        - When using synchronized collections the methods add(), remove(), get() are automatically synchronized
        - Iteration over the synchronized collection requires  manual synchronization
         */

        List<String> list1 = new ArrayList<>();
        list1.add("Alice");
        list1.add("Bob");
        list1.add("Alex");

        List<String> synchronizedList = Collections.synchronizedList(list1);

        // Manual synchronization while iterating the synchronized list
        synchronized(synchronizedList){
            for(String name:synchronizedList){
                System.out.println(name);
            }
        }



    }
}
