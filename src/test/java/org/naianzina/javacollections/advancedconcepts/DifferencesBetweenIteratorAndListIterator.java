package org.naianzina.javacollections.advancedconcepts;

import java.util.*;

public class DifferencesBetweenIteratorAndListIterator {

    public static void main(String [] args){

        /* 1. Type of collections
        - Iterator can be used with any type of collection: Set, Map, List
        - ListIterator traverses the List based collections: ArrayList, LinkedList, Vector, Stack
        - ListIterator can NOT be used with: Set, Queue, Map

        2. Direction of Traverse: One-way vs Two-ways
        - Iterator traverses collection forward-only
        - ListIterator traverses collection forward and backward

        3. Ability to modify the collection
        - Iterator provides limited control - only remove(), it can be done right after calling next()
        - ListIterator allows adding, and replacing elements while iterating.

        4. Index access
        - Iterator does not provide access to the index of the current element
        - ListIterator provides access to the next and previous elements using nextIndex() and previousIndex()

        5. Collection type restrictions
        - Iterator can be used with any collections that implements Collection Interface
        - ListIterator is restricted to Lists: ArrayList, LinkedList
        * */

        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("apple");
        arrList.add("banana");
        arrList.add("cherry");

        ListIterator<String> iter1 = arrList.listIterator(arrList.size());
        System.out.println("ArrayList: " + arrList);
        System.out.println("ListIterator - backward traversing");

        while(iter1.hasPrevious()){
            int index = iter1.previousIndex();
            String item = iter1.previous();
            System.out.println("index: " + index+ " value: " + iter1.previous() + " " );
            if(item.equals("cherry")){
                iter1.add("InsertedElement");

            }
        }
        System.out.println("Updated ArrayList: " + arrList);

        Set<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("cherry");

        System.out.println(" ");
        System.out.println("Set: " + set1);
        System.out.println("ListIterator - forward traversing");

        Iterator<String> iter2 = set1.iterator();

        while(iter2.hasNext()){
            String item = iter2.next();
            System.out.print(item + " ");

            if(item.equals("apple")){
                iter2.remove();
            }
        }
        System.out.println("Updated Set : " + set1);



    }
}
