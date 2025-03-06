package org.naianzina.javacollections.collectionclasses;

import java.util.Stack;

public class StackTest {

    public static void main(String [] args){

        /*
         Stack extends Vector, so all the thread-safe characteristics of the Vector apply to Stack.
         However, Stack class introduces new methods - push(); pop() to remove and return the top element;
         peek() to get the top element without removing it.
     */

            Stack<String> stack1 = new Stack<>();
            stack1.add("apple");
            stack1.add("banana");
            stack1.add("cherry");
            stack1.add("melon");

            System.out.println(" The stack elements: " + stack1);

            // peek() method retrieves the top element
            System.out.println(" The top element: " + stack1.peek());

            // pop() method pop element from the stack
        System.out.println(" Pop the element: " + stack1.pop());
            System.out.println(" The stack after popping: " + stack1);






    }


}
