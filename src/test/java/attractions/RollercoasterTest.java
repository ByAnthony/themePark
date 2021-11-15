package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canUseRollerCoaster(){
        visitor = new Visitor(26, 170, 20.0);
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void canNotUseRollerCoaster(){
        visitor = new Visitor(8, 130, 20.0);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void canChargeRollerCoasterDouble(){
        visitor = new Visitor(26, 201, 20.0);
        assertEquals(16.8, rollerCoaster.priceFor(visitor), 0.1);
    }

    @Test
    public void canChargeRollerCoasterNotDouble(){
        visitor = new Visitor(26, 145, 20.0);
        assertEquals(8.4, rollerCoaster.priceFor(visitor), 0.1);
    }
}
