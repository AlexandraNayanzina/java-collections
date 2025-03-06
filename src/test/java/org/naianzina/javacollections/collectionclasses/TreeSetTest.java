package org.naianzina.javacollections.collectionclasses;
import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetTest {

    public static void main(String [] args){

        /* Key Characteristics of TreeSet
        * 1. Sorted Order
        * 2. No duplicates
        * 3. Navigable Set Interface
        * 4. Not allowed to add  ull element
        * 5. Performance: adding, removing, searching elements - O(log n)
        * */


        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(20);
        treeSet.add(40);
        treeSet.add(50);

        System.out.println("Tree in natural order: " + treeSet);

        TreeSet<Integer> treeSet1 = new TreeSet(Comparator.reverseOrder());
        treeSet1.add(10);
        treeSet1.add(30);
        treeSet1.add(20);
        treeSet1.add(40);
        treeSet1.add(50);
        System.out.println("Tree in reverse order: " + treeSet1);


        // lower() method returns the greatest element in this set less than or equal to the given element
        System.out.println("lower(20) applied to the set" + treeSet1.lower(20));

        // floor() method returns the least element in this set greater than or equal to the given
        System.out.println("floor(20) applied to the set" + treeSet1.floor(20));

        //ceiling() method returns the least element in the set strictly greater than the given element
        System.out.println("ceiling(20) applied to the set" + treeSet1.ceiling(20));

        // headSet() returns a view of the portion of the set whose elements are greater than given
        System.out.println("headSet(20) applied to the set" + treeSet1.headSet(30));

        // headSet() returns a view of the portion of the set whose elements are greater than given
        System.out.println("tailSet(20) applied to the set" + treeSet1.tailSet(30));


        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.add("apple");
        treeSet2.add("mango");
        treeSet2.add("banana");
        treeSet2.add("ice-cream");
        treeSet2.add("grape");


        // subSet() returns a view of the portion of the set whose elements are strictly less than given
        System.out.println("subSet() applied to the set" + treeSet2.subSet("apple","grape"));



    }
}
