package org.naianzina.javacollections.streamapi;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamExample {

    public static void main(String [] args){
        List<String> list = new ArrayList<>();
        list.add("Alex");
        list.add("Sasha");
        list.add("Alexandra");
        list.add("David");

        // using stream to sort and filter names
        List<String> filterAndSortNames = list.stream()
                .filter(name -> name.startsWith("A"))
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Filtered and sorted names" +  filterAndSortNames);


    }
}
