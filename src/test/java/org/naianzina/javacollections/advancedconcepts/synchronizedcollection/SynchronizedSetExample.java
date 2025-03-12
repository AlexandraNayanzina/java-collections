package org.naianzina.javacollections.advancedconcepts.synchronizedcollection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SynchronizedSetExample {

    public static void main(String [] args){

        Set<String> set1 = new HashSet<>();
        set1.add("Alex");
        set1.add("Sasha");
        set1.add("Alexandra");

        Set<String> syncSet = Collections.synchronizedSet(set1);

        synchronized(syncSet){
            for(String name: syncSet){
                System.out.println(name);

            }
        }

    }
}
