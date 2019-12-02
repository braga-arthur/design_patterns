package testsPackage;

import cozyConePackage.*;
import exceptionPackage.InvalidConeInstanceException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.lang.model.type.NullType;

import static org.junit.jupiter.api.Assertions.*;

public class ConeFactoryTest {

    private ConeFactory coneFactory;
    private User user;

    @BeforeEach
    public void setUp(){
        coneFactory = new ConeFactory();
        user = new User("José");
    }

    @Test
    public void getDailyBalconyConeTest() throws InvalidConeInstanceException {
        assertTrue(coneFactory.getCone(ConeTypes.DAILY_BALCONY_CONE, user) instanceof DailyBalconyCone);
    }

    @Test
    public void getDailySimpleConeTest() throws InvalidConeInstanceException {
        assertTrue(coneFactory.getCone(ConeTypes.DAILY_SIMPLE_CONE, user) instanceof DailySimpleCone);
    }

    @Test
    public void getDailyBalconyConeNullTest() throws InvalidConeInstanceException {
        assertFalse(coneFactory.getCone(ConeTypes.DAILY_BALCONY_CONE, user) instanceof NullType);
    }

    @Test
    public void getDailySimpleConeNullTest() throws InvalidConeInstanceException {
        assertFalse(coneFactory.getCone(ConeTypes.DAILY_SIMPLE_CONE, user) instanceof NullType);
    }


}
