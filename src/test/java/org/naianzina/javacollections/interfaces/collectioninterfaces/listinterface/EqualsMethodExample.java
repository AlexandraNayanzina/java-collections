package org.naianzina.javacollections.interfaces.collectioninterface.listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class EqualsMethodExample {

    public static void main(String [] args){

        // equals() method
        // list1.equals(list2) implies that list1.hashCode() == list2.hashCode();

        List <String> list1 = new ArrayList <> (Arrays.asList("Alex", "Sasha", "Alexandra"));
        List <String> list2 = new ArrayList <> (Arrays.asList("Alex", "Sasha", "Alexandra"));
        List <StringBuilder> list3 = new ArrayList <> ();
        List <String> list4 = new ArrayList(Arrays.asList("Mom", "Dad"));
        list3.add(new StringBuilder("Alex"));

        Collection<String> list5 = new ArrayList <> (Arrays.asList("Alexandra", "Alex","Sasha"));


        // equals() method
        System.out.println(list1.equals(list2));
        System.out.println(list1.equals(list4));
        System.out.println(list1.equals(list5));

        // hashCode() method
        System.out.println(list1.hashCode());
        System.out.println(list2.hashCode());
        System.out.println(list3.hashCode());
        System.out.println(list4.hashCode());
        System.out.println(list5.hashCode());

        // get() method
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));

        // set() method
        System.out.println(list1.set(0, "InsertedElement1"));
        System.out.println(list1.set(1, "InsertedElement2"));
    }
}
