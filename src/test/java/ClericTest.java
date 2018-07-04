import Players.Healers.Cleric;
import Players.Magic.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;

    @Before
    public void setUp(){
        cleric = new Cleric("Dr. James", 100);
    }

    @Test
    public void hasName(){
        assertEquals("Dr. James", cleric.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(100, cleric.getHP());
    }

}
