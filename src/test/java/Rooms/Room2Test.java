package Rooms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Room2Test {


    Room2 room2;

    @Before
    public void setUp() {
        room2 = new Room2("Upstairs Disaster", "Loft", 3);
    }

    @Test
    public void hasName(){
        assertEquals("Upstairs Disaster", room2.getName());
    }
}

