package extrasPackage;

import cozyConePackage.Cone;
import cozyConePackage.User;

public class SPA extends ConeDecorator {

    public SPA(Cone cone) {
        super(cone);
    }

    @Override
    public double getPrice() {
        return cone.getPrice() + 120.00;
    }

    @Override
    public User getUser() {
        return cone.getUser();
    }
}
