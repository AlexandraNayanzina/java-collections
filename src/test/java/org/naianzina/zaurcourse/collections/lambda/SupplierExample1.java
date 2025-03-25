package org.naianzina.zaurcourse.collections.lambda;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierExample1 {

    public static ArrayList<Flower> createListOPfFlowers(Supplier<Flower> flowerSupplier){
        ArrayList<Flower> fList = new ArrayList<>();
        for(int i=0; i < 4; i++){
            fList.add(flowerSupplier.get());
        }
        return fList;
    }

    public static void main(String [] args){

       ArrayList<Flower> fList = createListOPfFlowers(()-> new Flower("rose", "type roses"));
fList.forEach(System.out::println);


    }
}


class Flower{
    String name;
    String type;

    public Flower(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
