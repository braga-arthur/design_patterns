package extrasPackage;

import cozyConePackage.Cone;
import cozyConePackage.User;

public class Breakfast extends ConeDecorator {

    public Breakfast(Cone cone) {
        super(cone);
    }

    @Override
    public double getPrice() {
        return cone.getPrice() + 20.00;
    }

    @Override
    public User getUser() {
        return cone.getUser();
    }
}
