package testsPackage;

import cozyConePackage.DailySimpleCone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DailySimpleConeTest {

    private DailySimpleCone dailySimpleCone;
    private double actualPrice;
    private double wrongPrice;

    @BeforeEach
    public void setUp(){
        dailySimpleCone = new DailySimpleCone();
        actualPrice = 480.00;
        wrongPrice = 620.00;
    }

    @Test
    public void getPriceTest(){
        assertEquals(dailySimpleCone.getPrice(), actualPrice);
    }

    @Test
    public void getPriceWrongTest(){
        assertNotEquals(dailySimpleCone.getPrice(), wrongPrice);
    }
}
