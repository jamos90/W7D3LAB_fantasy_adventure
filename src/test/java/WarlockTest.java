import Players.Magic.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {

    Warlock warlock;

    @Before
    public void setUp(){
        warlock = new Warlock("Gandalf", 95);
    }

    @Test
    public void hasName(){
        assertEquals("Gandalf", warlock.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(95, warlock.getHP());
    }

}
