package org.naianzina.zaurcourse.collections.lambda;

import java.util.ArrayList;
import java.util.function.Supplier;

public class SupplierExample {

    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier){

        ArrayList<Car> al = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            al.add(carSupplier.get());
        }
        return al;
    }


    public static void main(String [] args){

        ArrayList<Car> ourCars = createThreeCars(()-> new Car("Nissan", "red", 7.5));
        for(Car c: ourCars){
            System.out.println(c);
        }


    }


}


class Car{
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car {" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}