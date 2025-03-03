package org.naianzina.javacollections.interfaces.collectioninterface.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceTest {

    public static void main(String [] args) {

        Map<Integer, String> map1 = new HashMap();

        // Adding key-value pair to map
        map1.put(1, "Alex");
        map1.put(2, "Alexandra");
        map1.put(3, "Sasha");
        map1.put(4, "Viktoria");
        map1.put(5, "Olivia");

        System.out.println(map1);

        // Getting the value by the key
        System.out.println("Get the value by the key: " + map1.get(1));
        System.out.println("Get the value by the key: " + map1.get(2));
        System.out.println("Get the value by the key: " + map1.get(3));


        // removing the value by the key
        System.out.println("Remove the value by the key: " + map1.remove(3));
        System.out.println(map1);

        // Check if the key exists
        System.out.println("Check if the key exists: " + map1.containsKey(5));

        // Check if the value exists
        System.out.println("Check if the value exists: " + map1.containsValue("Alex"));

        // get the size of the map
        System.out.println("Get the map size: " + map1.size());

        // Check if the map is empty
        System.out.println("Check if the map is empty: " + map1.isEmpty());









    }
}
