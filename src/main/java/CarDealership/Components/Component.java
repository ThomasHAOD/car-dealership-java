package CarDealership.Components;

public abstract class Component {

    String model;

    public Component(String model){
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }
}
