package testsPackage;

import cozyConePackage.SingletonCozyCone;
import observerPackage.FlagObserver;
import observerPackage.Subject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ObserverTest {


    private Subject subject;

    @BeforeEach
    public void setUp(){
        subject = new Subject();
        new FlagObserver(subject);
    }

    @Test
    public void isFlagFull(){
        subject.setState(SingletonCozyCone.getInstance().isFlagFull());
        assertFalse(subject.getState());
    }
}
