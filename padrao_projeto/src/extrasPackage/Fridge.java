package extrasPackage;

import cozyConePackage.Cone;

public class Fridge extends ConeDecorator {

    public Fridge(Cone cone) {
        super(cone);
    }

    @Override
    public double getPrice() {
        return cone.getPrice() + 40.00;
    }
}
