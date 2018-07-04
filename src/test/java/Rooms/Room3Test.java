package Rooms;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Room3Test {



        Room3 room3;

        @Before
        public void setUp() {
            room3 = new Room3("The Flamin' Forest", "Forest", 7);
        }

        @Test
        public void hasName(){
            assertEquals("The Flamin' Forest", room3.getName());
        }
}
