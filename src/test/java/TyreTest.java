import CarDealership.Components.Tyre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TyreTest {

    Tyre tyre;

    @Before
    public void before(){
        tyre = new Tyre("Snow");
    }

    @Test
    public void canGetModel(){
        assertEquals("Snow", tyre.getModel());
    }
}
