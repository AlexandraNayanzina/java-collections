package org.naianzina.javacollections.collectionclasses.linkedlist;

import java.util.LinkedList;

public class LinkedListTest {

    public static void main(String [] args){

        // Empty constructor
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add("d");
        System.out.println(list1);

        // Constructor from another Collection
        LinkedList<String> list2 = new LinkedList(list1);
        list2.addFirst("Alex");
        list2.addLast("Alex");
        System.out.println(list2);

        // getFirst(); getLast() method - returns the first/last element in the list
        try{
            System.out.println(list2.getFirst());
            System.out.println(list2.getLast());
            System.out.println(list2.removeFirst());
            System.out.println(list2.removeLast());
        } catch (Exception e) {

        }
        System.out.println(list2);
        //contains() method
        System.out.println(list2.contains("a"));
        System.out.println(list2.contains("Alex"));

        //add() method adds elemnt to the end of the list

        list2.add("Banana");
        System.out.println(list2);

        LinkedList<String> list3 = new LinkedList<>();
        list3.add("banana2");
        list3.add("banana3");

        // addAll() method
        list2.addAll(list3);
        System.out.println(list2);

        // set() method
        list3.set(0, "element inserted to the 0 index");
        System.out.println(list3);




    }
}
