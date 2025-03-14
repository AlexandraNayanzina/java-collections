package org.naianzina.javacollections.advancedconcepts.immutablecollections;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ImmutableCollectionFromMutableExample {

    /* The differences between Immutable and Unmodifiable Collections
    - Immutable Collection is one that can not be changed after it's creation
    - Unmodifiable Collection is a wrapper around a mutable collection that prevents direct modification
    but still reflects changes made to the original collection
    For true immutability use 
    *
    * */

    public static void main(String [] args){

        List<String> mutableList  = new ArrayList<>();

        mutableList.add("orange");
        mutableList.add("apple");
        mutableList.add("banana");

        // Creating an immutable view of the mutable list

        List<String> immutableList = Collections.unmodifiableList(mutableList);

        System.out.println(immutableList);


        // Trying to modify the immutable collection will trow an Exception

//        try{immutableList.add("plum");}
//        catch(Exception e){
//            e.printStackTrace();
//        }

        mutableList.add("added fruit");
        System.out.println("Original mutable list: " + mutableList);
        System.out.println("Updated immutable list: " + immutableList);


    }
}
