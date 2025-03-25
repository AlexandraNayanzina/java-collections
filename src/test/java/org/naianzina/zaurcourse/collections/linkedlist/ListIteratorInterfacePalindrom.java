package org.naianzina.zaurcourse.collections.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorInterfacePalindrom {

    public static void main(String [] args) {
        // madam - palindrome example

        String s = "madam";
        List<Character> charsList = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            charsList.add(ch);
        }

        ListIterator<Character> iter = charsList.listIterator();
        ListIterator<Character> reverseIter = charsList.listIterator(charsList.size());
        boolean isPalindrom = true;
        while(iter.hasNext() && reverseIter.hasPrevious()){
            if(iter.next() != reverseIter.previous()){
                isPalindrom = false;
                break;
            }
        }
        if(isPalindrom){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }


    }

}
