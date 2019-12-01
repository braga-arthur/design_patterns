package testsPackage;

import cozyConePackage.Cone;
import cozyConePackage.DailyBalconyCone;
import cozyConePackage.User;
import extrasPackage.Fridge;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class FridgeTest {

    private Cone cone;
    private User user;
    private Fridge fridge;

    @BeforeEach
    public void setUp(){
        user = new User("Isabela");
        cone = new DailyBalconyCone(user);
        fridge = new Fridge(cone);
    }

    @Test
    public void getPriceTest(){
        assertEquals(fridge.getPrice(), 660.00);
    }

    @Test
    public void getWrongPriceTest(){
        assertNotEquals(fridge.getPrice(), 520.00);
    }
}
