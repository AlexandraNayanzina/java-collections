package org.naianzina.zaurcourse.collections.lambda;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateExample {

    public static void main(String [] args){

        Food f1 = new Food("apple", 3);
        Food f2 = new Food("chocolate", 15);
        Food f3 = new Food("butter", 12);
        Food f4 = new Food("bread", 5);
        Food f5 = new Food("cheese", 30);
        Food f6 = new Food("meat", 50);

        ArrayList<Food> foodList = new ArrayList<>();
        foodList.add(f1);
        foodList.add(f2);
        foodList.add(f3);
        foodList.add(f4);
        foodList.add(f5);
        foodList.add(f6);

        System.out.println("--- Initial list:  ---");
        for(Food f: foodList){
            System.out.println(f);
        }
        FoodInfo fInfo = new FoodInfo();

        System.out.println("--- Food with price > 40  ---");
        fInfo.testFood(foodList, f-> f.price > 40);

        System.out.println("--- Food with name started on 'a'  ---");
        fInfo.testFood(foodList, f-> f.name.startsWith("a"));

        System.out.println("--- Food with price > 40  ---");
        fInfo.testFood(foodList, f-> f.name.contains("ee"));

        Predicate<Food> p1 = f-> f.price < 10;
        System.out.println("--- Food with price < 10  ---");
        fInfo.testFood(foodList, p1);


    }

}

class FoodInfo{
    void testFood(ArrayList<Food> fList, Predicate<Food> predicate){
        for(Food elem: fList){
            if(predicate.test(elem)){
                System.out.println(elem);
            }
        }
    }
}

class Food{
    String name;
    int price;

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food: " +
                "name='" + name + '\'' +
                ", price=" + price;
    }
}
