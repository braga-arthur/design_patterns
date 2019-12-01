package testsPackage;

import cozyConePackage.Cone;
import cozyConePackage.DailyBalconyCone;
import cozyConePackage.DailySimpleCone;
import cozyConePackage.User;
import extrasPackage.Breakfast;
import extrasPackage.Party;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class PartyTest {

    private Cone cone;
    private User user;
    private Party party;

    @BeforeEach
    public void setUp(){
        user = new User("Alejandro");
        cone = new DailyBalconyCone(user);
        party = new Party(cone);
    }

    @Test
    public void getPriceTest(){
        assertEquals(party.getPrice(), 806.00);
    }

    @Test
    public void getWrongPriceTest(){
        assertNotEquals(party.getPrice(), 672.00);
    }
}
