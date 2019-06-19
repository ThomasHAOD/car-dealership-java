import CarDealership.Cars.Prius;
import CarDealership.Components.Engine;
import CarDealership.Components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriusTest {

    Prius prius;
    Engine engine;
    Tyre tyre;

    @Before
    public void before(){
        engine = new Engine("Hybrid", 10.00);
        tyre = new Tyre("Rubber", 10.00);
        prius = new Prius(12000.50, "Silver", engine, tyre);

    }

    @Test
    public void canGetPrice(){
        assertEquals(12000.50, prius.getPrice(), 0.01);
    }

    @Test
    public void canGetColour(){
        assertEquals("Silver", prius.getColour());
    }

    @Test
    public void canGetTyreModel(){
        assertEquals("Rubber", prius.getTyreModel());
    }


}