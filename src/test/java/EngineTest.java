import CarDealership.Components.Engine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EngineTest {

    Engine engine;

    @Before
    public void before() {
        engine = new Engine("Hybrid", 500.00);
    }

    @Test
    public void canGetModel(){
        assertEquals("Hybrid", engine.getModel());
    }

    @Test
    public void canGetDamage(){
        assertEquals(false, engine.getDamage());
    }

    @Test
    public void canSetDamage(){
        engine.setDamage(true);
        assertEquals(true, engine.getDamage());
    }

    @Test
    public void canGetPriceForRepair(){
        assertEquals(500.00, engine.getPriceForRepair(), 0.01);
    }
}
