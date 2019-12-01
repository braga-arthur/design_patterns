package testsPackage;

import cozyConePackage.SingletonCozyCone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SingletonCozyConeTest {

    private SingletonCozyCone cozyCone;

    @BeforeEach
    public void setUp(){
        cozyCone = SingletonCozyCone.getInstance();
    }

    @Test
    public void getNullInstanceTest(){
        assertTrue(cozyCone != null);
    }

    @Test
    public void isFullTest(){
        assertFalse(cozyCone.isFlagFull());
    }

    @Test
    public void isFlagFullTest(){
        assertFalse(cozyCone.isFlagFull());
    }

}
