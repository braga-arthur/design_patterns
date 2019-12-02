package applicationPackage;

import cozyConePackage.*;
import exceptionPackage.InvalidConeInstanceException;
import observerPackage.FlagObserver;
import observerPackage.Subject;

public class Main {

    public static void main(String[] args) {

        ConeFactory coneFactory = new ConeFactory();
        User user1 = new User("Joselito");
        User user2 = new User("Maquinhos");

        try {
            Cone cone1 = coneFactory.getCone(ConeTypes.DAILY_BALCONY_CONE, user1);
            Cone cone2 = coneFactory.getCone(ConeTypes.DAILY_SIMPLE_CONE, user2);
        } catch (InvalidConeInstanceException e){
            System.out.println("Invalid type of cone");
        }

        Subject subject = new Subject();
        new FlagObserver(subject);

        subject.setState(SingletonCozyCone.getInstance().isFlagFull());
    }
}
