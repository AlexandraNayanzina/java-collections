package org.naianzina.javacollections.iterable_interface;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableInterfaceTest1 {

    public static void main(String[] args) {
        List<String> fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");

        // Creating an Iterator
        // hasNext(); next(); remove(); forEachRemaining() methods
        Iterator<String> it = fruits.iterator();
        it.forEachRemaining(elem -> System.out.println(elem));
//        while (it.hasNext()) {
//            String nextFruit = it.next();
//            if ("banana".equals(nextFruit)) {
//                it.remove();
//            }
//
//        }
//        System.out.println(fruits);

        // forEach() method
        // Using Lambda Expression

        //fruits.forEach(fruit -> System.out.println());

        // Using Method Reference
        //fruits.forEach(System.out::println);

        Iterator <String> it2 = fruits.iterator();
        System.out.println("Printing a collection using forEachRemaining() method");
        //it2.forEachRemaining(System.out::println);
        if(it2.hasNext()){
            //it2.next();
            System.out.println(it2.next());
            System.out.println(it2.next());
            System.out.println(it2.next());
        }

    }
}
