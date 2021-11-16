import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void setUp(){
        waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume100(){
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drink10EachSip(){
        assertEquals(90, waterBottle.drink());
        assertEquals(80, waterBottle.drink());
        assertEquals(70, waterBottle.drink());
    }

    @Test
    public void fillBottleTo100(){
        waterBottle.drink();
        assertEquals(80, waterBottle.drink());
        assertEquals(100, waterBottle.fillBottle());
    }

    @Test
    public void emptyBottleTo0(){
        assertEquals(100, waterBottle.getVolume());
        assertEquals(0, waterBottle.emptyBottle());
    }
}
