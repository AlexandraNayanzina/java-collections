package org.naianzina.zaurcourse.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListExample {

    /* Queue Interface that keeps the sequence of elements
    Elements are added to the end and are taken from the beginning of the queue - FIFO
     */

    public static void main(String [] args){
        Queue<String> queue = new LinkedList<>();

       // add(); offer() methods  - adding elements to the queue

        queue.add("Alex");
        queue.add("Sasha");
        queue.add("Vika");
        queue.add("Tom");
        System.out.print("The initial queue: ");
        for(String elem: queue){
            System.out.print(elem + " ");
        }
        System.out.println(" ");
        System.out.println("The element on the top: "+ queue.element());

        // remove()
        // poll() - removes element if there is no elements does NOT throw the exception

        System.out.println("Removed element with remove(): " + queue.remove());
        System.out.println("The element on the top: " + queue.element());
        System.out.println("Removed element with poll(): " + queue.poll());
        System.out.println("The element on the top: " + queue.element());


    }
}
