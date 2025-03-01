package org.naianzina.javacollections.listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IndexOfExample {

    public static void main(String [] args) {

        List<Integer> list1 = new ArrayList(Arrays.asList(1, 2 ,3, 4, 5, 6, 1, 2));
        System.out.println(list1.indexOf(20));
        System.out.println(list1.indexOf(2));
        System.out.println(list1.lastIndexOf(20));
        System.out.println(list1.lastIndexOf(2));
    }
}
