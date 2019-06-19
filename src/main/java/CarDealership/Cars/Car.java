package CarDealership.Cars;

import CarDealership.Components.Component;
import CarDealership.Components.Engine;
import CarDealership.Components.Tyre;

import java.util.ArrayList;

public abstract class Car {

    private double price;
    private String colour;
    private Engine engine;
    private Tyre tyre;

    public Car(double price, String colour, Engine engine, Tyre tyre){
        this.price = price;
        this.colour = colour;
        this.engine = engine;
        this.tyre = tyre;
    }

    public double getPrice(){
        return this.price;
    };

    public String getColour(){
        return this.colour;
    }

    public String getEngineModel(){
        return this.engine.getModel();
    }

    public String getTyreModel(){
        return this.tyre.getModel();
    }

//    public int getNumOfComponents(){
//        return this.components.size();
//    }
//
//    public void addComponent(Component component){
//        this.components.add(component);
//    }
}
