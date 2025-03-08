package org.naianzina.javacollections.advancedconcepts;

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorInterfaceTest {

    public static void main(String [] args){

        // Extends Iterator
        // Allows traverse List in both directions - forward and backward
        // Allows modifying elements during iteration
        // ListIterator Interface is available for any class that implements List Interface such as ArrayList, LinkedList

        /* Key Methods of ListIterator
        - hasNext(), next()
        - hasPrevious, previous() - allow to move backward in the list
        - nextIndex(), previousIndex() - returns the index
        - set(E e) - replaces the last element returned by next() or previous() with the specified element
        - add(E e) - inserts the element at the current position of the iterator
         */

        List<String> list1 = new ArrayList<>();
        list1.add("Alex");
        list1.add("Alexandra");
        list1.add("Sasha");

        ListIterator<String> iter = list1.listIterator();

        while(iter.hasNext()){
            String item = iter.next();
            System.out.print(item + " ");

        }

        System.out.println(" ");


        while(iter.hasPrevious()){
            String listItem = iter.previous();

            if(listItem.equals("Alex")){
                iter.set("AddedNewItem");
            }
        }
        System.out.print(list1 + " ");




    }
}
