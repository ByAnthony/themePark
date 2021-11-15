package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void canChargeDodgemHalfPrice(){
        visitor = new Visitor(11, 201, 20.0);
        assertEquals(2.25, dodgems.priceFor(visitor), 0.1);
    }

    @Test
    public void canChargeDodgemNormalPrice(){
        visitor = new Visitor(26, 145, 20.0);
        assertEquals(4.5, dodgems.priceFor(visitor), 0.1);
    }
}
