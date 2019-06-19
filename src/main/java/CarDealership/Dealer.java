package CarDealership;

import CarDealership.Cars.Car;
import CarDealership.Cars.Tesla;

public class Dealer {

    private String name;

    public Dealer(String name){
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void sell(Car car, Customer customer, Till till) {
        customer.payFor(car);
        till.addCash(car);
    }
}
