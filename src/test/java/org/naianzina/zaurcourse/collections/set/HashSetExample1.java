package org.naianzina.zaurcourse.collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample1 {

    public static void main(String [] args) {
        /* HashSet
        - HashSet is a collection that keep unique elements
        - HashSet does not keep the order of adding elements
        - HashSet is based on HasMap ->
                key - element of HasSet
                value - constant (is not used)
         */

        Set<String> set = new HashSet<>();
        set.add("Alex");
        set.add("Vika");
        set.add("Stella");
        set.add("Maria");

        System.out.println(set);
        for(String element: set){
            System.out.print(element + " ");
        }
        System.out.print(" ");

        // size()

        System.out.print("The size of the set" + set.size() );


    }
}
