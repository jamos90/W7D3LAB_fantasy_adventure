import Players.Magic.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;

    @Before
    public void setUp(){
        wizard = new Wizard("Dumbledore", 100);
    }

    @Test
    public void hasName(){
        assertEquals("Dumbledore", wizard.getName());
    }

    @Test
    public void hasHP(){
        assertEquals(100, wizard.getHP());
    }

}
