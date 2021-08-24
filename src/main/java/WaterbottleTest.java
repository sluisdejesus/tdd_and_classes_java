import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterbottleTest {

    Waterbottle waterbottle;

    @Before
    public void before(){
        waterbottle = new Waterbottle();
    }

    @Test
    public void startingAt100(){
        assertEquals(100, waterbottle.getVolume());
        }

    @Test
    public void drinkingDepletesVolume(){
        waterbottle.drinkingWater();
        assertEquals(90, waterbottle.getVolume());
    }

    @Test
    public void canMakeVolumeZero(){
        waterbottle.emptyWater();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void canResetVolume(){
        waterbottle.resetVolume();
        assertEquals(100, waterbottle.getVolume());
    }

}
