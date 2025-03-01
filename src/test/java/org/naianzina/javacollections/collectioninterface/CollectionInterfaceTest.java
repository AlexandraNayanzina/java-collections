package org.naianzina.javacollections.collectioninterface;

import java.util.ArrayList;
import java.util.List;

public class CollectionInterfaceTest {

    public static void main(String [] args) {

        ArrayList<Integer> intArray = new ArrayList();
        List<String> strArray = new ArrayList();
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        intArray.add(4);
        System.out.println(intArray);
        System.out.println("size() value is: " + intArray.size());
        System.out.println("isEmpty() value is: " + intArray.isEmpty());
        System.out.println("isEmpty() value is: " + strArray.isEmpty());
        System.out.println("isEmpty() value is: " + intArray.contains(4));
        System.out.println("isEmpty() value is: " + intArray.contains(6));
        // remove() - removing by index
        intArray.remove(1);
        Integer [] intToArray = intArray.toArray(new Integer[0]);
        for(Integer a: intToArray) {
            System.out.println(a);
        }


        // Example with Strings
        List <String> myStringColl = new ArrayList();
        myStringColl.add("Alex");
        myStringColl.add("Sasha");
        myStringColl.add("Alexandra");

        for(String a:myStringColl){
            System.out.println(a);
        }

    }
}
