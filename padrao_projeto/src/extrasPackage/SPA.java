package extrasPackage;

import cozyConePackage.Cone;

public class SPA extends ConeDecorator {

    SPA(Cone cone) {
        super(cone);
    }

    @Override
    public double getPrice() {
        return cone.getPrice() + 120.00;
    }
}
