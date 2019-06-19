package CarDealership.Cars;

import CarDealership.Components.Component;
import CarDealership.Components.Engine;

import java.util.ArrayList;

public abstract class Car {

    private double price;
    private String colour;
    private ArrayList<Component> components;

    public Car(double price, String colour){
        this.price = price;
        this.colour = colour;
        this.components = new ArrayList<Component>();
    }

    public double getPrice(){
        return this.price;
    };

    public String getColour(){
        return this.colour;
    }

    public int getNumOfComponents(){
        return this.components.size();
    }

    public void addComponent(Component component){
        this.components.add(component);
    }
}
