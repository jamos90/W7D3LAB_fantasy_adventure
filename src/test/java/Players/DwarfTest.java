package Players;

import Players.Fighters.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    Dwarf dwarf;

    @Before
    public void setUp(){
        dwarf = new Dwarf("Gimli", 80);
    }

    @Test
    public void hasName(){
        assertEquals("Gimli", dwarf.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(80, dwarf.getHP());
    }

}
