package org.naianzina.javacollections.collectionclasses.arraylist;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class ArrayListTest {

    public static void main(String [] args){

        // ArrayList Constructors
        // 1. With the initial capacity (the ArrayList will be resizable)
        ArrayList<String> fruits = new ArrayList<>(5);

        fruits.add("apple");
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("apple");
        System.out.println("1. Creating an ArrayList with setting an initial capacity");
        System.out.println(fruits);

        // 2. With no initial capacity - the default size is 10 elements
        ArrayList<String> arrList1 = new ArrayList<>();
        arrList1.add("banana");
        arrList1.add("banana");
        arrList1.add("banana");
        arrList1.add("banana");
        System.out.println("2. Creating an ArrayList with default initial capacity");
        System.out.println(arrList1);

        // 3. Creating an Arraylist from another collection

        HashSet<String> set1 = new HashSet();
        set1.add("yellow");
        set1.add("blue");
        set1.add("while");

        ArrayList<String> arrayListColors = new ArrayList<>(set1);
        System.out.println("3. Creating an ArrayList from another Collection");
        System.out.println(arrayListColors);

        // ArrayList Methods
        System.out.println("ArrayList methods");

        System.out.println("1. trimToSize() method");
        System.out.println("The initial size of the arrayListColors ArrayList is: " + arrayListColors.size());

        arrayListColors.trimToSize();
        System.out.println("The size after optimization with trimToSize(): " + arrayListColors.size());
    }
}
