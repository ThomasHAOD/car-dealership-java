package CarDealership.Components;

public abstract class Component {

    String model;
    Boolean damage;
    double priceForRepair;

    public Component(String model, double priceForRepair){
        this.model = model;
        this.damage = false;
        this.priceForRepair = priceForRepair;
    }

    public String getModel() {
        return this.model;
    }

    public Boolean getDamage(){
        return this.damage;
    }

    public void setDamage(Boolean damage){
        this.damage = damage;
    }

    public double getPriceForRepair() {
        return this.priceForRepair;
    }
}
