package org.naianzina.javacollections.collectionclasses;
import java.util.HashSet;

public class HashSetTest {

    public static void main (String [] args){

        // The Set is an unordered collection of unique elements
        // HashSet uses Hash Table as data structure
        // The order of elements is NOT guaranteed

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("apple");
        hashSet.add("apple");
        hashSet.add("banana");

        System.out.println(hashSet);




    }
}
