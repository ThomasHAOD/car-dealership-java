package CarDealership;

import CarDealership.Cars.Car;
import CarDealership.Cars.Tesla;
import CarDealership.Components.Component;
import CarDealership.Components.Engine;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Car> carStock;
    private ArrayList<Component> components;

    public Dealership(){
        this.carStock = new ArrayList<Car>();
        this.components = new ArrayList<Component>();
    }

    public void addCar(Car car) {
        this.carStock.add(car);
    }

    public int getCarStockLevel() {
        return this.carStock.size();
    }

    public void addComponent(Component component) {
        this.components.add(component);
    }

    public int getComponentStockLevel() {
        return this.components.size();
    }

    public void sellCar(Car car) {
        this.carStock.remove(car);
    }
}
