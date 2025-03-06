package org.naianzina.javacollections.interfaces.collectioninterfaces.deque;
import java.util.Deque;
import java.util.ArrayDeque;

public class DequeTest {

    public static void main(String [] args){

        /*
         - Deque stand for Double Ended Queue
         - Allows to add/ remove the elements from both the front and the back
         - It makes it very flexible
        */

        /* ArrayList and ArrayDeque is implemented Deque Interface
        *  ArrayList (based on the dynamic array) is faster with adding and removing elements from either end
        * LinkedList is a faster with accessing the elements because it is based on the list data structure
        * */

        Deque <Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(3);
        deque.add(5);
        deque.add(7);

        System.out.print("Initial deque: " + deque);
        System.out.println("");

        // addFirst(); addLast() methods

        deque.addFirst(100);
        deque.addLast(200);
        System.out.println("deque after addFirst(100) and addLast(200): " + deque);

        deque.removeFirst();
        deque.removeLast();
        System.out.println("deque after removeFirst() and removeFirst(): " + deque);


    }
}
