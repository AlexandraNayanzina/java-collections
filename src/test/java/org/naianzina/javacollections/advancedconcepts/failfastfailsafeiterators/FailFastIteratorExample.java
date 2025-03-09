package org.naianzina.javacollections.advancedconcepts.failfastfailsafeiterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastIteratorExample {

    public static void main(String [] args){

        /* FAIL-FAST Iterator
        - Throws an ConcurrentModificationException when the collection is structurally modified.
        Structurally modified means adding or removing element which cases changing the size of the collection
        - Safe-fast is the default behaviour for most of the iterators provided by Collections Framework
       */


        List<String> list1 = new ArrayList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("cherry");

        Iterator<String> iter = list1.iterator();

        while(iter.hasNext()){
            String item = iter.next();
            System.out.println(iter.next());

            if(item.equals("apple")){
                list1.add("melon"); // Trying to modify the collection itself while the iteration
                // It causes the ConcurrentModificationException

            }

        }

    }
}
