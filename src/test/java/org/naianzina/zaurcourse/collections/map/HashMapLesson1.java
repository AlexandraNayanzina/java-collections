package org.naianzina.zaurcourse.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapLesson1 {
    public static void main(String [] args){

        /* HashMap
    - Implements Map Interface
    - elements: (key, value)
    - don't keep the order how the elements were added
    - read/search/insert/delete works for O(log(n))
    - the complexity in the worst scenarios  - O(n)
    - key can be null
    - key should be unique
    - values can be not unique, can be null
    */

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(100, "Alex");
        map1.put(200, "Sasha");
        map1.put(300, "Ted");
        map1.put(400, "Bob");
        map1.putIfAbsent(500, "ExtraBob");
        map1.put(100, "AlexOverridden");
        map1.put(null, "null key element");
        map1.put(null, null);

        System.out.println(map1);
        System.out.println(map1.get(300));
        map1.remove(300);
        System.out.println(map1);
        System.out.println(map1.containsValue("Sasha"));
        System.out.println(map1.containsKey(1005));
        System.out.println(map1.keySet());
        System.out.println(map1.values());






    }
}
