package org.naianzina.javacollections.listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReplaceAllExample {

    // replaceAll() method
    public static void main(String [] args){

        List<String> list1 = new ArrayList<>(Arrays.asList("Alex", "Sasha"));

        System.out.println("The list before replace: " + list1);
        list1.replaceAll(String:: toUpperCase);
        System.out.println("The list after replace: " + list1);


    }
}
