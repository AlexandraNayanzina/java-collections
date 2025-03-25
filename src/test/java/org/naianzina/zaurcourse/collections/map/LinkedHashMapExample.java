package org.naianzina.zaurcourse.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String [] args){

        /*
        - LinkedHashMap saves the information about the last added and interacted elements.
        The performance a bit lower than HashMap.
         */

        Map<Integer, String> map = new LinkedHashMap<>(16, 0.75f, true);


        /*
        accessOrder - true/false-> The order how the elements will be printed out, the last first or the first element  is the first
         */
        map.put(1, "Alex");
        map.put(5, "Vika");
        map.put(8, "Olek");
        map.put(2, "Ted");

        for(Map.Entry<Integer, String> entry: map.entrySet()){
            System.out.println(entry);

        }



    }
}
