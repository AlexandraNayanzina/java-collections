package org.naianzina.javacollections.advancedconcepts.immutablecollections;

import java.util.List;
import java.util.Set;
import java.util.Map;

public class ImmutableCollectionsExample1 {

    public static void main(String [] args) {

    /* Immutable Collections is a collection whose elements can NOT be modified once the collection is created.

    You can NOT add, remove, or update elements.
    Useful in the situations where we need to ensure that the data in a collection remains constant throughout
    the lifecycle of the application.
    Immutable collections are especially useful for read-only data, constants, or when you want to share data
    across  multiple thread safely without worrying about synchronization.

    *** Advantages of Immutable Collections ***

    - Thread-Safety: Immutable Collections are inherently thread-safe. This eliminates the need for synchronization
    when accessing the collection from multiple threads.

    - Data Integrity: Data remains consistent and does not get modified accidentally or maliciously.

    - Memory Efficiency: Immutable Collections are often shared between different parts of the application,
    which reduces memory usage because you don't need to create a copy of the collection.

    - Simplicity: Immutable Collections simplify code, because you don't need to handle edge cases
    involving modifications during iteration or other concurrent operations.

    *** Creating Immutable Collections in Java
    - Using factory methods introduced in Java9
    - Starting from Java9, the List, Set, Map interfaces provide static factory methods to create
    immutable collections. These methods include: List.of(); Set.of(); Map.of().

    * */
        // Creating immutable List; Set; Map

        List<String> immutableList = List.of("Apple", "Banana", "Orange");

        Set<String> immutableSet = Set.of("abc", "def", "ghi");

        Map<String, Integer> immutableMap = Map.of(
                "Alex", 20,
                "Sasha", 21,
                "Alexandra", 22
        );

        // Trying to add an element to the immutable list
        try {
            immutableList.add("Grape");
            immutableSet.add("jkl");
            immutableMap.put("Vika", 10);
        } catch (UnsupportedOperationException e) {
            e.printStackTrace();

        }

        System.out.println("Immutable list: " + immutableList);
        System.out.println("Immutable set: " + immutableSet);
        System.out.println("Immutable map: " + immutableMap);
    }
}
