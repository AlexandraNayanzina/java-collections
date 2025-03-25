package org.naianzina.zaurcourse.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIntroduction {

    public static void main(String [] args){

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("cherry");

        System.out.println("Element 0 is: " + linkedList.get(0));
        linkedList.add(0, "star fruit added on 0 position");
        linkedList.forEach(System.out::println);

        Iterator<String> iter = linkedList.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());

        }





    }
}
