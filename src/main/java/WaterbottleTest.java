import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterbottleTest {

    Waterbottle waterbottle;

    @Before
    public void before(){
        waterbottle = new Waterbottle(100);
    }

    @Test
    public void startingVolume(){
        assertEquals(100, waterbottle.getVolume());
        }

    @Test
    public void drinkingDepletesVolume(){
        assertEquals(90, waterbottle.drinkingWater());
    }

    @Test
    public void canMakeVolumeZero(){
        assertEquals(0, waterbottle.emptyWater());
    }

    @Test
    public void canResetVolume(){
        assertEquals(100, waterbottle.resetVolume());
    }

}
