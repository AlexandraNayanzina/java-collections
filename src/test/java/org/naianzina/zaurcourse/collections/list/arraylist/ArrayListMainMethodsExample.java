package org.naianzina.zaurcourse.collections.list.arraylist;

import java.util.ArrayList;

public class ArrayListMainMethodsExample {


    public static void main(String [] args){

        ArrayList<Integer> arrList = new ArrayList<>();

        // add(value)
        arrList.add(5);
        arrList.add(6);
        arrList.add(7);

        System.out.println("Initial ArrayList:  ");

        // add(index, value)
        arrList.add(0, 4);

        System.out.println("Element of array with index 0:  " + arrList.get(0));
        System.out.println("Replace element with index 0 to 10:  " + arrList.set(0, 10));
        System.out.println("Remove 0 element  " + arrList.remove(0));
        System.out.println(" ");

        for(Integer elem: arrList){
            System.out.print(elem + " ");
        }



    }
}
