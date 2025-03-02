package org.naianzina.javacollections.queueinterface;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class QueueInterfaceTest {

    public static void main (String [] args){

        // Queue represents a data structure design to hold elements prior to processing
        // Usually FIFO
        // LIFO can be implemented


        //             Behaviour when the queue is NOT empty   | Behavior when the queue is empty
        // poll()      Removes and returns head element          Returns null
        // remove()    Removes and returns head element          Throws NoSuchElementException
        // peek()      Return head element without removing      Returns null

        LinkedBlockingQueue<Integer> q1 = new LinkedBlockingQueue<>(5);

        try{
            System.out.println(" Adding the 1st element to the queue: " + q1.add(1));
            System.out.println(" Adding the 2d element to the queue: " + q1.add(2));
            System.out.println(" Adding the 3d element to the queue: " + q1.add(3));
            System.out.println(" Adding the 4th element to the queue: " + q1.add(4));
            System.out.println(" Adding the 5th element to the queue: " + q1.add(5));

        } catch(IllegalStateException e) {
            // Handle exception
        }

        System.out.println("Remove and return the head of the queue: " + q1.poll());
        System.out.println("Remove and return the head of the queue: " + q1.poll());
        System.out.println("Remove and return the head of the queue: " + q1.poll());


        System.out.println("Queue before removing a head " + q1);

        q1.remove();
        q1.remove();

        System.out.println("Queue after removing a head " + q1);

//        Queue<Object> q2 = new LinkedList<>();
//        q2.add("Alex");
//        q2.add(3);
//
//        try {
//            // pol() method - retrieves the removes the head of the queue
//            Integer num = (Integer) q2.poll();
//            System.out.println("The head of the queue is: " + num);
//        } catch(Exception e){
//            System.out.println("Caugth the ClassException" + e.getMessage());
//        }


    }
}
