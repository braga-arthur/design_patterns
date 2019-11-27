package applicationPackage;

import cozyConePackage.Cone;
import cozyConePackage.ConeFactory;
import cozyConePackage.ConeTypes;

public class Main {

    public static void main(String[] args) {

        ConeFactory coneFactory = new ConeFactory();

        Cone cone1 = coneFactory.getCone(ConeTypes.BALCONY_CONE);
        Cone cone2 = coneFactory.getCone(ConeTypes.SIMPLE_CONE);
    }
}