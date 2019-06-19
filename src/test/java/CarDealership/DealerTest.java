package CarDealership;

import CarDealership.Cars.Tesla;
import CarDealership.Components.Engine;
import CarDealership.Components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DealerTest {

    Dealership dealership;
    Customer customer;
    Till till;
    Dealer dealer;
    Tesla tesla;
    Engine engine;
    Tyre tyre;

    @Before
    public void before(){
        dealership = new Dealership();
        customer = new Customer("Gregory", 60000.00);
        till = new Till(10000.00);
        dealer = new Dealer("Dez");
        engine = new Engine("Electric", 10.00);
        tyre = new Tyre("Rubber", 10.00);
        tesla = new Tesla(45000.00, "Silver", engine, tyre);
        dealership.addCar(tesla);

    }

    @Test
    public void canGetName(){
        assertEquals("Dez", dealer.getName());
    }


    @Test
    public void canSellCar(){
        dealer.sell(tesla, customer, till, dealership);
        assertEquals(55000.00, till.getBalance(), 0.01);
        assertEquals(15000.00, customer.getCash(), 0.01);
        assertEquals(0, dealership.getCarStockLevel(), 0.01);
    }

}