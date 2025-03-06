package org.naianzina.javacollections.collectionclasses;
import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {

    public static void main(String [] args){

        /* LinkedHashSet is an extension of HashSet
         The only diff - it maintains INSERTION ORDER
         If you want the unique property of a Set but also need to preserve the order
         in which elements were added, LinkedHashSet is a way to go
        */

        Set <String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("apple");
        linkedHashSet.add("banana");
        linkedHashSet.add("apple");
        linkedHashSet.add("grape");

        System.out.println(linkedHashSet);




    }
}
