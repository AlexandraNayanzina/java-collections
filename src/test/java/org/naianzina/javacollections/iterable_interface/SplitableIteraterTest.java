package org.naianzina.javacollections.iterable_interface;

import java.util.ArrayList;
import java.util.Spliterator;

public class SplitableIteraterTest {

    // Spliterater Interface

    public static void main(String [] args){

        ArrayList<Integer> myNums = new ArrayList();
        for (int i = 0; i < 10; i++){
            myNums.add(i * 2);
        }
        System.out.println(myNums);

        Spliterator<Integer> mySpliterator = myNums.spliterator();
        System.out.println("Spliterator.estimateSize() value is: " + mySpliterator.estimateSize());
    }
}
