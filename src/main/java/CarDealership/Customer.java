package CarDealership;

import CarDealership.Cars.Car;
import CarDealership.Cars.Tesla;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double cash;
    private ArrayList<Car> garage;


    public Customer(String name, double cash){
        this.name = name;
        this.cash = cash;
        this.garage = new ArrayList<Car>();
    }


    public String getName() {
        return this.name;
    }

    public double getCash() {
        return cash;
    }

    public void payFor(Car car) {
        this.cash -= car.getPrice();
        addCarToGarage(car);

    }

    public void addCarToGarage(Car car) {
        this.garage.add(car);

    }

    public int getNumberOfCars() {
        return this.garage.size();
    }
}
