package org.naianzina.zaurcourse.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {

    public static void main(String [] args){

        /*
        - Priority Queue is a queue where elements are processed by:
           -> natural order
           -> or order described in Comparable; Comparator
        - First is processed the element with the highest priority
         */

        Queue<Integer> q1 = new PriorityQueue<>();
        q1.add(6);
        q1.add(5);
        q1.add(3);
        q1.add(9);

        System.out.println(" Initial queue: ");
        for(Integer elem: q1){
            System.out.println(elem + " ");
        }
        System.out.println("The top element with the highest priority: " + q1.peek());
        System.out.println("Removed element with remove()" + q1.remove());
        System.out.println("Top element: " + q1.peek());
    }

}
