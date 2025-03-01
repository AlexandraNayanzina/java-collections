package org.naianzina.javacollections.listinterface;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String [] args) {


        // Normal Order of Iterator
        List<Integer> list1 = new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
        ListIterator<Integer> listIter = list1.listIterator();

        System.out.print(listIter.next());
        while(listIter.hasNext()){
            System.out.print(", " + listIter.next());
        }
        System.out.println();

        // Reverse Order of Iterator

        while(listIter.hasPrevious()){
            System.out.print(listIter.previous());
        }

        // Iterator with index
        ListIterator <Integer> listIter2 = list1.listIterator(list1.size() / 2);
        while (listIter2.hasNext()){
            int prev = listIter2.previous();
            System.out.println(prev);
//          System.out.println(",The index of: " + listIter2.next() + "element is: " + listIter2.nextIndex());
        if(prev == 3){
//            listIter2.remove();
            listIter2.set(100);
            listIter2.add(100);
            break;
            }
        }

        System.out.println(list1);


    }

}
