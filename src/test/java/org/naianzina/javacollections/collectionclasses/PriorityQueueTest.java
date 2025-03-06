package org.naianzina.javacollections.collectionclasses;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


public class PriorityQueueTest {

    public static void main(String [] args){

        /*
        - Implements Queue Interface
        - Queue is a collection designed to holding elements prior to processing
        - Queue typically order elements in a FIFO or custom comparator
        - Priority Queue works with a priority
        - The elements with the highest priority always at the head of the queue
        - By default this is a min-heap data structure meaning the smallest element always at the top of the heap
        - By default the elements are ordered in ascending order
        */

        PriorityQueue<Integer> prQueue1 = new PriorityQueue<>();
        prQueue1.add(3);
        prQueue1.add(2);
        prQueue1.add(1);
        prQueue1.add(4);

        while(!prQueue1.isEmpty()){
            System.out.print(prQueue1.poll()); // The elements are sorted
        }

        System.out.println("");

        PriorityQueue<Integer> prQueue2 = new PriorityQueue<>(Comparator.reverseOrder());
        prQueue2.add(10);
        prQueue2.add(30);
        prQueue2.add(20);
        prQueue2.add(40);
        while(!prQueue2.isEmpty()){

            System.out.print(prQueue2.poll() + " ");
        }

//        System.out.println("The initial priority queue: " + prQueue1);
//        System.out.println("Applying a poll() method: " + prQueue1.poll());
//        System.out.println("The queue after poll() priority queue: " + prQueue1);









    }
}
