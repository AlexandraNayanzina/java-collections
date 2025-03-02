package org.naianzina.javacollections.listinterface;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class CopyOfTest {

    public static void main(String [] args) {

        //copyOf() method creates an immutable copy of a List

        List <String> list1 = new ArrayList(Arrays.asList("Alex", "Sasha", "Alexandra"));
        List <String> list2 = List.copyOf(list1);
        list1.add(1, "ascsdz");
        list1.add("ascsdz");

        System.out.println(list2);
        System.out.println(list1);





    }
}
