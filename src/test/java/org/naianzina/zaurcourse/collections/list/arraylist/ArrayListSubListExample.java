package org.naianzina.zaurcourse.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSubListExample {

    public static void main(String [] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Alex");
        list.add("Sasha");
        list.add("Tom");
        list.add("Jerry");
        list.add("Ted");
        list.add("ben");

        List<String> subList = list.subList(1, 3);
        subList.add("added to the view of list - sublist");
//        list.add("added to the initial list");
        System.out.println(subList);
    }
}
