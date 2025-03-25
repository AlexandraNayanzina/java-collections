package org.naianzina.zaurcourse.collections.set;

import java.util.HashSet;

public class HashSetExample2 {

    public static void main(String [] args){
        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(3);
        hs1.add(4);
        hs1.add(5);
        HashSet<Integer> hs2 = new HashSet<>();
        hs2.add(4);
        hs2.add(5);
        hs2.add(6);
        hs2.add(7);
        hs2.add(8);

        HashSet<Integer> unionHashSet = new HashSet<>();
        // addAll() method  is a "union" math operation

        System.out.println("Union of two sets");
        unionHashSet.addAll(hs2);
        for(Integer elem: unionHashSet){
            System.out.print(elem + " ,");
        }

        // retainAll() method is a "intersection" of two sets
        HashSet<Integer> intersectionHashSet = new HashSet<>();
        intersectionHashSet.addAll(hs2);
        intersectionHashSet.retainAll(hs1);

        System.out.println(" ");
        System.out.println("Intersection of hs1 and hs2");
        for(Integer elem: intersectionHashSet){
            System.out.print(elem + " ");
        }








    }
}
