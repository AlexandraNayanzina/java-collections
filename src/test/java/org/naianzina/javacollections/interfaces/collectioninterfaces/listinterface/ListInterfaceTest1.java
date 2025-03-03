package org.naianzina.javacollections.interfaces.collectioninterface.listinterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInterfaceTest1 {

    public static void main(String[] args) {

        // List is a collection that maintains a specific sequence of elements
        // ordered collection
        // allows duplicates

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        // size() method
        System.out.println("The size of the list is: " + list1.size());
        System.out.println("Is the list contains an element '1': " + list1.contains(1));

        // toArray() method
        Integer [] arr = list1.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr));

        // add(index, value) method
        list1.add(0, 100);
        System.out.println("The list: " + list1);

        // remove(index)
        System.out.println("Removing the [0] element from the list: "+ list1.remove(0));

        // addAll() method
        List <String> list2 = new ArrayList<>();
        List <String> list3 = new ArrayList<>();

        list2.add("Alex");
        list2.add("Alexandra");
        list3.add("Vika");
        list3.add("Viktoria");

        System.out.println("Lists are added, list1+list2: " + list2.addAll(list3) + list2);

        // removeAll()
        List<Integer> list4 = new ArrayList<>();
        list4.add(10);
        list4.add(20);
        list4.add(30);
        list4.add(40);
        list4.add(50);
        list4.add(50);
        list4.add(50);
        List<Integer> needToRemove = new ArrayList<>();
        needToRemove.add(50);
        needToRemove.add(40);
//        System.out.println(list4.removeAll(needToRemove));
//        System.out.println(list4);

        // retainAll() method
        List<Integer> retainArr = new ArrayList<>();
        retainArr.add(50);
        retainArr.add(40);
        System.out.println(list4.retainAll(retainArr));
        System.out.println(list4);



    }

}
