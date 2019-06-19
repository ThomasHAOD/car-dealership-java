package CarDealership;

import CarDealership.Cars.Car;
import CarDealership.Cars.Tesla;

public class Customer {

    private String name;
    private double cash;


    public Customer(String name, double cash){
        this.name = name;
        this.cash = cash;
    }


    public String getName() {
        return this.name;
    }

    public double getCash() {
        return cash;
    }

    public void payFor(Car car) {
        this.cash -= car.getPrice();

    }
}
