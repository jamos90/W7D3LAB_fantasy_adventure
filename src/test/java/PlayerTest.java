import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Player player;

    @Before
    public void setUp(){
        player = new Player("Ben", 100);
    }

    @Test
    public void hasName(){
        assertEquals("Ben", player.getName());
    }


}
