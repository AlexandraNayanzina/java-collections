package org.naianzina.javacollections.collectioninterface;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterfaceTest1 {

    public static void main (String [] args){

        Collection<Integer> evens = new ArrayList();
        evens.add(2);
        evens.add(6);
        evens.add(4);


        ArrayList <Integer>  nums = new ArrayList();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);

        // containsAll() method
        System.out.println("Is nums contacinsAll() evens: " + nums.containsAll(evens));
        // addAll() method
        nums.addAll(evens);
        System.out.println(nums);

        // removeAll()
        // retainAll()
        nums.retainAll(evens);
        System.out.println(nums);

        // equals()

        Collection <String> col1 = new ArrayList();
        Collection <String> col2 = new ArrayList();
        col1.add("Alex");
        col1.add("Sasha");
        col2.add("Alex");
        col2.add("Sasha");
        System.out.println("Is cola1 equals col2: " + col1.equals(col2));

        // hashCode() method
        System.out.println("The hashCode of col1 is: " + col1.hashCode());
        System.out.println("The hashCode of col1 is: " + col2.hashCode());
        System.out.println("The hashCode of col1 is: " + nums.hashCode());
    }
    }


