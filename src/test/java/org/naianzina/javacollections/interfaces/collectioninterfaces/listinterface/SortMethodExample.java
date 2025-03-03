package org.naianzina.javacollections.interfaces.collectioninterface.listinterface;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class SortMethodExample {

    public static void main(String[] args) {

        // Sorting in Natural order
        List<String> list1 = new ArrayList<>(Arrays.asList("Banana", "Orange", "Apple"));
        System.out.println("The list before Natural Order sorting");
        System.out.println(list1);
        list1.sort(null);
        System.out.println(list1);

        // Sorting in Reverse Order
        list1.sort(Comparator.reverseOrder());
        System.out.println("The list before Reverse Order sorting");
        System.out.println(list1);

    }

}
