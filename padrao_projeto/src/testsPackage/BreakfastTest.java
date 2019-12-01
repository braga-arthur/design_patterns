package testsPackage;

import cozyConePackage.Cone;
import cozyConePackage.DailySimpleCone;
import cozyConePackage.User;
import extrasPackage.Breakfast;
import extrasPackage.SPA;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class BreakfastTest {

        private Cone cone;
        private User user;
        private Breakfast breakfast;

        @BeforeEach
        public void setUp(){
            user = new User("Lucas");
            cone = new DailySimpleCone(user);
            breakfast = new Breakfast(cone);
        }

        @Test
        public void getPriceTest(){
            assertEquals(breakfast.getPrice(), 500.00);
        }

        @Test
        public void getWrongPriceTest(){
            assertNotEquals(breakfast.getPrice(), 640.00);
        }
}
