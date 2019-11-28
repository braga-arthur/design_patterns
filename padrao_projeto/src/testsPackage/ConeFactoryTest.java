package testsPackage;

import cozyConePackage.ConeFactory;
import cozyConePackage.ConeTypes;
import cozyConePackage.DailyBalconyCone;
import cozyConePackage.DailySimpleCone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.lang.model.type.NullType;

import static org.junit.jupiter.api.Assertions.*;

public class ConeFactoryTest {

    private ConeFactory coneFactory;

    @BeforeEach
    public void setUp(){
        coneFactory = new ConeFactory();
    }

    @Test
    public void getDailyBalconyConeTest(){
        assertTrue(coneFactory.getCone(ConeTypes.DAILY_BALCONY_CONE) instanceof DailyBalconyCone);
    }

    @Test
    public void getDailySimpleConeTest(){
        assertTrue(coneFactory.getCone(ConeTypes.DAILY_SIMPLE_CONE) instanceof DailySimpleCone);
    }

    @Test
    public void getDailyBalconyConeNullTest(){
        assertFalse(coneFactory.getCone(ConeTypes.DAILY_BALCONY_CONE) instanceof NullType);
    }

    @Test
    public void getDailySimpleConeNullTest(){
        assertFalse(coneFactory.getCone(ConeTypes.DAILY_SIMPLE_CONE) instanceof NullType);
    }


}
