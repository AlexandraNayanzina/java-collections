package org.naianzina.javacollections.streamapi;

import java.util.ArrayList;
import java.util.List;

public class ForEachExample {

    public static void main(String[] args) {

        List<Car> carsList = new ArrayList<Car>();
        carsList.add(new Car("Nissan", "blue", 8.0));
        carsList.add(new Car("Toyota", "red", 8.0));
        carsList.add(new Car("Ford", "black", 7.0));

        // traditional forEach() loop
        System.out.println("Traditional forEach() loop");

        for(Car car: carsList){
        System.out.println(car.toString());
    }

    // using foreach() with lambda
        System.out.println("forEach() using lambda");
        carsList.forEach(car-> System.out.println(car));
        carsList.forEach(car-> System.out.println("The car -> " + car));

        carsList.forEach(car-> {
            if (car.model.equals("Nissan")){
                carsList.remove(car);
            }
        });

    }
}


class Car{
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine){
        this.color = color;
        this.engine = engine;
        this.model = model;
    }

    public String toString(){
        return "The car model: " + model + ", color: " + color + ", engine " + engine;
    }

}
