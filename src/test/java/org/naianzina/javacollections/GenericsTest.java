package org.naianzina.javacollections;

import java.util.ArrayList;
import java.util.Collection;

public class GenericsTest {

    public static void main(String[] args) {

        // Generics allow to create classes, interfaces, and methods with a placeholder to type.
        // The type can be specified later.This provides type safety and reduces the need for casting

        int[] arr = new int[5];
        char[] charsArr = new char[5];

        // Create a variable type of Collection
        Collection collectionArr = new ArrayList();
        collectionArr.add(5);
        collectionArr.add("Alex");
        System.out.println(collectionArr.toString());

        Collection <Integer> collection2 = new ArrayList();
        collection2.add(7);

        Collection <String> coll3 = new ArrayList();
        coll3.add("Alex");
    }

}
