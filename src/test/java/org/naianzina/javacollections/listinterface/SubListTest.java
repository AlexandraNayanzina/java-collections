package org.naianzina.javacollections.listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class SubListTest {

    public static void main(String [] args) {


        // Normal Order of Iterator
        List<Integer> list1 = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));

        List <Integer> newList = list1.subList(4,6);
        System.out.println(newList);


    }

}
