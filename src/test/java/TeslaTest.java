import CarDealership.Cars.Tesla;
import CarDealership.Components.Engine;
import CarDealership.Components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TeslaTest {

    Tesla tesla;
    Tyre tyre;
    Engine engine;

    @Before
    public void before(){
        tyre = new Tyre("Rubber");
        engine = new Engine("Electric");
        tesla = new Tesla(30000.04, "Blue", engine, tyre);

    }

    @Test
    public void canGetPrice(){
        assertEquals(30000.04, tesla.getPrice(), 0.01);
    }

    @Test
    public void canGetEngineModel(){
        assertEquals("Electric", tesla.getEngineModel());
    }
}
