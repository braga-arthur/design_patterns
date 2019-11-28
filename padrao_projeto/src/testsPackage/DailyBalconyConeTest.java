package testsPackage;

import cozyConePackage.DailyBalconyCone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DailyBalconyConeTest {

    private DailyBalconyCone dailyBalconyCone;
    private double actualPrice;
    private double wrongPrice;

    @BeforeEach
    public void setUp(){
        dailyBalconyCone = new DailyBalconyCone();
        actualPrice = 620.00;
        wrongPrice = 480.00;
    }

    @Test
    public void getPriceTest(){
        assertEquals(dailyBalconyCone.getPrice(), actualPrice);
    }

    @Test
    public void getPriceWrongTest(){
        assertNotEquals(dailyBalconyCone.getPrice(), wrongPrice);
    }
}
