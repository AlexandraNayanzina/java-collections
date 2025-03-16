package org.naianzina.javacollections.generics;

public class ParametrizedClassExample {
    public static void main(String [] args){

        MyGenericClass <String> genIsString = new MyGenericClass<>("Hello");
        System.out.println(genIsString);

        MyGenericClass <Integer> getInt = new MyGenericClass<>(5);
        System.out.println(genIsString);

    }
}

class MyGenericClass <T> {
    private T value;

    public MyGenericClass(T val){
        this.value = val;
    }

    public String toString(){
        return "Value: " + value;
    }

}
