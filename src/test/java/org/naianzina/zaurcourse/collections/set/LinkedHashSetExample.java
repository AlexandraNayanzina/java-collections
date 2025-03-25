package org.naianzina.zaurcourse.collections.set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String [] args){

        /*
        LinkedHashSet keeps the information about last added/modified elements
         */
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(1);
        lhs.add(5);
        lhs.add(3);
        lhs.add(2);
        lhs.add(0);
        lhs.remove(1);

        for(Integer elem: lhs){
            System.out.println(elem);
        }
    }
}
