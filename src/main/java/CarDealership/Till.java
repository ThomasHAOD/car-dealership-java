package CarDealership;

import CarDealership.Cars.Car;
import CarDealership.Cars.Tesla;

public class Till {

    private double balance;

    public Till(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void addCash(Car car) {
        this.balance += car.getPrice();
    }
}
