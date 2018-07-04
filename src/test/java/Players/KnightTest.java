package Players;

import Players.Fighters.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


    public class KnightTest {
        Knight knight;

        @Before
        public void setUp(){
            knight = new Knight("Sir Galahad", 70);
        }

        @Test
        public void hasName(){
            assertEquals("Sir Galahad", knight.getName());
        }

        @Test
        public void hasHP(){
            assertEquals(70, knight.getHP());
        }

    }


