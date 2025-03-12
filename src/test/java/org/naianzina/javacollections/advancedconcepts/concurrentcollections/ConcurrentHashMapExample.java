package org.naianzina.javacollections.advancedconcepts.concurrentcollections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {

    public static void main(String [] args){

        /* Concurrent Collections are designed to be used in highly concurrent, multi-threaded environment.
        * They differ from the synchronized collections in that they allow for much better scalability
        * and performance, even when accessed by multiple thread simultaneously.
        * Synchronized collections like Collections.synchronizedList() or Collections SynchronizedMap()
        * use coarse-grained locks, which can lead to performance bottlenecks when many threads are trying
        * to access or modify the collection.
        * In contrast, concurrent collections use techniques like lock stripping, non-blocking algorithms,
        * optimistic concurrency to minimize  contention and improve throughput.
        * */

        /* Key types of Concurrent Collections
        1. ConcurrentHashMap
        2.
        *
        * */

        ConcurrentHashMap <String, Integer> concurrentMap = new ConcurrentHashMap<>();
        // adding element to the map

        concurrentMap.put("Alice", 21);
        concurrentMap.put("Bob", 20);
        concurrentMap.put("Ted", 22);

        // retrieve
        System.out.println("Alice's age: " + concurrentMap.get("Alice"));


        // adding a new element concurrently
        Runnable task1 = () -> concurrentMap.put("David", 24);
        Runnable task2 = () -> concurrentMap.put("Make", 25);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();

        // ensuring both threads finish execution

        try{
            thread1.join();
            thread2.join();

        }catch(Exception e){
            e.printStackTrace();

        }
        System.out.println("Final map: " + concurrentMap);





    }


}
