package applicationPackage;

import cozyConePackage.Cone;
import cozyConePackage.ConeFactory;
import cozyConePackage.ConeTypes;
import observer.FlagObserver;
import observer.Subject;

public class Main {

    public static void main(String[] args) {

        ConeFactory coneFactory = new ConeFactory();

        Cone cone1 = coneFactory.getCone(ConeTypes.DAILY_BALCONY_CONE);
        Cone cone2 = coneFactory.getCone(ConeTypes.DAILY_SIMPLE_CONE);

        Subject subject = new Subject();
        new FlagObserver(subject);
    }
}
