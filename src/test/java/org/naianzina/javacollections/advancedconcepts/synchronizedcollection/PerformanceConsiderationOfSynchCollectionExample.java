package org.naianzina.javacollections.advancedconcepts.synchronizedcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PerformanceConsiderationOfSynchCollectionExample {

    public static void main(String [] args){
        List<Integer> list1 = new ArrayList<>();

        List<Integer> syncList1 = Collections.synchronizedList(list1);

        // adding  one million elements with synchronization
        long start = System.currentTimeMillis();

        for(int i=0; i < 1_000_000; i++){
            syncList1.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Adding one million elements with synchronization took: " + (end - start) + "ns");


        List<Integer> list2 = new ArrayList<>();

        // adding  one million elements without synchronization
        long start1 = System.currentTimeMillis();

        for(int i=0; i < 1_000_000; i++){
            list2.add(i);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("Adding one million elements without synchronizat took: " + (end1 - start1) + "ns");


    }
}
