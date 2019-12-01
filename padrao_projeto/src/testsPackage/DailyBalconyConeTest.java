package testsPackage;

import cozyConePackage.DailyBalconyCone;
import cozyConePackage.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DailyBalconyConeTest {

    private DailyBalconyCone dailyBalconyCone;
    private User user;
    private double actualPrice;
    private double wrongPrice;

    @BeforeEach
    public void setUp(){
        user = new User("Samuel");
        dailyBalconyCone = new DailyBalconyCone(user);
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
