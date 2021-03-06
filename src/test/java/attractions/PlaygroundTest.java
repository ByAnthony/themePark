package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitor;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canUsePlayground(){
        visitor = new Visitor(18, 170, 20.0);
        assertEquals(true, playground.isAllowedTo(visitor));
    }

    @Test
    public void canNotUsePlayground(){
        visitor = new Visitor(8, 170, 20.0);
        assertEquals(false, playground.isAllowedTo(visitor));
    }
}
