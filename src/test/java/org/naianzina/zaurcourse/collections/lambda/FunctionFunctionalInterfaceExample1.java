package org.naianzina.zaurcourse.collections.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionFunctionalInterfaceExample1 {

    Function<Bird, Integer> f = bird-> 4;
    private static int avgAge(List<Bird> birdsList, Function<Bird, Integer> f){
        int result = 0;
        for(Bird b: birdsList){
            result +=f.apply(b);
        }
        return result/birdsList.size();

    }

    public static void main(String [] args){

        ArrayList<Bird> bList = new ArrayList<>();
        Bird b1 = new Bird("calibre", 3);
        Bird b2 = new Bird("flamingo", 3);
        Bird b3 = new Bird("seagull", 3);
        bList.add(b1);
        bList.add(b2);
        bList.add(b3);

        int result = avgAge(bList, bird-> bird.age);
        System.out.println(result);


    }


}


 class Bird{
    String title;
    int age;

     public Bird(String title, int age) {
         this.title = title;
         this.age = age;
     }

     @Override
     public String toString() {
         return "Bird {" +
                 "title='" + title + '\'' +
                 ", age=" + age +
                 '}';
     }
 }