package org.naianzina.javacollections.interfaces.collectioninterface;

import java.util.*;

public class SetInterfaceTest {

    public static void main(String []args) {
        // Set does NOT allow duplicates

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(4);
        set1.add(6);
        set1.add(9);
        set1.add(15);
        set1.add(36);
        set1.add(50);

        System.out.print("The set: " + set1);

        Set<Integer> set2 = new TreeSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(4);
        set2.add(10);
        set2.add(17);
        System.out.println();
        System.out.print("The TreeSet: " + set2);

        // Converting a List to the Set
        List<Integer> list1 = new ArrayList<>(Arrays.asList(2,2,4,6,4,5,6,34,57,79));
        Set <Integer> set3 = new HashSet<>();

        System.out.println();
        set3.addAll(list1);
        System.out.print("The list is converted to the Set, all duplicates are removed: " + set3);




    }
}
