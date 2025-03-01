package org.naianzina.javacollections.listinterface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;


public class OfTest {

    public static void main(String [] args) {


        // Of() method returns an unmodifiable list containing one element
        List <String> fruits = List.of("Banana", "Apple", "Orange");
        System.out.println(fruits);



    }

}

