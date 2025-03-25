package org.naianzina.zaurcourse.collections.list.arraylist;

import java.util.ArrayList;

public class ArrayListToArrayExample{

public static void main(String [] args) {

    ArrayList<String> list = new ArrayList<>();

    list.add("apple");
    list.add("banana");
    list.add("pear");

    Object[] array1 = list.toArray();
    String[] array2 = list.toArray(new String[7]);
    System.out.println(array1.toString());
    for(String elem: array2){
System.out.println(elem + " ");
    }


}


}
