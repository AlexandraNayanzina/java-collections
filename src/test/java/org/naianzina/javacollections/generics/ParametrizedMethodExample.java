package org.naianzina.javacollections.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class ParametrizedMethodExample {

    public static void main(String [] args){


        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 8, 6));
        ParametrizedMethod inst = new ParametrizedMethod();

        Integer a = inst.getSecondElement(arrList);
        System.out.println(a);



    }
}


class ParametrizedMethod{

    public static <T> T getSecondElement(ArrayList<T> arrList){
        return arrList.get(1);

    }
}