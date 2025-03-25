package org.naianzina.zaurcourse.collections.list.arraylist;

import java.util.ArrayList;

public class ArrayListRetainAllRemoveAllExamples {

    public static void main(String[] args) {

        // removeAll(Collection); retainAll(Collection)

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Alex");
        list1.add("Sasha");
        list1.add("Alexandra");
        list1.add("Vika");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Alex");
        list2.add("Tom");
        list2.add("Jerry");
        list2.add("Brent");

        // list1.removeAll(list2);
        list1.retainAll(list2);
        list1.forEach(System.out::println);
    }
}
