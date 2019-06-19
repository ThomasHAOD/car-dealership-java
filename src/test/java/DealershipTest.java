import CarDealership.Cars.Prius;
import CarDealership.Cars.Tesla;
import CarDealership.Components.Engine;
import CarDealership.Components.Tyre;
import CarDealership.Dealership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Tesla tesla;
    Prius prius;
    Engine engine;
    Tyre tyre;

    @Before
    public void before(){
        dealership = new Dealership();
        engine = new Engine("Electric", 10.00);
        tyre = new Tyre("Racing", 10.00);
        tesla = new Tesla(5000.00, "Silver", engine, tyre);
        prius = new Prius(4000.00, "Silver", engine, tyre);
    }

    @Test
    public void canAddCars(){
        dealership.addCar(tesla);
        assertEquals(1, dealership.getCarStockLevel());
    }

    @Test
    public void canAddComponents(){
        dealership.addComponent(engine);
        assertEquals(1, dealership.getComponentStockLevel());
    }

    @Test
    public void canSellCar(){
        dealership.addCar(tesla);
        dealership.sellCar(tesla);
        assertEquals(0, dealership.getCarStockLevel());
    }

}
