package extrasPackage;

import cozyConePackage.Cone;

public class Breakfast extends ConeDecorator {

    public Breakfast(Cone cone) {
        super(cone);
    }

    @Override
    public double getPrice() {
        return cone.getPrice() + 20.00;
    }
}
