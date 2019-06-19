package CarDealership;

import CarDealership.Cars.Tesla;
import CarDealership.Components.Engine;
import CarDealership.Components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    Customer customer;
    Tesla tesla;
    Engine engine;
    Tyre tyre;

    @Before
    public void before(){
        customer = new Customer("Hank", 50000.00);
        engine = new Engine("Electric");
        tyre = new Tyre("Rubber");
        tesla = new Tesla(45000.00, "Silver", engine, tyre);

    }

    @Test
    public void canGetName(){
        assertEquals("Hank", customer.getName());
    }

    @Test
    public void getCash() {
        assertEquals(50000.00, customer.getCash(), 0.01);
    }

    @Test
    public void canPay(){
        customer.payFor(tesla);
        assertEquals(5000.00, customer.getCash(), 0.01);
    }
}