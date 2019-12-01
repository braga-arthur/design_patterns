package cozyConePackage;

import exceptionPackage.InvalidConeInstanceExpection;

public class ConeFactory {

    private Cone cone;

    public Cone getCone(ConeTypes type, User user) throws InvalidConeInstanceExpection {

        switch (type) {
            case DAILY_BALCONY_CONE:
                cone = new DailyBalconyCone(user);
                break;
            default:
                cone = new DailySimpleCone(user);
                break;
        }
        return cone;
    }
}