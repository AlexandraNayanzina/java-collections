package org.naianzina.javacollections.advancedconcepts.concurrentcollections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

    public static void main(String [] args) {
        BlockingQueue<String> blQueue = new ArrayBlockingQueue<>(3);


        // adding element to the queue concurrently
        // Producer Thread
        Runnable producer = () -> {
            try {
                blQueue.put("Alex");
                blQueue.put("Sasha");
                blQueue.put("Alexandra");
                System.out.println("produced all items");
            } catch (Exception e) {
                e.printStackTrace();

            }
        };

           // Consumer thread
            Runnable consumer = () -> {
                try {
                    Thread.sleep(1000);
                    System.out.println("Consumed: " + blQueue.take());
                    System.out.println("Consumed: " + blQueue.take());
                    System.out.println("Consumed: " + blQueue.take());

                } catch (Exception e) {
                    e.printStackTrace();
                }
            };

            Thread producerThread = new Thread(producer);
            Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();

            // wait for both thread to finish

        try {
            producerThread.join();
            consumerThread.join();
        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}

