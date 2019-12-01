package testsPackage;

import cozyConePackage.*;
import exceptionPackage.InvalidConeInstanceExpection;
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
    public void getDailyBalconyConeTest() throws InvalidConeInstanceExpection {
        assertTrue(coneFactory.getCone(ConeTypes.DAILY_BALCONY_CONE, user) instanceof DailyBalconyCone);
    }

    @Test
    public void getDailySimpleConeTest() throws InvalidConeInstanceExpection {
        assertTrue(coneFactory.getCone(ConeTypes.DAILY_SIMPLE_CONE, user) instanceof DailySimpleCone);
    }

    @Test
    public void getDailyBalconyConeNullTest() throws InvalidConeInstanceExpection {
        assertFalse(coneFactory.getCone(ConeTypes.DAILY_BALCONY_CONE, user) instanceof NullType);
    }

    @Test
    public void getDailySimpleConeNullTest() throws InvalidConeInstanceExpection {
        assertFalse(coneFactory.getCone(ConeTypes.DAILY_SIMPLE_CONE, user) instanceof NullType);
    }


}
