package extrasPackage;

import cozyConePackage.Cone;
import cozyConePackage.User;

public class Fridge extends ConeDecorator {

    public Fridge(Cone cone) {
        super(cone);
    }

    @Override
    public double getPrice() {
        return cone.getPrice() + 40.00;
    }

    @Override
    public User getUser() {
        return cone.getUser();
    }


}
