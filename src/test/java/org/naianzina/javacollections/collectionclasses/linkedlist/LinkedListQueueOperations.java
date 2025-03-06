package org.naianzina.javacollections.collectionclasses.linkedlist;

import java.util.LinkedList;
import java.util.Arrays;
import java.util.ListIterator;

public class LinkedListQueueOperations {

    public static void main(String [] args){
        LinkedList<String> list1 = new LinkedList(Arrays.asList("Apple", "Banana", "Orange"));
        LinkedList<String> emptyList = new LinkedList<>();

        System.out.println("The list1: " + list1);

        // peek() method retrieves but does not remove the first element of the list
        // returns null if the list is empty
        System.out.println(list1.peek());
        System.out.println(emptyList.peek());
        System.out.println("The initial list: " + list1);

        // element() method return the first element of the list
        // returns NoSuchElementException if list is empty
        //System.out.println(emptyList.element());
        System.out.println("The emptyList: " + emptyList);

        // poll() method retrieves and removes the first element of the LinkedList
        System.out.println(list1.poll());
        System.out.println("The list1 after poll(): " + list1);

        // remove() method removes the head
        // throws NoSuchElementException if the list is empty
        System.out.println(list1.remove());
        System.out.println("The list1 after remove(): " + list1);

        list1.add("Grapes");
        list1.add("Berries");
        list1.add("Grapes");
        System.out.println("Updated list1: " + list1);

        // offer() method adds the element as the tail
        list1.offer("Adding a tail element");
        System.out.println("Updated list1: " + list1);

        // offerLast() adds the element at the end - applicable in Deque


        //pollLast() method retrieves and removes the last element of the list
        System.out.println("pollLast() to list1" + list1.pollLast());
        System.out.println("The list1 after pollLast(): " + list1);

        // pop() method pops an element from the stack represented by the list
        // In other words retrieves and returns the first element of thw list
        System.out.println("pop() to list1: " + list1.pop());
        System.out.println("The list1 after pop(): " + list1);

        //removeFirstOccurrence() method removes the first occurrence of the specified element from the list

        list1.add("Grapes");
        list1.add("Grapes");
        list1.add("Grapes");
        System.out.println(list1);
        System.out.println("pop() to list1: " + list1.removeFirstOccurrence("Grapes"));
        System.out.println("The list1 after removeFirstOccurrence('Grapes'): " + list1);


        // listIterator() method returns the list-iterator of the elements in the list
        //starting from the index
        ListIterator<String> list1Iter = list1.listIterator(1);
        System.out.println("Iterating on the list with listIterator() method");
        while(list1Iter.hasNext()){
            System.out.print(list1Iter.next() + " ");

        }



    }
}
