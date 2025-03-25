package org.naianzina.zaurcourse.collections.lambda;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierExample2 {

    public static ArrayList<Integer> createRandomNums(Supplier<Integer> sup){
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i< 10; i++){
            al.add(sup.get());
        }
        return al;
    }


    public static void main(String [] args){

        ArrayList<Integer> intList = createRandomNums(()-> 1);
        System.out.println(intList);

    }
}
