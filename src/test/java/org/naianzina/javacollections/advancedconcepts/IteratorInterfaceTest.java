package org.naianzina.javacollections.advancedconcepts;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;


public class IteratorInterfaceTest {

    public static void main(String [] args){


        /*
        - Iterator allows to traverse through collection only in a FORWARD-only direction
        - Comonly used with List, Set

        Key methods:
        - hasNext() - Checks if there is a next element in the collection.Returns true if there is,
        and false if we have reached the end

        - next() - Returns the next element ub the iteration. Throws a NoSuchElementException if there are no more elements

        - remove() - Removes the last element returns by the Iterator.Should be called after next() otherwise the
        IlligalStateException is thrown
         */


        List <String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        Iterator<String> iter = names.iterator();

        while(iter.hasNext()){
            String name = iter.next();
            System.out.print(name + " ");

            if(name.equals("Alice")){
                iter.remove();
            }
        }

         System.out.println("");
         System.out.println("Updated list: " + names);





    }
}
