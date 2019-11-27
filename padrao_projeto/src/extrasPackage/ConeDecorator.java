package extrasPackage;

import cozyConePackage.Cone;

public abstract class ConeDecorator implements Cone {

    protected Cone cone;

    ConeDecorator(Cone cone){
        this.cone = cone;
    }

    public abstract double getPrice();
}
