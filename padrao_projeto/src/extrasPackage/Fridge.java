package extrasPackage;

import cozyConePackage.Cone;

public class Fridge extends ConeDecorator {

    Fridge(Cone cone) {
        super(cone);
    }

    @Override
    public double getPrice() {
        return cone.getPrice() + 40.00;
    }
}
