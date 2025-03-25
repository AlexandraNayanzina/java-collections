package org.naianzina.zaurcourse.collections.list.arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayListArraysAsListExample {

    public static void main(String [] args){

        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");

        StringBuilder [] arr = {sb1, sb2, sb3, sb4};

        List<StringBuilder> list = Arrays.asList(arr);
        System.out.println("The initial list (built on an array): ");

        for(StringBuilder elem: list){
            System.out.print(elem + " ");
        }
        System.out.println(" ");
        System.out.println("The list after modifying the initial array: ");
        arr[0].append("E");

        for(StringBuilder elem: list){
            System.out.print(elem + " ");
        }

    }
}
