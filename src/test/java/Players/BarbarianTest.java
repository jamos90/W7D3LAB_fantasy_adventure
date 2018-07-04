package Players;

import Players.Fighters.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

        Barbarian barbarian;

        @Before
        public void setUp(){
            barbarian = new Barbarian("Conan", 90);
        }

        @Test
        public void hasName(){
            assertEquals("Conan", barbarian.getName());
        }

        @Test
        public void hasHP(){
            assertEquals(90, barbarian.getHP());
        }

    }



