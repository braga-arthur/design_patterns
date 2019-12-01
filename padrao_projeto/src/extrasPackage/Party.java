package extrasPackage;

import cozyConePackage.Cone;
import cozyConePackage.DailySimpleCone;

public class Party extends ConeDecorator {

    public Party(Cone cone) {
        super(cone);
    }

    @Override
    public double getPrice() {
        if (cone instanceof DailySimpleCone) {
            return cone.getPrice() * 1.40;
        }
            return cone.getPrice() * 1.30;
    }
}
