package org.naianzina.javacollections.advancedconcepts.concurrentcollections;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {

    public static void main(String [] args) {

        /* CopyOnWriteArrayList is a Concurrent Collection
        - used in case of many reads and a few writings
        * */

        List<String> list1 = new CopyOnWriteArrayList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("cherry");

        System.out.println("Initial list: " + list1);

        Runnable task1 = () -> list1.add("melon");
        Runnable task2 = () -> list1.add("grape");

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();

        // both threads finish execution

        try{
            thread1.join();
            thread2.join();
        }
        catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("Updated list: " + list1);
    }
}
