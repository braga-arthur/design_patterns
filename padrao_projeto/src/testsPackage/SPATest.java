package testsPackage;

import cozyConePackage.Cone;
import cozyConePackage.DailySimpleCone;
import cozyConePackage.User;
import extrasPackage.SPA;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class SPATest {

    private Cone cone;
    private User user;
    private SPA spa;

    @BeforeEach
    public void setUp(){
        user = new User("Lucas");
        cone = new DailySimpleCone(user);
        spa = new SPA(cone);
    }

    @Test
    public void getPriceTest(){
        assertEquals(spa.getPrice(), 600.00);
    }

    @Test
    public void getWrongPriceTest(){
        assertNotEquals(spa.getPrice(), 660.00);
    }
}
