package org.naianzina.zaurcourse.collections.lambda;

import java.util.ArrayList;

public class AnimalInfo {

    public static void main(String[] args) {


        Animal a1 = new Animal("Bear", 4);
        Animal a2 = new Animal("Fox", 3);
        Animal a3 = new Animal("Beaver", 1);
        Animal a4 = new Animal("Snake", 2);

        ArrayList<Animal> animalList = new ArrayList<>();
        animalList.add(a1);
        animalList.add(a2);
        animalList.add(a3);
        animalList.add(a4);

        for(Animal a: animalList){
            System.out.println(a);
        }

        System.out.println("______________");

        AnimalInfo aInfo = new AnimalInfo();
        aInfo.printAnimal(animalList, a-> a.age>=3);
    }

    void printAnimal(ArrayList<Animal> aList, AnimalCheck animalCheck){
        for(Animal a:aList){
            if(animalCheck.check(a)){
                System.out.println(a);
            }
        }
    }
}

interface AnimalCheck{
    boolean check(Animal a);
}