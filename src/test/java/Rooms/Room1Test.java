package Rooms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Room1Test {

    Room1 room1;

    @Before
    public void setUp() {
        room1 = new Room1("Downstairs Disaster", "Dungeon", 4);
    }

    @Test
    public void hasName(){
        assertEquals("Downstairs Disaster", room1.getName());
    }
}
