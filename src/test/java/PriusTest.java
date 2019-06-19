import CarDealership.Cars.Prius;
import CarDealership.Components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriusTest {

    Prius prius;
    Engine engine;

    @Before
    public void before(){
        prius = new Prius(12000.50, "Silver");
        engine = new Engine("Hybrid");
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
    public void canAddComponent(){
        prius.addComponent(engine);
        assertEquals(1, prius.getNumOfComponents());
    }

}