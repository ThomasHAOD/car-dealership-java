package CarDealership;

import CarDealership.Cars.Tesla;
import CarDealership.Components.Engine;
import CarDealership.Components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TillTest {

    Till till;
    Tesla tesla;
    Engine engine;
    Tyre tyre;

    @Before
    public void before(){
        till = new Till(10000.00);
        engine = new Engine("Electric", 10.00);
        tyre = new Tyre("Rubber", 10.00);
        tesla = new Tesla(45000.00, "Silver", engine, tyre);
    }

    @Test
    public void canGetBalance(){
        assertEquals(10000.00, till.getBalance(), 0.01);
    }

    @Test
    public void canAddCash(){
        till.addCash(tesla);
        assertEquals(55000.00, till.getBalance(), 0.01);
    }

}