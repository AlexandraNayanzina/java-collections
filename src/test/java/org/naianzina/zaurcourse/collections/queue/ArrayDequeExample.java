package org.naianzina.zaurcourse.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

    public static void main(String [] args) {
        /*
        Deque Interface - double ended queue -> FIFO; LIFO
        - ArrayDeque and LinkedList are implement Deque Interface
         */

        Deque<Integer> deq = new ArrayDeque<>();

        // addFirst(); addLst(); odderFirst(); addLast()
        deq.addFirst(5);
        deq.addLast(15);
        deq.addFirst(4);
        deq.offerFirst(3);
        deq.offerLast(16);


        for(Integer elem: deq){
            System.out.print(elem + " ");
        }
        System.out.println(" ");
        System.out.println("First element getFirst(): " + deq.getFirst() );
        System.out.println("Last element getLast(): " + deq.getLast() );
        System.out.println("First element peekFirst() " + deq.peekFirst() );
        System.out.println("Last element + peekLast() " + deq.peekLast() );

        //removeFirst(); removeLast(); pollFist(); pollLast()

        //getFirst(); getLast(); peekFirst(); peekLast();





    }
}
